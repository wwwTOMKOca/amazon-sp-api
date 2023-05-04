import os
import subprocess
import shutil

# Get the script's directory path
script_dir = os.path.dirname(os.path.abspath(__file__))
project_root = os.path.abspath(os.path.join(script_dir, '..', '..', '..'))

# Configuration variables (using relative paths)
models_path = os.path.join(project_root, "src", "main", "resources", "selling-partner-api-models", "models")
output_path = os.path.join(project_root, "java_sdk_output")
swagger_codegen_path = os.path.join(project_root, "src", "main", "resources", "swagger-codegen-cli.jar")
api_package_name = "com.amazon.spapi.api"
model_package_name = "com.amazon.spapi.model"


def log(message):
    print(f">> {message}")
    with open("generate_java_sdk.log", "a") as log_file:
        log_file.write(f">> {message}\n")


def generate_java_sdk(models_path, swagger_codegen_path, output_path, api_package_name, model_package_name):
    log("Generating Java SDK...")
    model_subpackages = {}
    for root, _, files in os.walk(models_path):
        sorted_files = sorted(files, reverse=True)
        for file in sorted_files:
            if file.endswith(".json"):
                json_file = os.path.join(root, file)
                output_directory = os.path.join(output_path, os.path.splitext(file)[0])

                if not os.path.exists(output_directory):
                    os.makedirs(output_directory)

                model_subpackage = os.path.relpath(root, models_path).replace(os.path.sep, '.')
                model_subpackages[os.path.splitext(file)[0]] = model_subpackage
                
                log(f"Processing {file}...")
                with open("generate_java_sdk.log", "a") as log_file:
                    subprocess.run([
                        "java",
                        "-jar",
                        swagger_codegen_path,
                        "generate",
                        "-i", json_file,
                        "-l", "java",
                        "--api-package", api_package_name,
                        "--model-package", f"{model_package_name}.{model_subpackage}",
                        "-o", output_directory
                    ], stdout=log_file, stderr=log_file)
                break
    return model_subpackages


def create_new_java_project_structure(base_path):
    log("Creating new Java project structure...")
    main_path = os.path.join(base_path, "src", "main")
    test_path = os.path.join(base_path, "src", "test")

    main_java_path = os.path.join(main_path, "java")
    main_resources_path = os.path.join(main_path, "resources")
    test_java_path = os.path.join(test_path, "java")
    test_resources_path = os.path.join(test_path, "resources")

    if not os.path.exists(main_java_path):
        os.makedirs(main_java_path)

    if not os.path.exists(main_resources_path):
        os.makedirs(main_resources_path)

    if not os.path.exists(test_java_path):
        os.makedirs(test_java_path)

    if not os.path.exists(test_resources_path):
        os.makedirs(test_resources_path)


def copy_files(src_dir, dest_dir):
    for root, _, files in os.walk(src_dir):
        relative_path = os.path.relpath(root, src_dir)
        target_dir = os.path.join(dest_dir, relative_path)

        if not os.path.exists(target_dir):
            os.makedirs(target_dir)

        for file in files:
            src_file = os.path.join(root, file)
            dest_file = os.path.join(target_dir, file)
            shutil.copy2(src_file, dest_file)


def aggregate_java_files(output_path, new_java_project_path, models_path, model_package_name, model_subpackages):
    log("Aggregating Java files...")
    main_java_path = os.path.join(new_java_project_path, "src", "main", "java")
    main_docs_path = os.path.join(new_java_project_path, "docs")

    for root, dirs, _ in os.walk(output_path):
        for dir in dirs:
            if dir == "src":
                src_dir = os.path.join(root, dir, "main", "java")
                dest_dir = main_java_path
                copy_files(src_dir, dest_dir)

            if dir == "docs":
                docs_dir = os.path.join(root, dir)
                model_subdir_name = model_subpackages[os.path.basename(root)].replace('.', '_')
                dest_docs_subdir = os.path.join(main_docs_path, model_subdir_name.replace('-', '_'))
                copy_files(docs_dir, dest_docs_subdir)


def copy_selling_partner_api_aa(src_dir, dest_dir):
    if os.path.exists(src_dir):
        log("Copying SellingPartnerAPIAA files...")
        copy_files(src_dir, dest_dir)
    else:
        log(f"WARNING: Directory '{src_dir}' not found. Cannot copy SellingPartnerAPIAA files.")


if __name__ == "__main__":
    log("Clearing the contents of ./src/main/java/* and deleting ./src/test and ./docs folders...")
    main_java_path = os.path.join(project_root, "src", "main", "java")
    test_path = os.path.join(project_root, "src", "test")
    docs_path = os.path.join(project_root, "docs")
    
    # Clear the contents of the ./src/main/java/* directory (no need for old content)
    for item in os.listdir(main_java_path):
        item_path = os.path.join(main_java_path, item)
        if os.path.isfile(item_path):
            os.unlink(item_path)
        elif os.path.isdir(item_path):
            shutil.rmtree(item_path)
    
    # Delete the ./src/test folder (no need for old content)
    if os.path.exists(test_path):
        shutil.rmtree(test_path)
        
    # Delete the ./docs folder (no need for old content)
    if os.path.exists(docs_path):
        shutil.rmtree(docs_path)

    # Create the output directory if it doesn't exist
    if not os.path.exists(output_path):
        os.makedirs(output_path)

    model_subpackages = generate_java_sdk(
        models_path,
        swagger_codegen_path,
        output_path,
        os.path.join(api_package_name, "client"),
        model_package_name,
    )

    # Aggregate files to final java structure
    new_java_project_path = project_root  # Generate content directly in the project root
    create_new_java_project_structure(new_java_project_path)
    aggregate_java_files(output_path, new_java_project_path, models_path, model_package_name, model_subpackages)

    # Remove the output directory and its contents after processing
    shutil.rmtree(output_path)
    log("Java SDK generation completed.")

    # Copy the SellingPartnerAPIAA files
    selling_partner_api_aa_src = os.path.join(
        project_root,
        "src",
        "main",
        "resources",
        "selling-partner-api-models",
        "clients",
        "sellingpartner-api-aa-java",
        "src",
        "com",
        "amazon",
        "SellingPartnerAPIAA",
    )
    selling_partner_api_aa_dest = os.path.join(project_root, "src", "main", "java", "com", "amazon", "spapi", "SellingPartnerAPIAA")
    copy_selling_partner_api_aa(selling_partner_api_aa_src, selling_partner_api_aa_dest)   
    log("Copied over SellingPartnerAPIAA (sellingpartner-api-aa-java)")
    log("Done")


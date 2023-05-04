# Amazon Selling Partner API - Java SDK

This repository provides a Java SDK for Amazon's Selling Partner API (SP-API) to help Java developers easily interface with the API. In addition, a Python script is included to generate the Java SDK from scratch whenever Amazon updates their API, so there's no need to wait for this project to be updated to get the latest version.

## Amazon SP-API

The Amazon Selling Partner API (SP-API) enables you to build applications for Amazon sellers and vendors.

- SP-API homepage: https://developer.amazonservices.com
- Documentation: https://developer-docs.amazon.com/sp-api
- Models: https://github.com/amzn/selling-partner-api-models

SP-API uses AWS IAM for integration.

## Java SDK

The Java SDK provides all the necessary classes for interacting with the SP-API. These classes can be regenerated manually, for example, when Amazon updates their API, by using Amazon's provided [models](https://github.com/amzn/selling-partner-api-models) and the [swagger-codegen](https://swagger.io/tools/swagger-codegen/) tool.

Alternatively, you can use the provided Python script to regenerate the SDK in a more automated fashion.

## Steps to Regenerate the Java SDK

You can use the provided [generate_java_sdk.py](https://github.com/wwwTOMKOca/amazon-sp-api/blob/main/src/main/resources/generate_java_sdk.py) script to regenerate all the files in this repository, such as when Amazon updates their API.

Follow these steps to regenerate all classes:

1. **Prepare required files**
   - Either use the provided [swagger-codegen-cli.jar](https://github.com/wwwTOMKOca/amazon-sp-api/blob/main/src/main/resources/swagger-codegen-cli.jar) tool, or download the latest version from [swagger-codegen](https://swagger.io/tools/swagger-codegen/) and place it in the `/src/main/resources` directory.
   - Clone the latest [selling-partner-api-models](https://github.com/amzn/selling-partner-api-models) repository to `/src/main/resources` using `git clone https://github.com/amzn/selling-partner-api-models.git`. These models will be used to generate classes.

2. **Run the Python script**
   - In a terminal session, change the directory to the resources directory with `cd src/main/resources`.
   - Run the [generate_java_sdk.py](https://github.com/wwwTOMKOca/amazon-sp-api/blob/main/src/main/resources/generate_java_sdk.py) script: `python3 generate_java_sdk.py`.
   - The script should automatically update all the required files in this project and place them properly.

   
### Other Notes and Issues

Swagger Codegen may not handle the `additionalProperties` field correctly in some of the provided JSON schemas. This can result in objects with type `ERRORUNKNOWN`, causing issues in some of the generated Java SDK files.

This issue currently affects only these files:

- model/**listings_items_api_model**/ListingsItemPutRequest.java
- model/**listings_items_api_model**/ItemAttributes.java
- model/**listings_items_api_model**/PatchOperation.java
- model/**catalog_items_api_model**/ItemAttributes.java

These files have been manually fixed in the meantime. If anyone has a solution or workaround for this issue, please feel free to contribute or notify me. The issue may be related to outdated or incomplete models provided by Amazon.

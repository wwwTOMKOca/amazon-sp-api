# AMAZON-SP-API
Amazon Selling Partner API - Java SDK


# Intro

Java SDK for Amazon's Selling Partner API (SP-API) to allow Java developers to interface with the API

Provided is a Python script that generates this Java SDK from scratch (see steps below), useful for whenever Amazon updates their API. With this script there is no need to wait for this project to be updated to get latest version!


## Amazon SP-API

About Amazon's Selling Partner API (SP-API). 

SP-API homepage: https://developer.amazonservices.com <br/>
Documentation: https://developer-docs.amazon.com/sp-api <br/>
Models: https://github.com/amzn/selling-partner-api-models <br/>

SP-API uses the AWS IAM to integration


## Java SDK

The Java SDK provides all the necessary classes to do SP API calls

These can be re-generated manually (such as when Amazon's API gets updated) by using Amazon's provided [models](https://github.com/amzn/selling-partner-api-models) along with using  [swagger-codegen](https://swagger.io/tools/swagger-codegen/) tool.

Better yet, you can use the provided Python script to re-generate these in a more automated fashion


## Steps to re-generate Java SDK

You can use the provided [generate_java_sdk.py](https://github.com/wwwTOMKOca/amazon-sp-api/src/main/resources/generate_java_sdk.py) script to re-generate all the files provided here (such as when Amazon updates their API)

Steps to re-generate all classes:

* Prep required files
 * Either use provided [swagger-codegen-cli.jar](https://github.com/wwwTOMKOca/amazon-sp-api/src/main/resources/) tool, or download latest version from [swagger-codegen](https://swagger.io/tools/swagger-codegen/) to `/src/main/resources`
 * Clone the latest [selling-partner-api-models](https://github.com/amzn/selling-partner-api-models) to `/src/main/resources` with `git clone https://github.com/amzn/selling-partner-api-models.git`. These models will be used to generate classes
* Run the python script
 * In terminal session cd into the resources dir `cd src/main/resources`
 * Run the [generate_java_sdk.py](https://github.com/wwwTOMKOca/amazon-sp-api/src/main/resources/generate_java_sdk.py) script: 
   * `python3 generate_java_sdk.py`
 * Script should automatically update all the required files in this project and place them properly 



# VendorDfSandboxApi

All URIs are relative to *https://sandbox.sellingpartnerapi-na.amazon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateOrderScenarios**](VendorDfSandboxApi.md#generateOrderScenarios) | **POST** /vendor/directFulfillment/sandbox/2021-10-28/orders | 


<a name="generateOrderScenarios"></a>
# **generateOrderScenarios**
> TransactionReference generateOrderScenarios(body)



Submits a request to generate test order data for Vendor Direct Fulfillment API entities.

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api_client.VendorDfSandboxApi;


VendorDfSandboxApi apiInstance = new VendorDfSandboxApi();
GenerateOrderScenarioRequest body = new GenerateOrderScenarioRequest(); // GenerateOrderScenarioRequest | 
try {
    TransactionReference result = apiInstance.generateOrderScenarios(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorDfSandboxApi#generateOrderScenarios");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GenerateOrderScenarioRequest**](GenerateOrderScenarioRequest.md)|  |

### Return type

[**TransactionReference**](TransactionReference.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


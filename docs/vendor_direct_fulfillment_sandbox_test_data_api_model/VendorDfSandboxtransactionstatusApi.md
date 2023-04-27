# VendorDfSandboxtransactionstatusApi

All URIs are relative to *https://sandbox.sellingpartnerapi-na.amazon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrderScenarios**](VendorDfSandboxtransactionstatusApi.md#getOrderScenarios) | **GET** /vendor/directFulfillment/sandbox/2021-10-28/transactions/{transactionId} | 


<a name="getOrderScenarios"></a>
# **getOrderScenarios**
> TransactionStatus getOrderScenarios(transactionId)



Returns the status of the transaction indicated by the specified transactionId. If the transaction was successful, also returns the requested test order data.

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api_client.VendorDfSandboxtransactionstatusApi;


VendorDfSandboxtransactionstatusApi apiInstance = new VendorDfSandboxtransactionstatusApi();
String transactionId = "transactionId_example"; // String | The transaction identifier returned in the response to the generateOrderScenarios operation.
try {
    TransactionStatus result = apiInstance.getOrderScenarios(transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorDfSandboxtransactionstatusApi#getOrderScenarios");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionId** | **String**| The transaction identifier returned in the response to the generateOrderScenarios operation. |

### Return type

[**TransactionStatus**](TransactionStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


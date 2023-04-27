# VendorTransactionApi

All URIs are relative to *https://sellingpartnerapi-na.amazon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransaction**](VendorTransactionApi.md#getTransaction) | **GET** /vendor/transactions/v1/transactions/{transactionId} | 


<a name="getTransaction"></a>
# **getTransaction**
> GetTransactionResponse getTransaction(transactionId)



Returns the status of the transaction that you specify.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api_client.VendorTransactionApi;


VendorTransactionApi apiInstance = new VendorTransactionApi();
String transactionId = "transactionId_example"; // String | The GUID provided by Amazon in the 'transactionId' field in response to the post request of a specific transaction.
try {
    GetTransactionResponse result = apiInstance.getTransaction(transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorTransactionApi#getTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionId** | **String**| The GUID provided by Amazon in the &#39;transactionId&#39; field in response to the post request of a specific transaction. |

### Return type

[**GetTransactionResponse**](GetTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


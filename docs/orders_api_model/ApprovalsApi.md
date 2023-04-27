# ApprovalsApi

All URIs are relative to *https://sellingpartnerapi-na.amazon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrderItemsApprovals**](ApprovalsApi.md#getOrderItemsApprovals) | **GET** /orders/v0/orders/{orderId}/approvals | 
[**updateOrderItemsApprovals**](ApprovalsApi.md#updateOrderItemsApprovals) | **POST** /orders/v0/orders/{orderId}/approvals | 


<a name="getOrderItemsApprovals"></a>
# **getOrderItemsApprovals**
> GetOrderApprovalsResponse getOrderItemsApprovals(orderId, nextToken, itemApprovalTypes, itemApprovalStatus)



Returns detailed order items approvals information for the order specified. If NextToken is provided, it&#39;s used to retrieve the next page of order items approvals.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 0.5 | 30 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api_client.ApprovalsApi;


ApprovalsApi apiInstance = new ApprovalsApi();
String orderId = "orderId_example"; // String | An Amazon-defined order identifier, in 3-7-7 format, e.g. 933-1671587-0818628.
String nextToken = "nextToken_example"; // String | A string token returned in the response of your previous request.
List<ItemApprovalType> itemApprovalTypes = Arrays.asList(new ItemApprovalType()); // List<ItemApprovalType> | When set, only return approvals for items which approval type is contained in the specified approval types.
List<ItemApprovalStatus> itemApprovalStatus = Arrays.asList(new ItemApprovalStatus()); // List<ItemApprovalStatus> | When set, only return approvals that contain items which approval status is contained in the specified approval status.
try {
    GetOrderApprovalsResponse result = apiInstance.getOrderItemsApprovals(orderId, nextToken, itemApprovalTypes, itemApprovalStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApprovalsApi#getOrderItemsApprovals");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| An Amazon-defined order identifier, in 3-7-7 format, e.g. 933-1671587-0818628. |
 **nextToken** | **String**| A string token returned in the response of your previous request. | [optional]
 **itemApprovalTypes** | [**List&lt;ItemApprovalType&gt;**](ItemApprovalType.md)| When set, only return approvals for items which approval type is contained in the specified approval types. | [optional]
 **itemApprovalStatus** | [**List&lt;ItemApprovalStatus&gt;**](ItemApprovalStatus.md)| When set, only return approvals that contain items which approval status is contained in the specified approval status. | [optional]

### Return type

[**GetOrderApprovalsResponse**](GetOrderApprovalsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateOrderItemsApprovals"></a>
# **updateOrderItemsApprovals**
> updateOrderItemsApprovals(orderId, payload)



Update the order items approvals for an order that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 15 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values then those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api_client.ApprovalsApi;


ApprovalsApi apiInstance = new ApprovalsApi();
String orderId = "orderId_example"; // String | An Amazon-defined order identifier, in 3-7-7 format.
UpdateOrderApprovalsRequest payload = new UpdateOrderApprovalsRequest(); // UpdateOrderApprovalsRequest | The request body for the updateOrderItemsApprovals operation.
try {
    apiInstance.updateOrderItemsApprovals(orderId, payload);
} catch (ApiException e) {
    System.err.println("Exception when calling ApprovalsApi#updateOrderItemsApprovals");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| An Amazon-defined order identifier, in 3-7-7 format. |
 **payload** | [**UpdateOrderApprovalsRequest**](UpdateOrderApprovalsRequest.md)| The request body for the updateOrderItemsApprovals operation. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


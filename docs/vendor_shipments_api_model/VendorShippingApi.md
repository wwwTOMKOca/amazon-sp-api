# VendorShippingApi

All URIs are relative to *https://sellingpartnerapi-na.amazon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getShipmentDetails**](VendorShippingApi.md#getShipmentDetails) | **GET** /vendor/shipping/v1/shipments | 
[**getShipmentLabels**](VendorShippingApi.md#getShipmentLabels) | **GET** /vendor/shipping/v1/transportLabels | 
[**submitShipmentConfirmations**](VendorShippingApi.md#submitShipmentConfirmations) | **POST** /vendor/shipping/v1/shipmentConfirmations | 
[**submitShipments**](VendorShippingApi.md#submitShipments) | **POST** /vendor/shipping/v1/shipments | 


<a name="getShipmentDetails"></a>
# **getShipmentDetails**
> GetShipmentDetailsResponse getShipmentDetails(limit, sortOrder, nextToken, createdAfter, createdBefore, shipmentConfirmedBefore, shipmentConfirmedAfter, packageLabelCreatedBefore, packageLabelCreatedAfter, shippedBefore, shippedAfter, estimatedDeliveryBefore, estimatedDeliveryAfter, shipmentDeliveryBefore, shipmentDeliveryAfter, requestedPickUpBefore, requestedPickUpAfter, scheduledPickUpBefore, scheduledPickUpAfter, currentShipmentStatus, vendorShipmentIdentifier, buyerReferenceNumber, buyerWarehouseCode, sellerWarehouseCode)



Returns the Details about Shipment, Carrier Details,  status of the shipment, container details and other details related to shipment based on the filter parameters value that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 10 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api_client.VendorShippingApi;


VendorShippingApi apiInstance = new VendorShippingApi();
Long limit = 789L; // Long | The limit to the number of records returned. Default value is 50 records.
String sortOrder = "sortOrder_example"; // String | Sort in ascending or descending order by purchase order creation date.
String nextToken = "nextToken_example"; // String | Used for pagination when there are more shipments than the specified result size limit.
OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Get Shipment Details that became available after this timestamp will be included in the result. Must be in ISO-8601 date/time format.
OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Get Shipment Details that became available before this timestamp will be included in the result. Must be in ISO-8601 date/time format.
OffsetDateTime shipmentConfirmedBefore = OffsetDateTime.now(); // OffsetDateTime | Get Shipment Details by passing Shipment confirmed create Date Before. Must be in ISO-8601 date/time format.
OffsetDateTime shipmentConfirmedAfter = OffsetDateTime.now(); // OffsetDateTime | Get Shipment Details by passing Shipment confirmed create Date After. Must be in ISO-8601 date/time format.
OffsetDateTime packageLabelCreatedBefore = OffsetDateTime.now(); // OffsetDateTime | Get Shipment Details by passing Package label create Date by buyer. Must be in ISO-8601 date/time format.
OffsetDateTime packageLabelCreatedAfter = OffsetDateTime.now(); // OffsetDateTime | Get Shipment Details by passing Package label create Date After by buyer. Must be in ISO-8601 date/time format.
OffsetDateTime shippedBefore = OffsetDateTime.now(); // OffsetDateTime | Get Shipment Details by passing Shipped Date Before. Must be in ISO-8601 date/time format.
OffsetDateTime shippedAfter = OffsetDateTime.now(); // OffsetDateTime | Get Shipment Details by passing Shipped Date After. Must be in ISO-8601 date/time format.
OffsetDateTime estimatedDeliveryBefore = OffsetDateTime.now(); // OffsetDateTime | Get Shipment Details by passing Estimated Delivery Date Before. Must be in ISO-8601 date/time format.
OffsetDateTime estimatedDeliveryAfter = OffsetDateTime.now(); // OffsetDateTime | Get Shipment Details by passing Estimated Delivery Date Before. Must be in ISO-8601 date/time format.
OffsetDateTime shipmentDeliveryBefore = OffsetDateTime.now(); // OffsetDateTime | Get Shipment Details by passing Shipment Delivery Date Before. Must be in ISO-8601 date/time format.
OffsetDateTime shipmentDeliveryAfter = OffsetDateTime.now(); // OffsetDateTime | Get Shipment Details by passing Shipment Delivery Date After. Must be in ISO-8601 date/time format.
OffsetDateTime requestedPickUpBefore = OffsetDateTime.now(); // OffsetDateTime | Get Shipment Details by passing Before Requested pickup date. Must be in ISO-8601 date/time format.
OffsetDateTime requestedPickUpAfter = OffsetDateTime.now(); // OffsetDateTime | Get Shipment Details by passing After Requested pickup date. Must be in ISO-8601 date/time format.
OffsetDateTime scheduledPickUpBefore = OffsetDateTime.now(); // OffsetDateTime | Get Shipment Details by passing Before scheduled pickup date. Must be in ISO-8601 date/time format.
OffsetDateTime scheduledPickUpAfter = OffsetDateTime.now(); // OffsetDateTime | Get Shipment Details by passing After Scheduled pickup date. Must be in ISO-8601 date/time format.
String currentShipmentStatus = "currentShipmentStatus_example"; // String | Get Shipment Details by passing Current shipment status.
String vendorShipmentIdentifier = "vendorShipmentIdentifier_example"; // String | Get Shipment Details by passing Vendor Shipment ID
String buyerReferenceNumber = "buyerReferenceNumber_example"; // String | Get Shipment Details by passing buyer Reference ID
String buyerWarehouseCode = "buyerWarehouseCode_example"; // String | Get Shipping Details based on buyer warehouse code. This value should be same as 'shipToParty.partyId' in the Shipment.
String sellerWarehouseCode = "sellerWarehouseCode_example"; // String | Get Shipping Details based on vendor warehouse code. This value should be same as 'sellingParty.partyId' in the Shipment.
try {
    GetShipmentDetailsResponse result = apiInstance.getShipmentDetails(limit, sortOrder, nextToken, createdAfter, createdBefore, shipmentConfirmedBefore, shipmentConfirmedAfter, packageLabelCreatedBefore, packageLabelCreatedAfter, shippedBefore, shippedAfter, estimatedDeliveryBefore, estimatedDeliveryAfter, shipmentDeliveryBefore, shipmentDeliveryAfter, requestedPickUpBefore, requestedPickUpAfter, scheduledPickUpBefore, scheduledPickUpAfter, currentShipmentStatus, vendorShipmentIdentifier, buyerReferenceNumber, buyerWarehouseCode, sellerWarehouseCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorShippingApi#getShipmentDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| The limit to the number of records returned. Default value is 50 records. | [optional]
 **sortOrder** | **String**| Sort in ascending or descending order by purchase order creation date. | [optional] [enum: ASC, DESC]
 **nextToken** | **String**| Used for pagination when there are more shipments than the specified result size limit. | [optional]
 **createdAfter** | **OffsetDateTime**| Get Shipment Details that became available after this timestamp will be included in the result. Must be in ISO-8601 date/time format. | [optional]
 **createdBefore** | **OffsetDateTime**| Get Shipment Details that became available before this timestamp will be included in the result. Must be in ISO-8601 date/time format. | [optional]
 **shipmentConfirmedBefore** | **OffsetDateTime**| Get Shipment Details by passing Shipment confirmed create Date Before. Must be in ISO-8601 date/time format. | [optional]
 **shipmentConfirmedAfter** | **OffsetDateTime**| Get Shipment Details by passing Shipment confirmed create Date After. Must be in ISO-8601 date/time format. | [optional]
 **packageLabelCreatedBefore** | **OffsetDateTime**| Get Shipment Details by passing Package label create Date by buyer. Must be in ISO-8601 date/time format. | [optional]
 **packageLabelCreatedAfter** | **OffsetDateTime**| Get Shipment Details by passing Package label create Date After by buyer. Must be in ISO-8601 date/time format. | [optional]
 **shippedBefore** | **OffsetDateTime**| Get Shipment Details by passing Shipped Date Before. Must be in ISO-8601 date/time format. | [optional]
 **shippedAfter** | **OffsetDateTime**| Get Shipment Details by passing Shipped Date After. Must be in ISO-8601 date/time format. | [optional]
 **estimatedDeliveryBefore** | **OffsetDateTime**| Get Shipment Details by passing Estimated Delivery Date Before. Must be in ISO-8601 date/time format. | [optional]
 **estimatedDeliveryAfter** | **OffsetDateTime**| Get Shipment Details by passing Estimated Delivery Date Before. Must be in ISO-8601 date/time format. | [optional]
 **shipmentDeliveryBefore** | **OffsetDateTime**| Get Shipment Details by passing Shipment Delivery Date Before. Must be in ISO-8601 date/time format. | [optional]
 **shipmentDeliveryAfter** | **OffsetDateTime**| Get Shipment Details by passing Shipment Delivery Date After. Must be in ISO-8601 date/time format. | [optional]
 **requestedPickUpBefore** | **OffsetDateTime**| Get Shipment Details by passing Before Requested pickup date. Must be in ISO-8601 date/time format. | [optional]
 **requestedPickUpAfter** | **OffsetDateTime**| Get Shipment Details by passing After Requested pickup date. Must be in ISO-8601 date/time format. | [optional]
 **scheduledPickUpBefore** | **OffsetDateTime**| Get Shipment Details by passing Before scheduled pickup date. Must be in ISO-8601 date/time format. | [optional]
 **scheduledPickUpAfter** | **OffsetDateTime**| Get Shipment Details by passing After Scheduled pickup date. Must be in ISO-8601 date/time format. | [optional]
 **currentShipmentStatus** | **String**| Get Shipment Details by passing Current shipment status. | [optional]
 **vendorShipmentIdentifier** | **String**| Get Shipment Details by passing Vendor Shipment ID | [optional]
 **buyerReferenceNumber** | **String**| Get Shipment Details by passing buyer Reference ID | [optional]
 **buyerWarehouseCode** | **String**| Get Shipping Details based on buyer warehouse code. This value should be same as &#39;shipToParty.partyId&#39; in the Shipment. | [optional]
 **sellerWarehouseCode** | **String**| Get Shipping Details based on vendor warehouse code. This value should be same as &#39;sellingParty.partyId&#39; in the Shipment. | [optional]

### Return type

[**GetShipmentDetailsResponse**](GetShipmentDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getShipmentLabels"></a>
# **getShipmentLabels**
> GetShipmentLabels getShipmentLabels(limit, sortOrder, nextToken, labelCreatedAfter, labelcreatedBefore, buyerReferenceNumber, vendorShipmentIdentifier, sellerWarehouseCode)



Returns transport Labels based on the filters that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 10 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api_client.VendorShippingApi;


VendorShippingApi apiInstance = new VendorShippingApi();
Long limit = 789L; // Long | The limit to the number of records returned. Default value is 50 records.
String sortOrder = "sortOrder_example"; // String | Sort in ascending or descending order by transport label creation date.
String nextToken = "nextToken_example"; // String | Used for pagination when there are more transport label than the specified result size limit.
OffsetDateTime labelCreatedAfter = OffsetDateTime.now(); // OffsetDateTime | transport Labels that became available after this timestamp will be included in the result. Must be in ISO-8601 date/time format.
OffsetDateTime labelcreatedBefore = OffsetDateTime.now(); // OffsetDateTime | transport Labels that became available before this timestamp will be included in the result. Must be in ISO-8601 date/time format.
String buyerReferenceNumber = "buyerReferenceNumber_example"; // String | Get transport labels by passing Buyer Reference Number to retreive the corresponding transport label.
String vendorShipmentIdentifier = "vendorShipmentIdentifier_example"; // String | Get transport labels by passing Vendor Shipment ID to retreive the corresponding transport label.
String sellerWarehouseCode = "sellerWarehouseCode_example"; // String | Get Shipping labels based Vendor Warehouse code. This value should be same as 'shipFromParty.partyId' in the Shipment.
try {
    GetShipmentLabels result = apiInstance.getShipmentLabels(limit, sortOrder, nextToken, labelCreatedAfter, labelcreatedBefore, buyerReferenceNumber, vendorShipmentIdentifier, sellerWarehouseCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorShippingApi#getShipmentLabels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| The limit to the number of records returned. Default value is 50 records. | [optional]
 **sortOrder** | **String**| Sort in ascending or descending order by transport label creation date. | [optional] [enum: ASC, DESC]
 **nextToken** | **String**| Used for pagination when there are more transport label than the specified result size limit. | [optional]
 **labelCreatedAfter** | **OffsetDateTime**| transport Labels that became available after this timestamp will be included in the result. Must be in ISO-8601 date/time format. | [optional]
 **labelcreatedBefore** | **OffsetDateTime**| transport Labels that became available before this timestamp will be included in the result. Must be in ISO-8601 date/time format. | [optional]
 **buyerReferenceNumber** | **String**| Get transport labels by passing Buyer Reference Number to retreive the corresponding transport label. | [optional]
 **vendorShipmentIdentifier** | **String**| Get transport labels by passing Vendor Shipment ID to retreive the corresponding transport label. | [optional]
 **sellerWarehouseCode** | **String**| Get Shipping labels based Vendor Warehouse code. This value should be same as &#39;shipFromParty.partyId&#39; in the Shipment. | [optional]

### Return type

[**GetShipmentLabels**](GetShipmentLabels.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitShipmentConfirmations"></a>
# **submitShipmentConfirmations**
> SubmitShipmentConfirmationsResponse submitShipmentConfirmations(body)



Submits one or more shipment confirmations for vendor orders.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 10 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api_client.VendorShippingApi;


VendorShippingApi apiInstance = new VendorShippingApi();
SubmitShipmentConfirmationsRequest body = new SubmitShipmentConfirmationsRequest(); // SubmitShipmentConfirmationsRequest | 
try {
    SubmitShipmentConfirmationsResponse result = apiInstance.submitShipmentConfirmations(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorShippingApi#submitShipmentConfirmations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubmitShipmentConfirmationsRequest**](SubmitShipmentConfirmationsRequest.md)|  |

### Return type

[**SubmitShipmentConfirmationsResponse**](SubmitShipmentConfirmationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitShipments"></a>
# **submitShipments**
> SubmitShipmentConfirmationsResponse submitShipments(body)



Submits one or more shipment request for vendor Orders.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 10 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api_client.VendorShippingApi;


VendorShippingApi apiInstance = new VendorShippingApi();
SubmitShipments body = new SubmitShipments(); // SubmitShipments | 
try {
    SubmitShipmentConfirmationsResponse result = apiInstance.submitShipments(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorShippingApi#submitShipments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubmitShipments**](SubmitShipments.md)|  |

### Return type

[**SubmitShipmentConfirmationsResponse**](SubmitShipmentConfirmationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


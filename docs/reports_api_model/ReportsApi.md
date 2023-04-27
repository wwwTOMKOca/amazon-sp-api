# ReportsApi

All URIs are relative to *https://sellingpartnerapi-na.amazon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelReport**](ReportsApi.md#cancelReport) | **DELETE** /reports/2020-09-04/reports/{reportId} | 
[**cancelReportSchedule**](ReportsApi.md#cancelReportSchedule) | **DELETE** /reports/2020-09-04/schedules/{reportScheduleId} | 
[**createReport**](ReportsApi.md#createReport) | **POST** /reports/2020-09-04/reports | 
[**createReportSchedule**](ReportsApi.md#createReportSchedule) | **POST** /reports/2020-09-04/schedules | 
[**getReport**](ReportsApi.md#getReport) | **GET** /reports/2020-09-04/reports/{reportId} | 
[**getReportDocument**](ReportsApi.md#getReportDocument) | **GET** /reports/2020-09-04/documents/{reportDocumentId} | 
[**getReportSchedule**](ReportsApi.md#getReportSchedule) | **GET** /reports/2020-09-04/schedules/{reportScheduleId} | 
[**getReportSchedules**](ReportsApi.md#getReportSchedules) | **GET** /reports/2020-09-04/schedules | 
[**getReports**](ReportsApi.md#getReports) | **GET** /reports/2020-09-04/reports | 


<a name="cancelReport"></a>
# **cancelReport**
> CancelReportResponse cancelReport(reportId)



Effective **June 27, 2023**, the &#x60;cancelReport&#x60; operation will no longer be available in the Selling Partner API for Reports v2020-09-04 and all calls to it will fail. Integrations that rely on this operation should migrate to [Reports v2021-06-30](https://developer-docs.amazon.com/sp-api/docs/reports-api-v2021-06-30-reference) to avoid service disruption.

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api_client.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String reportId = "reportId_example"; // String | The identifier for the report. This identifier is unique only in combination with a seller ID.
try {
    CancelReportResponse result = apiInstance.cancelReport(reportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#cancelReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **String**| The identifier for the report. This identifier is unique only in combination with a seller ID. |

### Return type

[**CancelReportResponse**](CancelReportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelReportSchedule"></a>
# **cancelReportSchedule**
> CancelReportScheduleResponse cancelReportSchedule(reportScheduleId)



Effective **June 27, 2023**, the &#x60;cancelReportSchedule&#x60; operation will no longer be available in the Selling Partner API for Reports v2020-09-04 and all calls to it will fail. Integrations that rely on this operation should migrate to [Reports v2021-06-30](https://developer-docs.amazon.com/sp-api/docs/reports-api-v2021-06-30-reference) to avoid service disruption.

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api_client.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String reportScheduleId = "reportScheduleId_example"; // String | The identifier for the report schedule. This identifier is unique only in combination with a seller ID.
try {
    CancelReportScheduleResponse result = apiInstance.cancelReportSchedule(reportScheduleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#cancelReportSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportScheduleId** | **String**| The identifier for the report schedule. This identifier is unique only in combination with a seller ID. |

### Return type

[**CancelReportScheduleResponse**](CancelReportScheduleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createReport"></a>
# **createReport**
> CreateReportResponse createReport(body)



Effective **June 27, 2023**, the &#x60;createReport&#x60; operation will no longer be available in the Selling Partner API for Reports v2020-09-04 and all calls to it will fail. Integrations that rely on this operation should migrate to [Reports v2021-06-30](https://developer-docs.amazon.com/sp-api/docs/reports-api-v2021-06-30-reference) to avoid service disruption.

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api_client.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
CreateReportSpecification body = new CreateReportSpecification(); // CreateReportSpecification | 
try {
    CreateReportResponse result = apiInstance.createReport(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#createReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateReportSpecification**](CreateReportSpecification.md)|  |

### Return type

[**CreateReportResponse**](CreateReportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createReportSchedule"></a>
# **createReportSchedule**
> CreateReportScheduleResponse createReportSchedule(body)



Effective **June 27, 2023**, the &#x60;createReportSchedule&#x60; operation will no longer be available in the Selling Partner API for Reports v2020-09-04 and all calls to it will fail. Integrations that rely on this operation should migrate to [Reports v2021-06-30](https://developer-docs.amazon.com/sp-api/docs/reports-api-v2021-06-30-reference) to avoid service disruption.

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api_client.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
CreateReportScheduleSpecification body = new CreateReportScheduleSpecification(); // CreateReportScheduleSpecification | 
try {
    CreateReportScheduleResponse result = apiInstance.createReportSchedule(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#createReportSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateReportScheduleSpecification**](CreateReportScheduleSpecification.md)|  |

### Return type

[**CreateReportScheduleResponse**](CreateReportScheduleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReport"></a>
# **getReport**
> GetReportResponse getReport(reportId)



Effective **June 27, 2023**, the &#x60;getReport&#x60; operation will no longer be available in the Selling Partner API for Reports v2020-09-04 and all calls to it will fail. Integrations that rely on this operation should migrate to [Reports v2021-06-30](https://developer-docs.amazon.com/sp-api/docs/reports-api-v2021-06-30-reference) to avoid service disruption.

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api_client.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String reportId = "reportId_example"; // String | The identifier for the report. This identifier is unique only in combination with a seller ID.
try {
    GetReportResponse result = apiInstance.getReport(reportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#getReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **String**| The identifier for the report. This identifier is unique only in combination with a seller ID. |

### Return type

[**GetReportResponse**](GetReportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportDocument"></a>
# **getReportDocument**
> GetReportDocumentResponse getReportDocument(reportDocumentId)



Effective **June 27, 2023**, the &#x60;getReportDocument&#x60; operation will no longer be available in the Selling Partner API for Reports v2020-09-04 and all calls to it will fail. Integrations that rely on this operation should migrate to [Reports v2021-06-30](https://developer-docs.amazon.com/sp-api/docs/reports-api-v2021-06-30-reference) to avoid service disruption.

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api_client.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String reportDocumentId = "reportDocumentId_example"; // String | The identifier for the report document.
try {
    GetReportDocumentResponse result = apiInstance.getReportDocument(reportDocumentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#getReportDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportDocumentId** | **String**| The identifier for the report document. |

### Return type

[**GetReportDocumentResponse**](GetReportDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportSchedule"></a>
# **getReportSchedule**
> GetReportScheduleResponse getReportSchedule(reportScheduleId)



Effective **June 27, 2023**, the &#x60;getReportSchedule&#x60; operation will no longer be available in the Selling Partner API for Reports v2020-09-04 and all calls to it will fail. Integrations that rely on this operation should migrate to [Reports v2021-06-30](https://developer-docs.amazon.com/sp-api/docs/reports-api-v2021-06-30-reference) to avoid service disruption.

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api_client.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
String reportScheduleId = "reportScheduleId_example"; // String | The identifier for the report schedule. This identifier is unique only in combination with a seller ID.
try {
    GetReportScheduleResponse result = apiInstance.getReportSchedule(reportScheduleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#getReportSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportScheduleId** | **String**| The identifier for the report schedule. This identifier is unique only in combination with a seller ID. |

### Return type

[**GetReportScheduleResponse**](GetReportScheduleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportSchedules"></a>
# **getReportSchedules**
> GetReportSchedulesResponse getReportSchedules(reportTypes)



Effective **June 27, 2023**, the &#x60;getReportSchedules&#x60; operation will no longer be available in the Selling Partner API for Reports v2020-09-04 and all calls to it will fail. Integrations that rely on this operation should migrate to [Reports v2021-06-30](https://developer-docs.amazon.com/sp-api/docs/reports-api-v2021-06-30-reference) to avoid service disruption.

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api_client.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
List<String> reportTypes = Arrays.asList("reportTypes_example"); // List<String> | A list of report types used to filter report schedules.
try {
    GetReportSchedulesResponse result = apiInstance.getReportSchedules(reportTypes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#getReportSchedules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportTypes** | [**List&lt;String&gt;**](String.md)| A list of report types used to filter report schedules. |

### Return type

[**GetReportSchedulesResponse**](GetReportSchedulesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReports"></a>
# **getReports**
> GetReportsResponse getReports(reportTypes, processingStatuses, marketplaceIds, pageSize, createdSince, createdUntil, nextToken)



Effective **June 27, 2023**, the &#x60;getReports&#x60; operation will no longer be available in the Selling Partner API for Reports v2020-09-04 and all calls to it will fail. Integrations that rely on this operation should migrate to [Reports v2021-06-30](https://developer-docs.amazon.com/sp-api/docs/reports-api-v2021-06-30-reference) to avoid service disruption.

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api_client.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
List<String> reportTypes = Arrays.asList("reportTypes_example"); // List<String> | A list of report types used to filter reports. When reportTypes is provided, the other filter parameters (processingStatuses, marketplaceIds, createdSince, createdUntil) and pageSize may also be provided. Either reportTypes or nextToken is required.
List<String> processingStatuses = Arrays.asList("processingStatuses_example"); // List<String> | A list of processing statuses used to filter reports.
List<String> marketplaceIds = Arrays.asList("marketplaceIds_example"); // List<String> | A list of marketplace identifiers used to filter reports. The reports returned will match at least one of the marketplaces that you specify.
Integer pageSize = 10; // Integer | The maximum number of reports to return in a single call.
OffsetDateTime createdSince = OffsetDateTime.now(); // OffsetDateTime | The earliest report creation date and time for reports to include in the response, in ISO 8601 date time format. The default is 90 days ago. Reports are retained for a maximum of 90 days.
OffsetDateTime createdUntil = OffsetDateTime.now(); // OffsetDateTime | The latest report creation date and time for reports to include in the response, in ISO 8601 date time format. The default is now.
String nextToken = "nextToken_example"; // String | A string token returned in the response to your previous request. nextToken is returned when the number of results exceeds the specified pageSize value. To get the next page of results, call the getReports operation and include this token as the only parameter. Specifying nextToken with any other parameters will cause the request to fail.
try {
    GetReportsResponse result = apiInstance.getReports(reportTypes, processingStatuses, marketplaceIds, pageSize, createdSince, createdUntil, nextToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#getReports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportTypes** | [**List&lt;String&gt;**](String.md)| A list of report types used to filter reports. When reportTypes is provided, the other filter parameters (processingStatuses, marketplaceIds, createdSince, createdUntil) and pageSize may also be provided. Either reportTypes or nextToken is required. | [optional]
 **processingStatuses** | [**List&lt;String&gt;**](String.md)| A list of processing statuses used to filter reports. | [optional] [enum: CANCELLED, DONE, FATAL, IN_PROGRESS, IN_QUEUE]
 **marketplaceIds** | [**List&lt;String&gt;**](String.md)| A list of marketplace identifiers used to filter reports. The reports returned will match at least one of the marketplaces that you specify. | [optional]
 **pageSize** | **Integer**| The maximum number of reports to return in a single call. | [optional] [default to 10]
 **createdSince** | **OffsetDateTime**| The earliest report creation date and time for reports to include in the response, in ISO 8601 date time format. The default is 90 days ago. Reports are retained for a maximum of 90 days. | [optional]
 **createdUntil** | **OffsetDateTime**| The latest report creation date and time for reports to include in the response, in ISO 8601 date time format. The default is now. | [optional]
 **nextToken** | **String**| A string token returned in the response to your previous request. nextToken is returned when the number of results exceeds the specified pageSize value. To get the next page of results, call the getReports operation and include this token as the only parameter. Specifying nextToken with any other parameters will cause the request to fail. | [optional]

### Return type

[**GetReportsResponse**](GetReportsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


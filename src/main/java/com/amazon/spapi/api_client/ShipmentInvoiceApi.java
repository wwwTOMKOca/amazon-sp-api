/*
 * Selling Partner API for Shipment Invoicing
 * The Selling Partner API for Shipment Invoicing helps you programmatically retrieve shipment invoice information in the Brazil marketplace for a selling partner’s Fulfillment by Amazon (FBA) orders.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.api_client;

import com.amazon.spapi.ApiCallback;
import com.amazon.spapi.ApiClient;
import com.amazon.spapi.ApiException;
import com.amazon.spapi.ApiResponse;
import com.amazon.spapi.Configuration;
import com.amazon.spapi.Pair;
import com.amazon.spapi.ProgressRequestBody;
import com.amazon.spapi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.amazon.spapi.model.shipment_invoicing_api_model.GetInvoiceStatusResponse;
import com.amazon.spapi.model.shipment_invoicing_api_model.GetShipmentDetailsResponse;
import com.amazon.spapi.model.shipment_invoicing_api_model.SubmitInvoiceRequest;
import com.amazon.spapi.model.shipment_invoicing_api_model.SubmitInvoiceResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShipmentInvoiceApi {
    private ApiClient apiClient;

    public ShipmentInvoiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ShipmentInvoiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getInvoiceStatus
     * @param shipmentId The shipment identifier for the shipment. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getInvoiceStatusCall(String shipmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fba/outbound/brazil/v0/shipments/{shipmentId}/invoice/status"
            .replaceAll("\\{" + "shipmentId" + "\\}", apiClient.escapeString(shipmentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getInvoiceStatusValidateBeforeCall(String shipmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new ApiException("Missing the required parameter 'shipmentId' when calling getInvoiceStatus(Async)");
        }
        

        com.squareup.okhttp.Call call = getInvoiceStatusCall(shipmentId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Returns the invoice status for the shipment you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1.133 | 25 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param shipmentId The shipment identifier for the shipment. (required)
     * @return GetInvoiceStatusResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetInvoiceStatusResponse getInvoiceStatus(String shipmentId) throws ApiException {
        ApiResponse<GetInvoiceStatusResponse> resp = getInvoiceStatusWithHttpInfo(shipmentId);
        return resp.getData();
    }

    /**
     * 
     * Returns the invoice status for the shipment you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1.133 | 25 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param shipmentId The shipment identifier for the shipment. (required)
     * @return ApiResponse&lt;GetInvoiceStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetInvoiceStatusResponse> getInvoiceStatusWithHttpInfo(String shipmentId) throws ApiException {
        com.squareup.okhttp.Call call = getInvoiceStatusValidateBeforeCall(shipmentId, null, null);
        Type localVarReturnType = new TypeToken<GetInvoiceStatusResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns the invoice status for the shipment you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1.133 | 25 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param shipmentId The shipment identifier for the shipment. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getInvoiceStatusAsync(String shipmentId, final ApiCallback<GetInvoiceStatusResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getInvoiceStatusValidateBeforeCall(shipmentId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetInvoiceStatusResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getShipmentDetails
     * @param shipmentId The identifier for the shipment. Get this value from the FBAOutboundShipmentStatus notification. For information about subscribing to notifications, see the [Notifications API Use Case Guide](doc:notifications-api-v1-use-case-guide). (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getShipmentDetailsCall(String shipmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fba/outbound/brazil/v0/shipments/{shipmentId}"
            .replaceAll("\\{" + "shipmentId" + "\\}", apiClient.escapeString(shipmentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getShipmentDetailsValidateBeforeCall(String shipmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new ApiException("Missing the required parameter 'shipmentId' when calling getShipmentDetails(Async)");
        }
        

        com.squareup.okhttp.Call call = getShipmentDetailsCall(shipmentId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Returns the shipment details required to issue an invoice for the specified shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1.133 | 25 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param shipmentId The identifier for the shipment. Get this value from the FBAOutboundShipmentStatus notification. For information about subscribing to notifications, see the [Notifications API Use Case Guide](doc:notifications-api-v1-use-case-guide). (required)
     * @return GetShipmentDetailsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetShipmentDetailsResponse getShipmentDetails(String shipmentId) throws ApiException {
        ApiResponse<GetShipmentDetailsResponse> resp = getShipmentDetailsWithHttpInfo(shipmentId);
        return resp.getData();
    }

    /**
     * 
     * Returns the shipment details required to issue an invoice for the specified shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1.133 | 25 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param shipmentId The identifier for the shipment. Get this value from the FBAOutboundShipmentStatus notification. For information about subscribing to notifications, see the [Notifications API Use Case Guide](doc:notifications-api-v1-use-case-guide). (required)
     * @return ApiResponse&lt;GetShipmentDetailsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetShipmentDetailsResponse> getShipmentDetailsWithHttpInfo(String shipmentId) throws ApiException {
        com.squareup.okhttp.Call call = getShipmentDetailsValidateBeforeCall(shipmentId, null, null);
        Type localVarReturnType = new TypeToken<GetShipmentDetailsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns the shipment details required to issue an invoice for the specified shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1.133 | 25 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param shipmentId The identifier for the shipment. Get this value from the FBAOutboundShipmentStatus notification. For information about subscribing to notifications, see the [Notifications API Use Case Guide](doc:notifications-api-v1-use-case-guide). (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getShipmentDetailsAsync(String shipmentId, final ApiCallback<GetShipmentDetailsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getShipmentDetailsValidateBeforeCall(shipmentId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetShipmentDetailsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for submitInvoice
     * @param shipmentId The identifier for the shipment. (required)
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call submitInvoiceCall(String shipmentId, SubmitInvoiceRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/fba/outbound/brazil/v0/shipments/{shipmentId}/invoice"
            .replaceAll("\\{" + "shipmentId" + "\\}", apiClient.escapeString(shipmentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call submitInvoiceValidateBeforeCall(String shipmentId, SubmitInvoiceRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'shipmentId' is set
        if (shipmentId == null) {
            throw new ApiException("Missing the required parameter 'shipmentId' when calling submitInvoice(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling submitInvoice(Async)");
        }
        

        com.squareup.okhttp.Call call = submitInvoiceCall(shipmentId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Submits a shipment invoice document for a given shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1.133 | 25 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param shipmentId The identifier for the shipment. (required)
     * @param body  (required)
     * @return SubmitInvoiceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SubmitInvoiceResponse submitInvoice(String shipmentId, SubmitInvoiceRequest body) throws ApiException {
        ApiResponse<SubmitInvoiceResponse> resp = submitInvoiceWithHttpInfo(shipmentId, body);
        return resp.getData();
    }

    /**
     * 
     * Submits a shipment invoice document for a given shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1.133 | 25 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param shipmentId The identifier for the shipment. (required)
     * @param body  (required)
     * @return ApiResponse&lt;SubmitInvoiceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SubmitInvoiceResponse> submitInvoiceWithHttpInfo(String shipmentId, SubmitInvoiceRequest body) throws ApiException {
        com.squareup.okhttp.Call call = submitInvoiceValidateBeforeCall(shipmentId, body, null, null);
        Type localVarReturnType = new TypeToken<SubmitInvoiceResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Submits a shipment invoice document for a given shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1.133 | 25 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param shipmentId The identifier for the shipment. (required)
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call submitInvoiceAsync(String shipmentId, SubmitInvoiceRequest body, final ApiCallback<SubmitInvoiceResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = submitInvoiceValidateBeforeCall(shipmentId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SubmitInvoiceResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

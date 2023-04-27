
# Transaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | The unique identifier sent in the &#39;transactionId&#39; field in response to the post request of a specific transaction. | 
**status** | [**StatusEnum**](#StatusEnum) | Current processing status of the transaction. | 
**errors** | [**ErrorList**](ErrorList.md) | Error code and message for the failed transaction. Only available when transaction status is &#39;Failure&#39;. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
FAILURE | &quot;Failure&quot;
PROCESSING | &quot;Processing&quot;
SUCCESS | &quot;Success&quot;




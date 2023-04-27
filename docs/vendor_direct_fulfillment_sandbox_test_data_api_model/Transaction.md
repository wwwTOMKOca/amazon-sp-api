
# Transaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | The unique identifier returned in the response to the generateOrderScenarios request. | 
**status** | [**StatusEnum**](#StatusEnum) | The current processing status of the transaction. | 
**testCaseData** | [**TestCaseData**](TestCaseData.md) | Test case data for the transaction. Only available when the transaction status is SUCCESS. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
FAILURE | &quot;FAILURE&quot;
PROCESSING | &quot;PROCESSING&quot;
SUCCESS | &quot;SUCCESS&quot;




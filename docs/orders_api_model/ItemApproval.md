
# ItemApproval

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sequenceId** | **Integer** | Sequence number of the item approval. Each ItemApproval gets its sequenceId automatically from a monotonic increasing function. | 
**timestamp** | **String** | Timestamp when the ItemApproval was recorded by Amazon&#39;s internal order approvals system. In ISO 8601 date time format. | 
**actor** | [**ActorEnum**](#ActorEnum) | High level actors involved in the approval process. | 
**approver** | **String** | Person or system that triggers the approval actions on behalf of the actor. |  [optional]
**approvalAction** | [**ItemApprovalAction**](ItemApprovalAction.md) | Approval action that defines the behavior of the ItemApproval. | 
**approvalActionProcessStatus** | [**ApprovalActionProcessStatusEnum**](#ApprovalActionProcessStatusEnum) | Status of approval action. | 
**approvalActionProcessStatusMessage** | **String** | Optional message to communicate optional additional context about the current status of the approval action. |  [optional]


<a name="ActorEnum"></a>
## Enum: ActorEnum
Name | Value
---- | -----
SELLING_PARTNER | &quot;SELLING_PARTNER&quot;
AMAZON | &quot;AMAZON&quot;


<a name="ApprovalActionProcessStatusEnum"></a>
## Enum: ApprovalActionProcessStatusEnum
Name | Value
---- | -----
PROCESSING | &quot;PROCESSING&quot;
SUCCESS | &quot;SUCCESS&quot;
ERROR | &quot;ERROR&quot;




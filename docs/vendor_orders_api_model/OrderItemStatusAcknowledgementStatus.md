
# OrderItemStatusAcknowledgementStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**confirmationStatus** | [**ConfirmationStatusEnum**](#ConfirmationStatusEnum) | Confirmation status of line item. |  [optional]
**acceptedQuantity** | [**ItemQuantity**](ItemQuantity.md) | Item quantities accepted by vendor to be shipped. |  [optional]
**rejectedQuantity** | [**ItemQuantity**](ItemQuantity.md) | Item quantities rejected by vendor. |  [optional]
**acknowledgementStatusDetails** | [**List&lt;AcknowledgementStatusDetails&gt;**](AcknowledgementStatusDetails.md) | Details of item quantity confirmed. |  [optional]


<a name="ConfirmationStatusEnum"></a>
## Enum: ConfirmationStatusEnum
Name | Value
---- | -----
ACCEPTED | &quot;ACCEPTED&quot;
PARTIALLY_ACCEPTED | &quot;PARTIALLY_ACCEPTED&quot;
REJECTED | &quot;REJECTED&quot;
UNCONFIRMED | &quot;UNCONFIRMED&quot;




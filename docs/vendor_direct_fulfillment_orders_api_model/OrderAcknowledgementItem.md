
# OrderAcknowledgementItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**purchaseOrderNumber** | **String** | The purchase order number for this order. Formatting Notes: alpha-numeric code. | 
**vendorOrderNumber** | **String** | The vendor&#39;s order number for this order. | 
**acknowledgementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time when the order is acknowledged, in ISO-8601 date/time format. For example: 2018-07-16T23:00:00Z / 2018-07-16T23:00:00-05:00 / 2018-07-16T23:00:00-08:00. | 
**acknowledgementStatus** | [**AcknowledgementStatus**](AcknowledgementStatus.md) | Status of acknowledgement. | 
**sellingParty** | [**PartyIdentification**](PartyIdentification.md) | PartyID as vendor code. | 
**shipFromParty** | [**PartyIdentification**](PartyIdentification.md) | PartyID as the vendor&#39;s warehouseId. | 
**itemAcknowledgements** | [**List&lt;OrderItemAcknowledgement&gt;**](OrderItemAcknowledgement.md) | Item details including acknowledged quantity. | 




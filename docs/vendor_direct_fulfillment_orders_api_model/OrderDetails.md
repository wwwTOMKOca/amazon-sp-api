
# OrderDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerOrderNumber** | **String** | The customer order number. | 
**orderDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the order was placed. This field is expected to be in ISO-8601 date/time format, for example:2018-07-16T23:00:00Z/ 2018-07-16T23:00:00-05:00 /2018-07-16T23:00:00-08:00. If no time zone is specified, UTC should be assumed. | 
**orderStatus** | [**OrderStatusEnum**](#OrderStatusEnum) | Current status of the order. |  [optional]
**shipmentDetails** | [**ShipmentDetails**](ShipmentDetails.md) |  | 
**taxTotal** | [**OrderDetailsTaxTotal**](OrderDetailsTaxTotal.md) |  |  [optional]
**sellingParty** | [**PartyIdentification**](PartyIdentification.md) | PartyID of vendor code. | 
**shipFromParty** | [**PartyIdentification**](PartyIdentification.md) | PartyID of vendor&#39;s warehouse. | 
**shipToParty** | [**Address**](Address.md) | Name/Address and tax details of the ship to party. | 
**billToParty** | [**PartyIdentification**](PartyIdentification.md) | Name/Address and tax details of the bill to party. | 
**items** | [**List&lt;OrderItem&gt;**](OrderItem.md) | A list of items in this purchase order. | 


<a name="OrderStatusEnum"></a>
## Enum: OrderStatusEnum
Name | Value
---- | -----
NEW | &quot;NEW&quot;
SHIPPED | &quot;SHIPPED&quot;
ACCEPTED | &quot;ACCEPTED&quot;
CANCELLED | &quot;CANCELLED&quot;




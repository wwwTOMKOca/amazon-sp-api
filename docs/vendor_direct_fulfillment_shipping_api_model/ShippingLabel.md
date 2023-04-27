
# ShippingLabel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**purchaseOrderNumber** | **String** | This field will contain the Purchase Order Number for this order. | 
**sellingParty** | [**PartyIdentification**](PartyIdentification.md) | ID of the selling party or vendor. | 
**shipFromParty** | [**PartyIdentification**](PartyIdentification.md) | Warehouse code of vendor. | 
**labelFormat** | [**LabelFormatEnum**](#LabelFormatEnum) | Format of the label. | 
**labelData** | [**List&lt;LabelData&gt;**](LabelData.md) | Provides the details of the packages in this shipment. | 


<a name="LabelFormatEnum"></a>
## Enum: LabelFormatEnum
Name | Value
---- | -----
PNG | &quot;PNG&quot;
ZPL | &quot;ZPL&quot;




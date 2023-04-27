
# ShipmentConfirmation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**purchaseOrderNumber** | **String** | Purchase order number corresponding to the shipment. | 
**shipmentDetails** | [**ShipmentDetails**](ShipmentDetails.md) | Shipment information. | 
**sellingParty** | [**PartyIdentification**](PartyIdentification.md) | ID of the selling party or vendor. | 
**shipFromParty** | [**PartyIdentification**](PartyIdentification.md) | Warehouse code of vendor. | 
**items** | [**List&lt;Item&gt;**](Item.md) | Provide the details of the items in this shipment. If any of the item details field is common at a package or a pallet level, then provide them at the corresponding package. | 
**containers** | [**List&lt;Container&gt;**](Container.md) | Provide the details of the items in this shipment. If any of the item details field is common at a package or a pallet level, then provide them at the corresponding package. |  [optional]




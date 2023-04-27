
# TransportationDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shipMode** | [**ShipModeEnum**](#ShipModeEnum) | The type of shipment. |  [optional]
**transportationMode** | [**TransportationModeEnum**](#TransportationModeEnum) | The mode of transportation for this shipment. |  [optional]
**shippedDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date when shipment is performed by the Vendor to Buyer |  [optional]
**estimatedDeliveryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Estimated Date on which shipment will be delivered from Vendor to Buyer |  [optional]
**shipmentDeliveryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which shipment will be delivered from Vendor to Buyer |  [optional]
**carrierDetails** | [**CarrierDetails**](CarrierDetails.md) | Indicates the carrier details and their contact informations |  [optional]
**billOfLadingNumber** | **String** | Bill Of Lading (BOL) number is the unique number assigned by the vendor. The BOL present in the Shipment Confirmation message ideally matches the paper BOL provided with the shipment, but that is no must. Instead of BOL, an alternative reference number (like Delivery Note Number) for the shipment can also be sent in this field. |  [optional]


<a name="ShipModeEnum"></a>
## Enum: ShipModeEnum
Name | Value
---- | -----
TRUCKLOAD | &quot;TruckLoad&quot;
LESSTHANTRUCKLOAD | &quot;LessThanTruckLoad&quot;
SMALLPARCEL | &quot;SmallParcel&quot;


<a name="TransportationModeEnum"></a>
## Enum: TransportationModeEnum
Name | Value
---- | -----
ROAD | &quot;Road&quot;
AIR | &quot;Air&quot;
OCEAN | &quot;Ocean&quot;




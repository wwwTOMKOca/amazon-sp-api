
# OrderItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemSequenceNumber** | **String** | Numbering of the item on the purchase order. The first item will be 1, the second 2, and so on. | 
**buyerProductIdentifier** | **String** | Buyer&#39;s standard identification number (ASIN) of an item. |  [optional]
**vendorProductIdentifier** | **String** | The vendor selected product identification of the item. |  [optional]
**title** | **String** | Title for the item. |  [optional]
**orderedQuantity** | [**ItemQuantity**](ItemQuantity.md) | Item quantity ordered. | 
**scheduledDeliveryShipment** | [**ScheduledDeliveryShipment**](ScheduledDeliveryShipment.md) | Details for the scheduled delivery shipment. |  [optional]
**giftDetails** | [**GiftDetails**](GiftDetails.md) | Gift message and wrapId details. |  [optional]
**netPrice** | [**Money**](Money.md) | Net price (before tax) to vendor with currency details. | 
**taxDetails** | [**TaxItemDetails**](TaxItemDetails.md) | Total tax details for the line item. |  [optional]
**totalPrice** | [**Money**](Money.md) | The price to Amazon each (cost). |  [optional]
**buyerCustomizedInfo** | [**BuyerCustomizedInfoDetail**](BuyerCustomizedInfoDetail.md) | The buyer information for products the vendor has configured as customizable, specifying the types of customizations or configurations along with types and ranges for their product. This provides the ability for buyers to customize multiple aspects of the products according to what the vendor allows. |  [optional]




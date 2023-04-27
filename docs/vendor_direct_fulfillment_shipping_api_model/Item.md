
# Item

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemSequenceNumber** | **Integer** | Item Sequence Number for the item. This must be the same value as sent in order for a given item. | 
**buyerProductIdentifier** | **String** | Buyer&#39;s Standard Identification Number (ASIN) of an item. Either buyerProductIdentifier or vendorProductIdentifier is required. |  [optional]
**vendorProductIdentifier** | **String** | The vendor selected product identification of the item. Should be the same as was sent in the purchase order, like SKU Number. |  [optional]
**shippedQuantity** | [**ItemQuantity**](ItemQuantity.md) | Total item quantity shipped in this shipment. | 





# OrderItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemSequenceNumber** | **String** | Numbering of the item on the purchase order. The first item will be 1, the second 2, and so on. | 
**amazonProductIdentifier** | **String** | Amazon Standard Identification Number (ASIN) of an item. |  [optional]
**vendorProductIdentifier** | **String** | The vendor selected product identification of the item. |  [optional]
**orderedQuantity** | [**ItemQuantity**](ItemQuantity.md) | Item quantity ordered. | 
**isBackOrderAllowed** | **Boolean** | When true, we will accept backorder confirmations for this item. | 
**netCost** | [**Money**](Money.md) | The price to Amazon each (cost). |  [optional]
**listPrice** | [**Money**](Money.md) | The price to Amazon each (list). |  [optional]




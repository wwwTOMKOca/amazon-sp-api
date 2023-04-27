
# LowestPriceType

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**condition** | **String** | Indicates the condition of the item. For example: New, Used, Collectible, Refurbished, or Club. | 
**fulfillmentChannel** | **String** | Indicates whether the item is fulfilled by Amazon or by the seller. | 
**offerType** | [**OfferCustomerType**](OfferCustomerType.md) | Indicates the type of customer that the offer is valid for. |  [optional]
**quantityTier** | **Integer** | Indicates at what quantity this price becomes active. |  [optional]
**quantityDiscountType** | [**QuantityDiscountType**](QuantityDiscountType.md) | Indicates the type of quantity discount this price applies to. |  [optional]
**landedPrice** | [**MoneyType**](MoneyType.md) | The value calculated by adding ListingPrice + Shipping - Points. | 
**listingPrice** | [**MoneyType**](MoneyType.md) | The price of the item. | 
**shipping** | [**MoneyType**](MoneyType.md) | The shipping cost. | 
**points** | [**Points**](Points.md) | The number of Amazon Points offered with the purchase of an item. |  [optional]





# CompetitivePriceType

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competitivePriceId** | **String** | The pricing model for each price that is returned.  Possible values:  * 1 - New Buy Box Price. * 2 - Used Buy Box Price. | 
**price** | [**PriceType**](PriceType.md) | Pricing information for a given CompetitivePriceId value. | 
**condition** | **String** | Indicates the condition of the item whose pricing information is returned. Possible values are: New, Used, Collectible, Refurbished, or Club. |  [optional]
**subcondition** | **String** | Indicates the subcondition of the item whose pricing information is returned. Possible values are: New, Mint, Very Good, Good, Acceptable, Poor, Club, OEM, Warranty, Refurbished Warranty, Refurbished, Open Box, or Other. |  [optional]
**offerType** | [**OfferCustomerType**](OfferCustomerType.md) | Indicates the type of customer that the offer is valid for.&lt;br&gt;&lt;br&gt;When the offer type is B2C in a quantity discount, the seller is winning the Buy Box because others do not have inventory at that quantity, not because they have a quantity discount on the ASIN. |  [optional]
**quantityTier** | **Integer** | Indicates at what quantity this price becomes active. |  [optional]
**quantityDiscountType** | [**QuantityDiscountType**](QuantityDiscountType.md) | Indicates the type of quantity discount this price applies to. |  [optional]
**sellerId** | **String** | The seller identifier for the offer. |  [optional]
**belongsToRequester** | **Boolean** |  Indicates whether or not the pricing information is for an offer listing that belongs to the requester. The requester is the seller associated with the SellerId that was submitted with the request. Possible values are: true and false. |  [optional]




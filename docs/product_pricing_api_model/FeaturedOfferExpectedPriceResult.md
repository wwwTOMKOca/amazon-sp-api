
# FeaturedOfferExpectedPriceResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**featuredOfferExpectedPrice** | [**FeaturedOfferExpectedPrice**](FeaturedOfferExpectedPrice.md) |  |  [optional]
**resultStatus** | **String** | The status of the featured offer expected price computation. Possible values include VALID_FOEP, NO_COMPETING_OFFER, OFFER_NOT_ELIGIBLE, OFFER_NOT_FOUND. | 
**competingFeaturedOffer** | [**FeaturedOffer**](FeaturedOffer.md) | The offer that will likely be the featured offer if the target offer is priced above its featured offer expected price. If the target offer is currently the featured offer, this property will be different than currentFeaturedOffer. |  [optional]
**currentFeaturedOffer** | [**FeaturedOffer**](FeaturedOffer.md) | The offer that is currently the featured offer. If the target offer is not currently featured, this property will be equal to competingFeaturedOffer. |  [optional]




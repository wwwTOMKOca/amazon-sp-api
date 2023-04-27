
# ItemVariationsByMarketplace

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketplaceId** | **String** | Amazon marketplace identifier. | 
**asins** | **List&lt;String&gt;** | Identifiers (ASINs) of the related items. | 
**variationType** | [**VariationTypeEnum**](#VariationTypeEnum) | Type of variation relationship of the Amazon catalog item in the request to the related item(s): \&quot;PARENT\&quot; or \&quot;CHILD\&quot;. | 


<a name="VariationTypeEnum"></a>
## Enum: VariationTypeEnum
Name | Value
---- | -----
PARENT | &quot;PARENT&quot;
CHILD | &quot;CHILD&quot;




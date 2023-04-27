
# TaxRegistrationDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taxRegistrationType** | [**TaxRegistrationTypeEnum**](#TaxRegistrationTypeEnum) | Tax registration type for the entity. |  [optional]
**taxRegistrationNumber** | **String** | Tax registration number for the party. For example, VAT ID. | 
**taxRegistrationAddress** | [**Address**](Address.md) | Address associated with the tax registration number. |  [optional]
**taxRegistrationMessages** | **String** | Tax registration message that can be used for additional tax related details. |  [optional]


<a name="TaxRegistrationTypeEnum"></a>
## Enum: TaxRegistrationTypeEnum
Name | Value
---- | -----
VAT | &quot;VAT&quot;
GST | &quot;GST&quot;




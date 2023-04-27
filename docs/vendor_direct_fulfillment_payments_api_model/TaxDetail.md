
# TaxDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taxType** | [**TaxTypeEnum**](#TaxTypeEnum) | Type of the tax applied. | 
**taxRate** | **String** | Tax percentage applied. Percentage must be expressed in decimal. |  [optional]
**taxAmount** | [**Money**](Money.md) | Total tax amount applied on invoice total or an item total. | 
**taxableAmount** | [**Money**](Money.md) | This field will contain the invoice amount that is taxable at the rate specified in the tax rate field. |  [optional]


<a name="TaxTypeEnum"></a>
## Enum: TaxTypeEnum
Name | Value
---- | -----
CGST | &quot;CGST&quot;
SGST | &quot;SGST&quot;
CESS | &quot;CESS&quot;
UTGST | &quot;UTGST&quot;
IGST | &quot;IGST&quot;
MWST_ | &quot;MwSt.&quot;
PST | &quot;PST&quot;
TVA | &quot;TVA&quot;
VAT | &quot;VAT&quot;
GST | &quot;GST&quot;
ST | &quot;ST&quot;
CONSUMPTION | &quot;Consumption&quot;
MUTUALLYDEFINED | &quot;MutuallyDefined&quot;
DOMESTICVAT | &quot;DomesticVAT&quot;




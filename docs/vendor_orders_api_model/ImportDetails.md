
# ImportDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**methodOfPayment** | [**MethodOfPaymentEnum**](#MethodOfPaymentEnum) | If the recipient requests, contains the shipment method of payment. This is for import PO&#39;s only. |  [optional]
**internationalCommercialTerms** | [**InternationalCommercialTermsEnum**](#InternationalCommercialTermsEnum) | Incoterms (International Commercial Terms) are used to divide transaction costs and responsibilities between buyer and seller and reflect state-of-the-art transportation practices. This is for import purchase orders only.  |  [optional]
**portOfDelivery** | **String** | The port where goods on an import purchase order must be delivered by the vendor. This should only be specified when the internationalCommercialTerms is FOB. |  [optional]
**importContainers** | **String** | Types and numbers of container(s) for import purchase orders. Can be a comma-separated list if the shipment has multiple containers. HC signifies a high-capacity container. Free-text field, limited to 64 characters. The format will be a comma-delimited list containing values of the type: $NUMBER_OF_CONTAINERS_OF_THIS_TYPE-$CONTAINER_TYPE. The list of values for the container type is: 40&#39;(40-foot container), 40&#39;HC (40-foot high-capacity container), 45&#39;, 45&#39;HC, 30&#39;, 30&#39;HC, 20&#39;, 20&#39;HC. |  [optional]
**shippingInstructions** | **String** | Special instructions regarding the shipment. This field is for import purchase orders. |  [optional]


<a name="MethodOfPaymentEnum"></a>
## Enum: MethodOfPaymentEnum
Name | Value
---- | -----
PAIDBYBUYER | &quot;PaidByBuyer&quot;
COLLECTONDELIVERY | &quot;CollectOnDelivery&quot;
DEFINEDBYBUYERANDSELLER | &quot;DefinedByBuyerAndSeller&quot;
FOBPORTOFCALL | &quot;FOBPortOfCall&quot;
PREPAIDBYSELLER | &quot;PrepaidBySeller&quot;
PAIDBYSELLER | &quot;PaidBySeller&quot;


<a name="InternationalCommercialTermsEnum"></a>
## Enum: InternationalCommercialTermsEnum
Name | Value
---- | -----
EXWORKS | &quot;ExWorks&quot;
FREECARRIER | &quot;FreeCarrier&quot;
FREEONBOARD | &quot;FreeOnBoard&quot;
FREEALONGSIDESHIP | &quot;FreeAlongSideShip&quot;
CARRIAGEPAIDTO | &quot;CarriagePaidTo&quot;
COSTANDFREIGHT | &quot;CostAndFreight&quot;
CARRIAGEANDINSURANCEPAIDTO | &quot;CarriageAndInsurancePaidTo&quot;
COSTINSURANCEANDFREIGHT | &quot;CostInsuranceAndFreight&quot;
DELIVEREDATTERMINAL | &quot;DeliveredAtTerminal&quot;
DELIVEREDATPLACE | &quot;DeliveredAtPlace&quot;
DELIVERDUTYPAID | &quot;DeliverDutyPaid&quot;




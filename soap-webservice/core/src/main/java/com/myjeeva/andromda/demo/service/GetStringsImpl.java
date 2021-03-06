// license-header java merge-point
/* Autogenerated on 07/23/2012 17:27:04+0530 by AndroMDA!
 *
 * TEMPLATE:    jaxws\WebServiceMethodImpl.vsl in andromda-webservices-cartridge
 * MODEL CLASS: AndroMDAModel::com.myjeeva.andromda.demo::service::SampleWebService::getStrings
 * STEREOTYPE:  WebService on SampleWebService
*/
package com.myjeeva.andromda.demo.service;

import com.myjeeva.andromda.demo.vo.StringsVO;

/**
 * WebService Service Method Implementation for the SampleWebService
 * service org.andromda.cartridges.webservice.metafacades.WebServiceOperationLogicImpl[com.myjeeva.andromda.demo.service.SampleWebService.getStrings].
 * 
 */

public class GetStringsImpl
{
    /**
     * Constructor
     */
    public GetStringsImpl()
    {
        //Documented empty code block - avoid compiler warning
    }

    /**
     * Delegate for TestCase SampleWebServiceWSDelegateTest and SampleWebServiceSEIImplTest
     */
    public static void getStringsSetUp()
    {
        // Insert your custom code here for additional required unit test case setup for service method
    }

    /**
     * Delegate for TestCase SampleWebServiceWSDelegateTest and SampleWebServiceSEIImplTest
     */
    public static void getStringsTearDown()
    {
        // Insert your custom code here for additional required unit test case tear down for service method
    }

   /**
    * Transforms the getStrings service method parameters on SampleWebService.
    * 
    * @param optional datatype.String multiplicity=0..1
    * @param required datatype.String multiplicity=1..1
    * Replace void with transformed type, use target.set() values to create transformation
    */
    public static void getStringsTransformInput(
        final String optional
        , final String required
    )
    {

        if (optional != null)
        {
            // transform(String);
        }

        if (required != null)
        {
            // transform(String);
        }
    }

   /**
    * Transforms input to an output response for getStrings service method on SampleWebService.
    * 
    * @return getStringsResponse StringsVO
    */
    public static StringsVO getStringsTransformResponse(
        /* Domain response to be transformed to service response */)
        // throws TransformationException?
    {
        // Dummy return value implementation with default values...
        // Iterate down through all complex types and create default dummy constructor and attribute values
        StringsVO rtn = new StringsVO();
        rtn.setOptional("optional");
        rtn.setRequired("required");

        return rtn;
    }

    /** Create input test data for SampleWebService getStrings
     * Used by webservice WSClient (against service) and core service WSDelegateTest (against implementation).
     * Return wrapped parameters:
     * optional: String
     * required: String
     * @return getStringsReturn GetStrings WS Input parameter wrapper (assumes wrapped WSDL)
     **/
    public static GetStrings getStringsCreateInput()
    {
        GetStrings getStringsReturn = new GetStrings();

        // parameter1 optionalParam1 with 0 properties:
        String optionalParam1 = "optional";
        getStringsReturn.setOptional(optionalParam1);

        // parameter2 requiredParam2 with 0 properties:
        String requiredParam2 = "required";
        getStringsReturn.setRequired(requiredParam2);

        return getStringsReturn;
    }
}
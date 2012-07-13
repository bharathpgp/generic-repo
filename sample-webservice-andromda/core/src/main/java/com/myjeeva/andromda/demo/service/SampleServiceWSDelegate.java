// license-header java merge-point
/* Autogenerated on 07/13/2012 18:42:36+0530 by AndroMDA
 *
 * TEMPLATE:    jaxws/WebServiceDelegate.vsl in andromda-webservices-cartridge
 * MODEL CLASS: AndroMDAModel::com.myjeeva.andromda.demo::service::SampleService
 * STEREOTYPE:  WebService
*/
package com.myjeeva.andromda.demo.service;

import com.myjeeva.andromda.demo.exceptions.DeclaredException;
import com.myjeeva.andromda.demo.vo.Dates;
import com.myjeeva.andromda.demo.vo.Greeting;
import com.myjeeva.andromda.demo.vo.Strings;
import java.util.Date;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

/**
 * WebService Service Endpoint Implementation delegate for the SampleService service.
 * 
 */

public class SampleServiceWSDelegate
{
   // private static final Logger LOG = LoggerFactory.getLogger(SampleServiceWSDelegate.class);
   // private static final String className = "SampleServiceWSDelegate";

    /**
     * Constructor
     */
    public SampleServiceWSDelegate()
    {
        //Documented empty code block - avoid compiler warning
    }

   /**
    * Invokes the getDates service method on SampleService.
    * 
    * @param start datatype DateTime multiplicity=1..1
    * @param end datatype DateTime multiplicity=1..1
    * @return getDatesResponse Dates
    * @throws DeclaredException
    */
    public Dates getDates
    (
        Date start
      , Date end
    )
        throws DeclaredException
    {
    	// Start and end gets incremented by 1 day for demo purpose
    	Dates rtn = GetDatesImpl.getDatesTransformResponse(start, end);
        
       return rtn;
    }

   /**
    * Invokes the getServiceGreeting service method on SampleService.
    * 
    * @return getServiceGreetingResponse Greeting
    */
    public Greeting getServiceGreeting
    (
    )
    {       
        Greeting rtn = GetServiceGreetingImpl.getServiceGreetingTransformResponse();
        return rtn;
    }

   /**
    * Invokes the getStrings service method on SampleService.
    * 
    * @param optional datatype String multiplicity=0..1
    * @param required datatype String multiplicity=1..1
    * @return getStringsResponse Strings
    */
    public Strings getStrings
    (
        String optional
      , String required
    )
    {
        Strings rtn = GetStringsImpl.getStringsTransformResponse(optional, required);
        return rtn;
    }
}
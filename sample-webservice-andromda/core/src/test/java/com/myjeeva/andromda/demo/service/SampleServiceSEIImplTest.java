// license-header java merge-point
/* Autogenerated on 07/13/2012 18:42:36+0530 by AndroMDA
 *
 * TEMPLATE:    jaxws/WebServiceSEIImplTest.vsl in andromda-webservices-cartridge
 * MODEL CLASS: AndroMDAModel::com.myjeeva.andromda.demo::service::SampleService
 * STEREOTYPE:  WebService
*/
package com.myjeeva.andromda.demo.service;

import com.myjeeva.andromda.demo.vo.Dates;
import com.myjeeva.andromda.demo.vo.Greeting;
import com.myjeeva.andromda.demo.vo.Strings;
import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * WebService Service Delegate Test for the SampleService service.
 * 
 */

public class SampleServiceSEIImplTest extends TestCase
{
    /**
     * Constructor
     * @param name test case name
     */
    public SampleServiceSEIImplTest(String name)
    {
        super(name);
    }

    /**
     * No arg Constructor. Delegates to constructor(String) with test case name
     */
    public SampleServiceSEIImplTest()
    {
        super("SampleService");
    }

    /**
     * @see junit.framework.TestCase#setUp()
     */
    @Override
    protected void setUp() throws Exception
    {
        super.setUp();
    }

    /**
     * @see junit.framework.TestCase#tearDown()
     */
    @Override
    protected void tearDown() throws Exception
    {
        super.tearDown();
    }

    /**
     * Test method for {@link com.myjeeva.andromda.demo.service.SampleServiceSEIImpl#SampleServiceSEIImpl()}.
     */
    public void testSampleServiceSEIImplGetDates()
    {
        // TestCase.setUp and tearDown methods for each individual service method test
        GetDatesImpl.getDatesSetUp();
        GetDates getDatesInput = GetDatesImpl.getDatesCreateInput();
        SampleServiceSEIImpl delegate = new SampleServiceSEIImpl();
        System.out.println("Invoking SampleServiceSEIImpl.getDates with " + getDatesInput);
        try
        {
                Dates rtn = delegate.getDates(
                 getDatesInput.getStart()  // java.util.Date
                , getDatesInput.getEnd()  // java.util.Date
            );
            System.out.println("SampleServiceSEIImpl.getDates" + " returned " + rtn);
        }
        catch (Exception ex)
        {
            System.out.println("SampleServiceSEIImpl.getDates" + " threw exception " + ex);
            fail(ex.toString());
        }
        GetDatesImpl.getDatesTearDown();
    }

    /**
     * Test method for {@link com.myjeeva.andromda.demo.service.SampleServiceSEIImpl#SampleServiceSEIImpl()}.
     */
    public void testSampleServiceSEIImplGetServiceGreeting()
    {
        // TestCase.setUp and tearDown methods for each individual service method test
        GetServiceGreetingImpl.getServiceGreetingSetUp();
        SampleServiceSEIImpl delegate = new SampleServiceSEIImpl();
        System.out.println("Invoking SampleServiceSEIImpl.getServiceGreeting");
            Greeting rtn = delegate.getServiceGreeting(
        );
        System.out.println("SampleServiceSEIImpl.getServiceGreeting" + " returned " + rtn);
        GetServiceGreetingImpl.getServiceGreetingTearDown();
    }

    /**
     * Test method for {@link com.myjeeva.andromda.demo.service.SampleServiceSEIImpl#SampleServiceSEIImpl()}.
     */
    public void testSampleServiceSEIImplGetStrings()
    {
        // TestCase.setUp and tearDown methods for each individual service method test
        GetStringsImpl.getStringsSetUp();
        GetStrings getStringsInput = GetStringsImpl.getStringsCreateInput();
        SampleServiceSEIImpl delegate = new SampleServiceSEIImpl();
        System.out.println("Invoking SampleServiceSEIImpl.getStrings with " + getStringsInput);
            Strings rtn = delegate.getStrings(
             getStringsInput.getOptional()  // java.lang.String
            , getStringsInput.getRequired()  // java.lang.String
        );
        System.out.println("SampleServiceSEIImpl.getStrings" + " returned " + rtn);
        GetStringsImpl.getStringsTearDown();
    }

    /**
     * main() method to run the test with the textual test runner.
     * @param args Not used
     */
    public static void main(final String[] args)
    {
        TestRunner.run(SampleServiceSEIImplTest.class);
    }
}
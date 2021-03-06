 // license-header java merge-point
/* Autogenerated on 10/04/2012 00:33:24+0530 by AndroMDA
 *
 * TEMPLATE:    jaxws/WebServiceDelegate.vsl in andromda-webservices-cartridge
 * MODEL CLASS: AndroMDAModel::com.myjeeva.andromda.demo::service::SearchService
 * STEREOTYPE:  WebService
 * STEREOTYPE:  Service
*/
package com.myjeeva.andromda.demo.service;

import com.myjeeva.andromda.demo.vo.DocumentVO;
import com.myjeeva.andromda.demo.vo.SearchResultVO;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

/**
 * WebService Service Endpoint Implementation delegate for the SearchService service.
 * 
 */

public class SearchServiceWSDelegate
{
   // private static final Logger LOG = LoggerFactory.getLogger(SearchServiceWSDelegate.class);
   // private static final String className = "SearchServiceWSDelegate";

    /**
     * Constructor
     */
    public SearchServiceWSDelegate()
    {
        //Documented empty code block - avoid compiler warning
    }

   /**
    * Invokes the indexDocument service method on SearchService.
    * 
    * @param documents com.myjeeva.andromda.demo.vo DocumentVO multiplicity=0..-1
    * @return indexDocumentResponse java.lang.Boolean
    */
    public java.lang.Boolean indexDocument
    (
        java.util.List<com.myjeeva.andromda.demo.vo.DocumentVO> documents
    )
    {
        // Populate method wrapper object so all parameters can be logged and transformed at once
        // Transform input parameters to domain request object
        /*java.lang.Boolean rtn =*/ IndexDocumentImpl.indexDocumentTransformInput(
            documents
        );

        //TODO: Implement service operation
        //throw new UnsupportedOperationException("Service SearchService.indexDocument not implemented.");
        // Dummy return value implementation with default values, modify Impl class.
        java.lang.Boolean rtn = IndexDocumentImpl.indexDocumentTransformResponse(/* Domain response to be transformed to service response */);
        return rtn;
    }

   /**
    * Invokes the performSearch service method on SearchService.
    * 
    * @param queryTerm datatype String multiplicity=1..1
    * @return performSearchResponse com.myjeeva.andromda.demo.vo.SearchResultVO
    */
    public com.myjeeva.andromda.demo.vo.SearchResultVO performSearch
    (
        java.lang.String queryTerm
    )
    {
    	SearchResultVO searchResult = new SearchResultVO();
        
        DocumentVO document1 = new DocumentVO();
        document1.setId("MA147LL/A");
        document1.setName("Apple 60 GB iPod with Video Playback Black");
        document1.setInStock(Boolean.TRUE);
        document1.setPrice(Double.valueOf(399.0));
        document1.getFeatures().add("iTunes, Podcasts, Audiobooks");
        document1.getFeatures().add("Stores up to 15,000 songs, 25,000 photos, or 150 hours of video");
        document1.getFeatures().add("2.5-inch, 320x240 color TFT LCD display with LED backlight");
        document1.getFeatures().add("Plays AAC, MP3, WAV, AIFF, Audible, Apple Lossless, H.264 video");
        document1.getFeatures().add("Notes, Calendar, Phone book, Hold button, Date display, "
					+ "Photo wallet, Built-in games, JPEG photo playback, Upgradeable "
					+ "firmware, USB 2.0 compatibility, Playback speed control, "
					+ "Rechargeable capability, Battery level indication");
        
        DocumentVO document2 = new DocumentVO();
        document2.setId("6H500F0");
        document2.setName("Maxtor DiamondMax 11 - hard drive - 500 GB - SATA-300");
        document2.setInStock(Boolean.FALSE);
        document2.setPrice(Double.valueOf(350.0));
        document2.getFeatures().add("SATA 3.0Gb/s, NCQ");
        document2.getFeatures().add("8.5ms seek");
        document2.getFeatures().add("16MB cache");
        
        DocumentVO document3 = new DocumentVO();
        document3.setId("IW-02");
        document3.setName("iPod &amp; iPod Mini USB 2.0 Cable");
        document3.setInStock(Boolean.TRUE);
        document3.setPrice(Double.valueOf(11.5));
        document3.getFeatures().add("car power adapter for iPod, white");
        
        searchResult.getDocuments().add(document1);
        searchResult.getDocuments().add(document2);
        searchResult.getDocuments().add(document3);
        
        return searchResult;
    }
}


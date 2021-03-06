
package org.example.simpleservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.simpleservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.simpleservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IsimGetirResponse }
     * 
     */
    public IsimGetirResponse createIsimGetirResponse() {
        return new IsimGetirResponse();
    }

    /**
     * Create an instance of {@link SiparisGetirRequest }
     * 
     */
    public SiparisGetirRequest createSiparisGetirRequest() {
        return new SiparisGetirRequest();
    }

    /**
     * Create an instance of {@link SiparisGetirResponse }
     * 
     */
    public SiparisGetirResponse createSiparisGetirResponse() {
        return new SiparisGetirResponse();
    }

    /**
     * Create an instance of {@link IsimGetirRequest }
     * 
     */
    public IsimGetirRequest createIsimGetirRequest() {
        return new IsimGetirRequest();
    }

    /**
     * Create an instance of {@link Siparis }
     * 
     */
    public Siparis createSiparis() {
        return new Siparis();
    }

}

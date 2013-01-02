
package com.team.generatedCode;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.4
 * 2013-01-02T11:12:03.351+02:00
 * Generated source version: 2.6.4
 * 
 */
public final class SimpleService_P1_Client {

    private static final QName SERVICE_NAME = new QName("http://www.example.org/SimpleService/", "SimpleService");

    private SimpleService_P1_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = SimpleService_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        SimpleService_Service ss = new SimpleService_Service(wsdlURL, SERVICE_NAME);
        SimpleService port = ss.getP1();  
        
        {
        System.out.println("Invoking siparisGetir...");
        SiparisGetirRequest _siparisGetir_parameters = new SiparisGetirRequest();
        Siparis siparis=new Siparis();
        siparis.setS1("s1");
        siparis.setS2("S2");
        _siparisGetir_parameters.setSiparis(siparis);
        SiparisGetirResponse _siparisGetir__return = port.siparisGetir(_siparisGetir_parameters);
        System.out.println("siparisGetir.result=" + _siparisGetir__return.getOut());


        }
        {
        System.out.println("Invoking isimGetir...");
        IsimGetirRequest _isimGetir_parameters = new IsimGetirRequest();
        _isimGetir_parameters.setAd("ad");
        _isimGetir_parameters.setSoyad("soyad");
        IsimGetirResponse _isimGetir__return = port.isimGetir(_isimGetir_parameters);
        System.out.println("isimGetir.result=" + _isimGetir__return.getOut());


        }

        System.exit(0);
    }

}
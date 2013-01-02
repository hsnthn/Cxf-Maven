package com.team.codeGenerator;

import org.apache.cxf.tools.wsdlto.WSDLToJava;


public class CreatWsdlToJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WSDLToJava.main(new String[] {
				"-client",
				"-d", "src/main/java/com/team/generatedCode/",
				"src/main/resources/SimpleService.wsdl" });
		
	}

}

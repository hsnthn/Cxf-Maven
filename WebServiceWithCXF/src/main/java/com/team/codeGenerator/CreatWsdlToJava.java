package com.team.codeGenerator;
import org.apache.cxf.tools.wsdlto.WSDLToJava;


public class CreatWsdlToJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WSDLToJava.main(new String[] {
				"-server",
				"-d", "src/main/java/com/team/generatedCode/",
				"src/main/resources/SimpleService.wsdl" });
		
	}

}

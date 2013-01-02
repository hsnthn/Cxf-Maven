package com.team.webservice.interfaces;

import javax.jws.WebService;

import com.team.generatedCode.IsimGetirRequest;
import com.team.generatedCode.IsimGetirResponse;
import com.team.generatedCode.SimpleService;
import com.team.generatedCode.SiparisGetirRequest;
import com.team.generatedCode.SiparisGetirResponse;


@WebService(endpointInterface = "com.team.generatedCode.SimpleService")
public class SimpleServiceImpl implements SimpleService{
	IsimGetirResponse isimGetirResponse = new IsimGetirResponse();
	SiparisGetirResponse siparisResponse=new SiparisGetirResponse();

	public IsimGetirResponse isimGetir(IsimGetirRequest parameters) {
		isimGetirResponse.setOut(parameters.getAd()+" "+parameters.getSoyad());
		return isimGetirResponse;
	}

	public SiparisGetirResponse siparisGetir(SiparisGetirRequest siparis) {
		siparisResponse.setOut(siparis.getSiparis().getS1());
		return siparisResponse;
	}

}

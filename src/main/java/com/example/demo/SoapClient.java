package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.example.generate.wsdl.classes.AdditionRequest;
import com.example.generate.wsdl.classes.AdditionResponse;

@Service
public class SoapClient {
	
	@Autowired
	private Jaxb2Marshaller marshaller;
	
	private WebServiceTemplate template;
	
	public AdditionResponse getAddition(AdditionRequest request)
	{
		
		template=new WebServiceTemplate(marshaller);
		AdditionResponse res=(AdditionResponse) template.marshalSendAndReceive("http://localhost:9098/service",request);
		
		return res;
	}

}

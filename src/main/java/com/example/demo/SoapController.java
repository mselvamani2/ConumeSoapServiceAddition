package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.generate.wsdl.classes.AdditionRequest;
import com.example.generate.wsdl.classes.AdditionResponse;

@RestController
@RequestMapping("/api")
public class SoapController {

	
	@Autowired
	private SoapClient client;
	
	@PostMapping("/consumeAddition")
public AdditionResponse getAddResult(@RequestBody AdditionRequest req)
{
		return client.getAddition(req);
}
	
}

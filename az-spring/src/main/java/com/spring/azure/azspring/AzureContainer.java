package com.spring.azure.azspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureContainer {
	
	@GetMapping("welcome")
	public String hello()
	{
		
		return "welcome to Azure Web App Deployment"; 
	}

}

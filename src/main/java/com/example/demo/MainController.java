package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class MainController {
	@RequestMapping(value = "/getDetails", method = RequestMethod.POST)
	public String getDetails(@RequestBody CustomerDetails details)
	{
		System.out.print(details);
		return " " + details;
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/hello-world")  
	public String helloWorld()  
	{  
	return "Hello World";  
	}  
}

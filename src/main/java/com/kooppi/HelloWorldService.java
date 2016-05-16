package com.kooppi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloWorldService {
	
	public HelloWorldService() {}
	
	@GET
	public String getMsg() {
 
 
		return "HelloWorld";
	}
 
}

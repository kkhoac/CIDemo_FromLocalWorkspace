package com.kooppi.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kooppi.HelloWorldService;

public class HelloWorldServiceTest {
	
	HelloWorldService helloWorldService = new HelloWorldService();

	@Test
	public void test() {
		assertEquals("HelloWorld", helloWorldService.getMsg());
	}

}

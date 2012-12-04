package com.seeburger.martin.helloworld;

import junit.framework.TestCase;

import org.junit.Test;


public class TestHelloWorld extends TestCase
{

//	@Test
//	public void testSayHello()
//	{
//		fail("This should fail!");
//	}

	@Test
	public void testSayHello2()
	{
		assertEquals("Hello, OKMONOG!", HelloWorld.sayHello());
	}
}

package org.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWordTest {

	@Test
	public void testSayHello() {
		HelloWord fixture = new HelloWord();
		assertEquals("Hello World", fixture.sayHello());
	}

}

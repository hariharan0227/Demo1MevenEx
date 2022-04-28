package com.lti;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCal {
//
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	Calculator c = new Calculator();
	@Test
	public void testHello()
	{
		Assertions.assertEquals("Hello World !", c.sayHello());
	}
	@Test
	public void testAddition()
	{
		Assertions.assertEquals(500,c.addNos(300,200));
	}
	
	@Test
	public void testSubtraction()
	{
		Assertions.assertEquals(60000,c.subNos(300,200));
	}


}

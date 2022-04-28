package com.lti;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TestBeforeAfter {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	@Test
	public void testAddition()
	{
	System.out.println("test add method ");
	Calculator c= new Calculator();
	int result= c.addNos(100, 300);
	Assertions.assertEquals(400, result);
	}
	@Test
	public void testSub()
	{
	System.out.println("test sub method ");
	Calculator x= new Calculator();
	int result= x.subNos(100, 50) ;
	Assertions.assertEquals(50, result);
	}
	@BeforeAll
	public static void testConn() {
		System.out.println("DB Conn is up");
	}
	
	@AfterAll
	public static void testCloseConn() {
		System.out.println("DB Conn is closed");
	}

}

package com.lti.JUnitDemo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;

class MySampleTest {

//	@Test
//	void testAdd() {
//		int r = Calculator.add(100,200);
//		Assertions.assertEquals(300, r);
//	}
	@Test
	void testAdd() {
		int result=Calculator.add(100, 200);
		Assertions.assertEquals(300, result);
		                        //expected, actual, optional message
		Assertions.assertEquals(100,Calculator.add(50,50),"Testing add method");
		Assertions.assertNotEquals(100, result);
	}
	
	@Test
	void testAssertFalse() {
		Assertions.assertFalse("Nisha".length()==10);
		Assertions.assertFalse(5>10,"Comaprison of values");
	}
	
	@Test
	void testAssertNull() {
		String s1=null;
		String s2="abc";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);

	}
//	void testAssertAll() {
//		String s11="abc";
//		String s12="pqr";
//		String s13="xyz";
//		Assertions.assertAll("data",
//				()->Assertions.assertEquals(s11, "abc"),
//				()->Assertions.assertEquals(s12, "pqr"),
//				()->Assertions.assertEquals(s13, "xyz"));	
//	}
//	
//	@Test
//	void testCollections()
//	{
//		ArrayList<String> myList=new ArrayList<>();
//		myList.add("Hiii");
//		Assertions.assertFalse(myList.isEmpty());
//		
//		ArrayList<Integer> myList1=new ArrayList<Integer>();
//		Assertions.assertEquals(true,myList1.isEmpty());	
//	}

}

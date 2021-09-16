package com.lti.JUnitDemo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demo.MyApp;



class MyAppTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	} 
	@Test
	void test() {
		MyApp m = new MyApp();
		String s = m.show();
		Assertions.assertEquals("hello maven", s);
	}

}

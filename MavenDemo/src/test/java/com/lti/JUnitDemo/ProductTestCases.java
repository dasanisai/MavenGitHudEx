package com.lti.JUnitDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.lti.demo.Product;

class ProductTestCases {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	@Test
	public void testCompanyName() {
		Product p = new Product(101,"charger",10000.00);
		Assertions.assertEquals("DMART",p.getCompanyName());
	}

}

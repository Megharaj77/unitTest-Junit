package com.skillsoft.junit.junit_project10;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;

import org.junit.jupiter.api.condition.JRE;


public class ProductTest {

	static Product tv;
	
	@BeforeAll
	static void init() {
		tv=new Product("Diallonic", "Delta", 13423, 800, "Electronics");
	}
	
	
//	@Test
//	@DisplayName("Brand Name Test")
//	@EnabledOnJre(JRE.JAVA_17)
//	void brandNameTest() {
//		assertEquals("Diallonic", tv.getBrandName(), "Brand Name Test");
//	}
//	
//	@Test
//	@DisplayName("Price Test")
//	@EnabledOnJre(JRE.JAVA_16)
//	void priceTest() {
//		assertEquals(800, tv.getPrice(), "Price Test");
//	}
//	
//	@Test
//	@DisplayName("Category Test")
//	@DisabledOnJre(JRE.JAVA_17)
//	void categoryTest() {
//		assertEquals("Electronics", tv.getCategory(), "Category Test");
//	}
	
//	@Test
//	@DisplayName("Brand Name Test")
//	@EnabledForJreRange(max=JRE.JAVA_11)
//	void brandNameTest() {
//		assertEquals("Diallonic", tv.getBrandName(), "Brand Name Test");
//	}
//	
//	@Test
//	@DisplayName("Price Test")
//	@EnabledForJreRange(min=JRE.JAVA_9, max=JRE.JAVA_17)	
//	void priceTest() {
//		assertEquals(800, tv.getPrice(), "Price Test");
//	}
//	
//	@Test
//	@DisplayName("Category Test")
//	@EnabledForJreRange(min=JRE.JAVA_17)	
//	void categoryTest() {
//		assertEquals("Electronics", tv.getCategory(), "Category Test");
//	}
	
	
	@Test
	@DisplayName("Brand Name Test")
	@DisabledForJreRange(max=JRE.JAVA_11)
	void brandNameTest() {
		assertEquals("Diallonic", tv.getBrandName(), "Brand Name Test");
	}
	
	@Test
	@DisplayName("Price Test")
	@DisabledForJreRange(min=JRE.JAVA_9, max=JRE.JAVA_17)	
	void priceTest() {
		assertEquals(800, tv.getPrice(), "Price Test");
	}
	
	@Test
	@DisplayName("Category Test")
	@EnabledForJreRange(min=JRE.JAVA_17)	
	void categoryTest() {
		assertEquals("Electronics", tv.getCategory(), "Category Test");
	}
}

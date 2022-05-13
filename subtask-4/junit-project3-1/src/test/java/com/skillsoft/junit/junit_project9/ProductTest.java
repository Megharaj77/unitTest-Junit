package com.skillsoft.junit.junit_project9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ProductTest {

	static Product tv;
	
	@BeforeAll
	static void init() {
		tv=new Product("Diallonic", "Delta", 13423, 800, "Electronics");
	}
	
	
//	@Test
//	@DisplayName("Brand Name Test")
//	void brandNameTest() {
//		assertEquals("Diallonic", tv.getBrandName(), "Brand Name Test");
//	}
//	
//	@Test
//	@DisplayName("Price Test")
//	void priceTest() {
//		assertEquals(800, tv.getPrice(), "Price Test");
//	}
//	
//	@Test
//	@DisplayName("Category Test")
//	void categoryTest() {
//		assertEquals("Electronics", tv.getCategory(), "Category Test");
//	}
	
//	@Test
//	@DisplayName("Brand Name Test")
//	@Disabled
//	void brandNameTest() {
//		assertEquals("Diallonic", tv.getBrandName(), "Brand Name Test");
//	}
//	
//	@Test
//	@DisplayName("Price Test")
//	void priceTest() {
//		assertEquals(800, tv.getPrice(), "Price Test");
//	}
//	
//	@Test
//	@DisplayName("Category Test")
//	@Disabled
//	void categoryTest() {
//		assertEquals("Electronics", tv.getCategory(), "Category Test");
//	}
	
	
//	@Test
//	@DisplayName("Brand Name Test")
//	@EnabledOnOs(OS.WINDOWS)
//	void brandNameTest() {
//		assertEquals("Diallonic", tv.getBrandName(), "Brand Name Test");
//	}
//	
//	@Test
//	@DisplayName("Price Test")
//	@EnabledOnOs(OS.LINUX)
//	void priceTest() {
//		assertEquals(800, tv.getPrice(), "Price Test");
//	}
//	
//	@Test
//	@DisplayName("Category Test")
//	@EnabledOnOs(OS.MAC)
//	void categoryTest() {
//		assertEquals("Electronics", tv.getCategory(), "Category Test");
//	}
	
//	@Test
//	@DisplayName("Brand Name Test")
//	@DisabledOnOs(OS.WINDOWS)
//	void brandNameTest() {
//		assertEquals("Diallonic", tv.getBrandName(), "Brand Name Test");
//	}
//	
//	@Test
//	@DisplayName("Price Test")
//	@DisabledOnOs(OS.MAC)
//	void priceTest() {
//		assertEquals(800, tv.getPrice(), "Price Test");
//	}
//	
//	@Test
//	@DisplayName("Category Test")
//	@DisabledOnOs(OS.LINUX)
//	void categoryTest() {
//		assertEquals("Electronics", tv.getCategory(), "Category Test");
//	}
//	
	@Test
	@DisplayName("Brand Name Test")
	@EnabledOnJre(JRE.JAVA_10)
	void brandNameTest() {
		assertEquals("Diallonic", tv.getBrandName(), "Brand Name Test");
	}
	
	@Test
	@DisplayName("Price Test")
	void priceTest() {
		assertEquals(800, tv.getPrice(), "Price Test");
	}
	
	@Test
	@DisplayName("Category Test")
	void categoryTest() {
		assertEquals("Electronics", tv.getCategory(), "Category Test");
	}
}

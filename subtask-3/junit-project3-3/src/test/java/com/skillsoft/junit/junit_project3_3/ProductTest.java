package com.skillsoft.junit.junit_project3_3;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;

import org.junit.jupiter.api.condition.JRE;


public class ProductTest {

	static Product tv;
	
//	@BeforeAll
//	static void init() {
//		tv=new Product("Diallonic", "Delta", 13423, 800, "Electronics");
//		
//		System.out.println("System Properties");
//		System.out.println("os.arch: "+ System.getProperty("os.arch"));
//		System.out.println("os.version: " + System.getProperty("os.version"));
//		System.out.println("os.name: " + System.getProperty("os.name"));
//		System.out.println("user.name: " + System.getProperty("user.name"));
//	}
//	
//	@Test
//	@DisplayName("Brand Name Check")
//	@EnabledIfSystemProperty(named="os.arch", matches="x84_64")
//	void brandNameTest() {
//		assertEquals("Diallonic", tv.getBrandName(),"Brand name Test");
//	}
//	
//    @Test
//    @DisplayName("Price Check")
//    @EnabledIfSystemProperty(named="os.version", matches="10\\..*")
//    void priceTest() {
//    	
//    	assertEquals(800, tv.getPrice(), "Price Test");
//    }
//    
//    @Test
//    @DisplayName("Model Check")
//    @DisabledIfSystemProperty(named="os.arch", matches=".*_64")
//    void modelTest() {
//    	assertEquals("Delta", tv.getModel(), "Model Test");
//    }
	
	
	
	
	/*enable and disable based on envi*/
	
	
	
	@BeforeAll
	static void init() {
		tv=new Product("Diallonic", "Delta", 13423, 800, "Electronics");
		
		System.out.println("Environment variable");
		System.out.println("PROCESSOR_LEVEL: "+ System.getenv("PROCESSOR_LEVEL"));
		System.out.println("USERDOMAIN: " + System.getenv("USERDOMAIN"));
		System.out.println("ALL: " + System.getenv());
		
	}
	
	@Test
	@DisplayName("Brand Name Check")
	@EnabledIfEnvironmentVariable(named="PROCESSOR_LEVEL", matches="6")
	void brandNameTest() {
		assertEquals("Diallonic", tv.getBrandName(),"Brand name Test");
	}
	
    @Test
    @DisplayName("Price Check")
    @EnabledIfEnvironmentVariable(named="USERDOMAIN", matches="AMERICAS")
    void priceTest() {
    	
    	assertEquals(800, tv.getPrice(), "Price Test");
    }
    
    @Test
    @DisplayName("Model Check")
    @DisabledIfEnvironmentVariable(named="USERDOMAIN", matches="AMERICAS")
    void modelTest() {
    	assertEquals("Delta", tv.getModel(), "Model Test");
    }
    
    
    @Test
    @DisplayName("Category Check")
    @DisabledIfEnvironmentVariable(named="LANG", matches="de_DE*")
    void categoryTest() {
    	assertEquals("Electronics", tv.getCategory(), "Category Test");
    }
}

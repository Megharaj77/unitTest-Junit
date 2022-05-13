package com.skillsoft.junit.junit_project3_4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

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
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import com.skillsoft.junit.junit_project3_4.Product;


public class ProductTest {

	static Product tv;
	
//	@BeforeAll
//	static void init() {
//		tv=new Product("Diallonic", "Delta", 13423, 800, "Electronics");
//		
//		System.out.println("Environment variable");
//		System.out.println("PROCESSOR_LEVEL: "+ System.getenv("PROCESSOR_LEVEL"));
//		System.out.println("USERDOMAIN: " + System.getenv("USERDOMAIN"));
//		System.out.println("ALL: " + System.getenv());
//		
//	}
//	
//	@Test
//	@DisplayName("Brand Name Check")
//	@EnabledIfEnvironmentVariable(named="PROCESSOR_LEVEL", matches="6")
//	@EnabledForJreRange(max=JRE.JAVA_11)
//	void brandNameTest() {
//		assertEquals("Diallonic", tv.getBrandName(),"Brand name Test");
//	}
//	
//    @Test
//    @DisplayName("Price Check")
//    @EnabledIfEnvironmentVariable(named="USERDOMAIN", matches="AMERICAS")
//    @EnabledForJreRange(min=JRE.JAVA_11, max=JRE.JAVA_17)
//    void priceTest() {
//    	
//    	assertEquals(800, tv.getPrice(), "Price Test");
//    }
//    
//    @Test
//    @DisplayName("Model Check")
//    @DisabledIfEnvironmentVariable(named="USERDOMAIN", matches="AMERICAS")
//    @EnabledOnOs(OS.MAC)
//    void modelTest() {
//    	assertEquals("Delta", tv.getModel(), "Model Test");
//    }
//    
//    
//    @Test
//    @DisplayName("Category Check")
//    @DisabledIfEnvironmentVariable(named="LANG", matches="de_DE*")
//    @DisabledForJreRange(min=JRE.JAVA_14)
//    void categoryTest() {
//    	assertEquals("Electronics", tv.getCategory(), "Category Test");
//    }
    
    /*Custom annotation*/
	
	
	
	
	@BeforeAll
	static void init() {
		tv=new Product("Diallonic", "Delta", 13423, 800, "Electronics");
		
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Test
	@EnabledForJreRange(min=JRE.JAVA_11, max=JRE.JAVA_17)
	@EnabledOnOs(OS.WINDOWS)
	@EnabledIfSystemProperty(named="os.arch", matches="amd64")
	public @interface MyCustomTestConditions{
		
	}
	
	@MyCustomTestConditions
	@DisplayName("Brand Name Check")
	void brandNameTest() {
		assertEquals("Diallonic", tv.getBrandName(),"Brand name Test");
	}
	
	@MyCustomTestConditions
	@EnabledIfEnvironmentVariable(named="PROCESSOR_LEVEL", matches="6")
    @DisplayName("Price Check")
    void priceTest() {
    	
    	assertEquals(800, tv.getPrice(), "Price Test");
    }
    
	@MyCustomTestConditions
    @DisplayName("Model Check")
    @DisabledIfEnvironmentVariable(named="USERDOMAIN", matches="AMERICAS")
    void modelTest() {
    	assertEquals("Delta", tv.getModel(), "Model Test");
    }
    
	@MyCustomTestConditions
    @DisplayName("Category Check")
    @EnabledIfEnvironmentVariable(named="LANG", matches="de_DE*")
    void categoryTest() {
    	assertEquals("Electronics", tv.getCategory(), "Category Test");
    }
   
}

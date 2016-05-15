import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestProductCategory {

	private static ProductCategory start;
	
	Logger logger = Logger.getLogger(this.getClass());
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}
	@Before
	 public void before() {
	  start = new ProductCategory();
	}
	@After
	public void after(){
		
		SetUpDriver.killDriver();
	}
	@AfterClass
	 public static void afterClass() {
	  
	}
	
	/*@Test
	public void testlog(){
		
		logger.info("Starting..");
		logger.debug("Very detailed log");
		logger.fatal("Terribly failing!");
}*/ 

	//Verifiera att samtliga produktkategorier går att öppnas
		@Test
		public void Test_3a_1(){
			
			start.category();
		}
}

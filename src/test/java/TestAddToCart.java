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

public class TestAddToCart {

	private static AddToCart start;
	
	Logger logger = Logger.getLogger(this.getClass());
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}
	@Before
	 public void before() {
	  start = new AddToCart();
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
	//Verifiera att korrekt produkttitel visas i fönstret som dyker upp när man trycker
	//på ”Add To Cart”
		@Test
		public void Test_5a_1(){
	
			start.AddToCart1();
		
		}
		
		//Verifiera att ”Go to Checkout”-knappen fungerar
		@Test
		public void Test_5a_2(){
	
			start.GoToChekOut();
		
		}

		//Verifiera att ”Continue Shopping”-knappen fungerar
		@Test
		public void Test_5a_3(){
	
			start.ContinueShopping();
		
		}
}

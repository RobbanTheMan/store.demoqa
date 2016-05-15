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

public class TestHomeflik {

	private static Home start;
	
	Logger logger = Logger.getLogger(this.getClass());
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}
	@Before
	 public void before() {
	  start = new Home();
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
	
	// ********************1A. Produkter********************
	
	
	//Verifiera att ”Buy Now”-knappen leder till produktens produktsida
	@Test
	public void Test_1a_1() {
		
		start.BuyNow();
	}
	
	//Verifiera att man kommer till produktens produktsida om man trycker på bilden.
	@Test
	public void Test_1a_2() {
		
		start.Picture();	  
		
	}
	
	//Verifiera att ”More Info”-länken leder till produktens produktsida.
	@Test
	public void Test_1a_3() {
		
		start.MoreInfo();	  
		
	}
	
	//Verifiera att tre produkter visas i bildspelet och att det bläddras automatiskt.
	@Test
	public void Test_1a_4(){
		
		start.SlideShow();
	
	}
	
	//Verifiera att det går att bläddra manuellt i bildspelet.
	@Test
	public void Test_1a_5(){
		
		start.MSlide();
	
	}
		
	// ********************1B. Latest Blog Post********************
	
	
	//Verifiera att ”Latest Blog Post”-sektionen visar produkter.
	@Test
	public void Test_1b_1(){
		
		start.LatestBlogPost();
		
	}
	
	//Verifiera att produkttitlarna leder till produktens produktsida
	@Test
	public void Test_1b_2(){
		
		start.ProductTitle();
		
	}
	
	//Verifiera att man kommer till produktens produktsida om man trycker på bilden
	@Test
	public void Test_1b_3(){
		
		
		start.ProductImage();
	}

	//Verifiera att ”More Details”-länken leder till produktens produktsida
	@Test
	public void Test_1b_4(){
		
		start.ImageMoreInfo();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


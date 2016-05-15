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

public class TestProduktsidor {

	private static ProductSite start;
	
	Logger logger = Logger.getLogger(this.getClass());
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}
	@Before
	 public void before() {
	  start = new ProductSite();
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
	//Verifiera att produktsidan innehåller: Titel, produktbeskrivning och pris.
	@Test
	public void Test_2a_1() {
		
		start.VerifyPDSite();	//Innehåller alla tre.
	}
	
	//Verifiera att det går att lägga produkten i varukorgen.
	@Test
	public void Test_2b_1() {
		
		start.Cart();
	}
	
	//Verifiera att det går att betygsätta produkten med sjärnorna
	@Test
	public void Test_2c_1(){
		
		start.rated(); 		//redan har betygsatt på nytt och försöker att betygsätta igen.
	}
	

}


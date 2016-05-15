import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class SearchProducts extends SetUpDriver{

	
	public SearchProducts(){
		driver.get("http://store.demoqa.com");
		
	}

	// ********************4A. Search Products ********************
	
	public void Search(){


		String Search = "mouse";
		driver.findElement(By.name("s")).clear();
		driver.findElement(By.name("s")).sendKeys(Search);
		driver.findElement(By.name("s")).sendKeys(Keys.RETURN);

		WebElement obj = driver.findElement(By.xpath("//*[@id='grid_view_products_page_container']/div/div/div/a/img"));

		String searchResult = obj.getAttribute("alt").toString();
		System.out.println("s : "+ searchResult);

		Assert.assertEquals("Sorry, but nothing matched your search " + Search + " failed", true, searchResult.contains("Mouse"));

		
	}

}
//********************4A. Search Products ends ********************
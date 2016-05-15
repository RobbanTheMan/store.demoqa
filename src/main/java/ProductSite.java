import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class ProductSite extends SetUpDriver{

	
	public ProductSite(){
		driver.get("http://store.demoqa.com/products-page/product-category/accessories/magic-mouse/");
		
	}
	
	// ********************2A. Produktsidor********************
	
	public void VerifyPDSite(){
		driver.findElement(By.className("prodtitle"));
		
		Assert.assertEquals("Unexpected title", "Magic Mouse", driver.findElement(By.className("prodtitle")).getText());
		
		String prodText = driver.findElement(By.className("product_description")).getText();
		System.out.println("String prodText = " + prodText);
		
		
		String prodPrice = driver.findElement(By.className("currentprice")).getText();
		System.out.println("String prodPrice = " + prodPrice);
		Assert.assertEquals("Unexpected price", "$150.00", prodPrice);
	}
	
	public void Cart(){
		driver.getTitle();
		Assert.assertEquals("Unexpected title", "Magic Mouse | ONLINE STORE", driver.getTitle());
		int countpre = Integer.parseInt(driver.findElement(By.className("count")).getText());
		driver.findElement(By.className("wpsc_buy_button")).click();
		sleep(4);
		int count = Integer.parseInt(driver.findElement(By.className("count")).getText());
		Assert.assertEquals("Unexpected Value", countpre + 1, count);
		
	}
	
	public void rated(){
		driver.findElement(By.className("wpec-star-rating:nth-child(5)")).click();
		sleep(4);
		String message = driver.findElement(By.className("message")).getText();
		Assert.assertEquals("Sorry, you already rated!", message);
		
		
	}
	
}
//********************2A. Produktsidor ends********************
	
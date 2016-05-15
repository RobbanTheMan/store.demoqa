import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class ProductCategory extends SetUpDriver{

	
	public ProductCategory(){
		driver.get("http://store.demoqa.com/");
		
	}
	// ********************3A. Product category” flik ********************
	
		//Verifiera att samtliga produktkategorier går att öppnas
		public void category(){
			action();
			driver.findElement(By.id("menu-item-34")).click();
			driver.getTitle();
			Assert.assertEquals("Unexpected title", "Accessories | ONLINE STORE", driver.getTitle());
			action();		
			driver.findElement(By.id("menu-item-35")).click();
			driver.getTitle();
			Assert.assertEquals("Unexpected title", "iMacs | ONLINE STORE", driver.getTitle());
			action();		
			driver.findElement(By.id("menu-item-36")).click();
			driver.getTitle();
			Assert.assertEquals("Unexpected title", "iPads | ONLINE STORE", driver.getTitle());
			action();		
			driver.findElement(By.id("menu-item-37")).click();
			driver.getTitle();
			Assert.assertEquals("Unexpected title", "iPhones | ONLINE STORE", driver.getTitle());
			action();		
			driver.findElement(By.id("menu-item-38")).click();
			driver.getTitle();
			Assert.assertEquals("Unexpected title", "iPods | ONLINE STORE", driver.getTitle());
			action();		
			driver.findElement(By.id("menu-item-39")).click();
			driver.getTitle();
			Assert.assertEquals("Unexpected title", "MacBooks | ONLINE STORE", driver.getTitle());
			sleep(5);
		}
}
//********************3A. Product category” flik ends********************
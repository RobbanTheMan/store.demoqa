import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class AddToCart extends SetUpDriver{

	
	public AddToCart(){
		driver.get("http://store.demoqa.com");
		
	}
	
	// ********************5A. Add to Cart********************

	public void AddToCart1(){


		driver.findElement(By.cssSelector(".slide")).click();

		String Prodtitle = driver.findElement(By.className("prodtitle")).getText();
//		System.out.println("Selected Product Title"+ Prodtitle);

		driver.findElement(By.className("wpsc_buy_button")).click();
		sleep(2);
		String actualProdTitle = driver.findElement(By.xpath("//*[@id='fancy_notification_content']/span")).getText();
//		System.out.println("Actual Product Title"+actualProdTitle);

		Assert.assertEquals("Error product title in the pop up is not the same" , true, actualProdTitle.contains(Prodtitle));
	}

	
	
	
	public void GoToChekOut(){
		driver.findElement(By.cssSelector(".slide")).click();
		  driver.findElement(By.className("wpsc_buy_button")).click();
		  sleep(2);
		  driver.findElement(By.xpath("//*[@id='fancy_notification_content']/a[1]")).click();
		  
		  sleep(2);
		  
		  Assert.assertTrue("Error the checkout button does not work!", driver.getTitle().contains("Checkout"));
		  
	}
	
	
	
	public void ContinueShopping(){
		
		driver.findElement(By.cssSelector(".slide")).click();
		  
		  String selectedProdName = driver.findElement(By.className("prodtitle")).getText();
		  driver.findElement(By.className("wpsc_buy_button")).click();
		  sleep(2);
		  
		  driver.findElement(By.xpath("//*[@id='fancy_notification_content']/a[2]")).click();
		  sleep(2);
		  
		  Assert.assertTrue("Error the Continue Shopping button does not work!", driver.getTitle().contains(selectedProdName));
		  
		  
		  
	}

}
			//********************5A. Add to Cart ends********************
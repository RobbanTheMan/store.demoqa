import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class Home extends SetUpDriver{

	
	public Home(){
		driver.get("http://store.demoqa.com/");
		
	}
	
	
	// ********************1A. Produkter********************

	public void BuyNow() {
		
		driver.findElement(By.xpath("//*[@class='buynow'][@href='http://store.demoqa.com/products-page/product-category/accessories/magic-mouse/']")).click();
		Assert.assertEquals(driver.getTitle(), "Magic Mouse | ONLINE STORE");
		
			  
			 }
		
		public void Picture(){
		
		driver.findElement(By.xpath("//*[@alt='Magic Mouse']")).click();
		Assert.assertEquals(driver.getTitle(), "Magic Mouse | ONLINE STORE");
		
			
	}

		public void MoreInfo(){
			
			driver.findElement(By.xpath("//*[@title='More Info']")).click();
			Assert.assertEquals(driver.getTitle(), "Magic Mouse | ONLINE STORE");
			
			
		}
		
		public void SlideShow(){
			
			Assert.assertEquals(driver.findElement(By.xpath("//*[@id='slides']/div[1]/div[1]/h2")).getText(),"Magic Mouse");
			sleep(8);
			Assert.assertEquals(driver.findElement(By.xpath("//*[@id='slides']/div[1]/div[1]/h2")).getText(),"iPhone 5");
			sleep(8);
			Assert.assertEquals(driver.findElement(By.xpath("//*[@id='slides']/div[1]/div[1]/h2")).getText(),"iPod Nano Blue");
			
			
		}
		
		public void MSlide(){
			
			
			driver.findElement(By.xpath("//*[@id='slide_menu']/a[1]")).click();
			sleep(1);
			Assert.assertEquals(driver.findElement(By.xpath("//*[@id='slides']/div[1]/div[1]/h2")).getText(),"Magic Mouse");
			driver.findElement(By.xpath("//*[@id='slide_menu']/a[2]")).click();
			sleep(1);
			Assert.assertEquals(driver.findElement(By.xpath("//*[@id='slides']/div[1]/div[1]/h2")).getText(),"iPhone 5");
			driver.findElement(By.xpath("//*[@id='slide_menu']/a[3]")).click();
			sleep(1);
			Assert.assertEquals(driver.findElement(By.xpath("//*[@id='slides']/div[1]/div[1]/h2")).getText(),"iPod Nano Blue");
		
		}
		// ********************1B. Latest Blog Post********************
		
		public void LatestBlogPost(){
			
			Assert.assertEquals(driver.findElement(By.xpath("//*[@id='slides']/div[1]/div[1]/h2")).getText(),"Magic Mouse");
			
			
		}
	
		public void ProductTitle(){
			
			String prodInfo = driver.findElement(By.xpath("//*[@id='footer']/section[2]/ul/li[1]/a[1]")).getAttribute("title");
			System.out.println("String prodInfo = " + prodInfo);
			driver.findElement(By.xpath("//*[@id='footer']/section[2]/ul/li[1]/a[1]")).click();
			sleep(5);
			Assert.assertEquals(prodInfo,driver.findElement(By.xpath("//*[@id='single_product_page_container']/div[1]/div[2]/h1")).getText());
			
		}
		
		public void ProductImage(){
			
			String prodInfo = driver.findElement(By.xpath("//*[@id='footer']/section[2]/ul/li[1]/a[1]")).getAttribute("title");
			System.out.println("String prodInfo = " + prodInfo);
			driver.findElement(By.xpath("//*[@id='footer']/section[2]/ul/li[1]/a[2]")).click();
			sleep(5);
			Assert.assertEquals(prodInfo,driver.findElement(By.xpath("//*[@id='single_product_page_container']/div[1]/div[2]/h1")).getText());
			
			
		}
		
		public void ImageMoreInfo(){
			
			String prodInfo = driver.findElement(By.xpath("//*[@id='footer']/section[2]/ul/li[1]/a[1]")).getAttribute("title");
			System.out.println("String prodInfo = " + prodInfo);
			driver.findElement(By.xpath("//*[@id='footer']/section[2]/ul/li[1]/a[3]")).click();
			sleep(5);
			Assert.assertEquals(prodInfo,driver.findElement(By.xpath("//*[@id='single_product_page_container']/div[1]/div[2]/h1")).getText());
			
			
		}
}
//********************1A.1B Produkter ends********************


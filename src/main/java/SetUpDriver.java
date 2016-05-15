import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SetUpDriver {

protected static WebDriver driver;
	
	public SetUpDriver(){
		driver = new FirefoxDriver();	
		}
	
	
	public static void killDriver(){
		if(driver != null){
			driver.close();
		}
	}
	public void sleep(long time){
		
		try {
			   TimeUnit.SECONDS.sleep(time);
			  } catch (InterruptedException e) {
			   e.printStackTrace();
			  }
	}
	public void action(){
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("menu-item-33"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		}
		
	}

	
	

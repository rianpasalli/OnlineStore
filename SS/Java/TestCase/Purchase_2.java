package automationFw;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Purchase_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/!DATA/JAVA/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();

		//2.2 Purchase an Item from Direct Menu (positive case
		driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]/a")).click();
		
		Actions mousehover = new Actions(driver);
		WebElement pic = driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img"));;
		WebElement button =  driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span"));
		mousehover.moveToElement(pic).perform();
		Thread.sleep(2000);
		button.click();
		Thread.sleep(2000);	
		
        driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")).click();
		
		driver.findElement(By.xpath("//*[@id='cart_quantity_up_3_13_0_0']/span/i")).click();
		
		driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]/span")).click();
		
			driver.findElement(By.name("email")).sendKeys("asdf@asdf.com");
			driver.findElement(By.name("email")).sendKeys(Keys.TAB);
			String txtEmail = driver.findElement(By.name("email")).getCssValue("background-image");
				Assert.assertEquals("url(\"http://automationpractice.com/themes/default-bootstrap/img/icon/form-ok.png\")", txtEmail);
			System.out.println("email OK");
			driver.findElement(By.name("passwd")).sendKeys("12345");
			driver.findElement(By.xpath("//*[@id='SubmitLogin']/span")).click();
		
		driver.findElement(By.xpath("//*[@id='center_column']/form/p/button/span")).click();
		driver.findElement(By.xpath("//*[@id='form']/div/p[2]/label")).click();
		
		driver.findElement(By.xpath("//*[@id='form']/p/button/span")).click();
		driver.findElement(By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")).click();
		
		driver.findElement(By.xpath("//*[@id='cart_navigation']/button/span")).click();
		
		driver.findElement(By.xpath("//*[@id='center_column']/p/a")).click();
		
		driver.findElement(By.xpath("//*[@id='columns']/div[1]/a[1]/i")).click();
		
		System.out.println("2.2 Purchase an Item from Direct Menu --- OK");
		
		//2.3 Purchase an Item from Direct Menu and payment by check(positive case)
		
		driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]/a")).click();
		
		WebElement pic2 = driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img"));;
		WebElement button2 =  driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span"));
		mousehover.moveToElement(pic2).perform();
		Thread.sleep(2000);
		button2.click();
		Thread.sleep(2000);	
		
        driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")).click();
		
		driver.findElement(By.xpath("//*[@id='cart_quantity_up_3_13_0_3838']/span/i")).click();
		
		driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]/span")).click();
		
		driver.findElement(By.xpath("//*[@id='center_column']/form/p/button/span")).click();
		driver.findElement(By.xpath("//*[@id='form']/div/p[2]/label")).click();
		
		driver.findElement(By.xpath("//*[@id='form']/p/button/span")).click();
		
		driver.findElement(By.xpath("//*[@id='HOOK_PAYMENT']/div[2]/div/p/a/span")).click();
		
		driver.findElement(By.xpath("//*[@id='cart_navigation']/button/span")).click();
		
		System.out.println("2.3 Purchase an Item from Direct Menu and payment by check --- OK");
	}

}
package automationFw;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class bug_0006 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/!DATA/JAVA/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		
		Actions mousehover = new Actions(driver);
		
		driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]/a")).click();
		WebElement pic2 = driver.findElement(By.xpath("//*[@id='center_column']/ul/li[4]/div/div[1]/div/a[1]/img"));;
		WebElement button2 =  driver.findElement(By.xpath("//*[@id='center_column']/ul/li[4]/div/div[1]/div/a[2]/span"));
		mousehover.moveToElement(pic2).perform();
		Thread.sleep(2000);
		button2.click();
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.className("fancybox-iframe")));
		driver.findElement(By.xpath("//*[@id='quantity_wanted_p']/a[2]/span/i")).click();
		
		Select sizeDd2 = new Select(driver.findElement(By.xpath("//*[@id='group_1']")));
		sizeDd2.selectByVisibleText("M");
		
		driver.findElement(By.xpath("//*[@id='add_to_cart']/button/span")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")).click();
		
		driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]/span")).click();
		
			driver.findElement(By.name("email")).sendKeys("asdf@asdf.com");
			driver.findElement(By.name("email")).sendKeys(Keys.TAB);
			String txtEmail = driver.findElement(By.name("email")).getCssValue("background-image");
				Assert.assertEquals("url(\"http://automationpractice.com/themes/default-bootstrap/img/icon/form-ok.png\")", txtEmail);
			System.out.println(txtEmail);
			driver.findElement(By.name("passwd")).sendKeys("12345");
			
		driver.findElement(By.xpath("//*[@id='SubmitLogin']/span")).click();
		
		driver.findElement(By.xpath("//*[@id='address_delivery']/li[8]/a/span")).click();	
		
		driver.findElement(By.xpath("//*[@id='center_column']/ul/li/a/span")).click();
	}
}
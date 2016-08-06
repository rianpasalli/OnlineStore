package automationFw;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Purchase {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/!DATA/JAVA/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		
		//2.1 Purchase an Item from QuickView (positive case)
		//choose one item
		driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]/a")).click();
		Actions mousehover = new Actions(driver);
		WebElement pic = driver.findElement(By.xpath("//*[@id='center_column']/ul/li[3]/div/div[1]/div/a[1]/img"));;
		WebElement button =  driver.findElement(By.xpath("//*[@id='center_column']/ul/li[3]/div/div[1]/div/a[2]/span"));
		mousehover.moveToElement(pic).perform();
		Thread.sleep(2000);
		button.click();
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.className("fancybox-iframe")));
		driver.findElement(By.xpath("//*[@id='quantity_wanted_p']/a[2]/span/i")).click();
		
		Select sizeDd = new Select(driver.findElement(By.xpath("//*[@id='group_1']")));
		sizeDd.selectByVisibleText("L");
		
		driver.findElement(By.xpath("//*[@id='add_to_cart']/button/span")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span")).click();
		
		//add another item
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
		
		driver.findElement(By.xpath("//*[@id='cart_quantity_up_5_27_0_0']/span/i")).click();
		
		driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]/span")).click();
		
			driver.findElement(By.name("email")).sendKeys("asdf@asdf.com");
			driver.findElement(By.name("email")).sendKeys(Keys.TAB);
			String txtEmail = driver.findElement(By.name("email")).getCssValue("background-image");
				Assert.assertEquals("url(\"http://automationpractice.com/themes/default-bootstrap/img/icon/form-ok.png\")", txtEmail);
			System.out.println(txtEmail);
			driver.findElement(By.name("passwd")).sendKeys("12345");
			driver.findElement(By.xpath("//*[@id='SubmitLogin']/span")).click();
		
		driver.findElement(By.xpath("//*[@id='center_column']/form/p/button/span")).click();
		driver.findElement(By.xpath("//*[@id='form']/div/p[2]/label")).click();
		
		driver.findElement(By.xpath("//*[@id='form']/p/button/span")).click();
		driver.findElement(By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")).click();
		
		driver.findElement(By.xpath("//*[@id='cart_navigation']/button/span")).click();
		
		driver.findElement(By.xpath("//*[@id='center_column']/p/a")).click();
		
		System.out.println("2.1 Purchase an Item from QuickView --- OK");

	}
}

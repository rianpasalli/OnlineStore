package automationFw;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class bug_0001 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/!DATA/JAVA/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]/a")).click();
		Actions mousehover = new Actions(driver);
		WebElement pic = driver.findElement(By.xpath("//*[@id='center_column']/ul/li[3]/div/div[1]/div/a[1]/img"));;
		WebElement button =  driver.findElement(By.xpath("//*[@id='center_column']/ul/li[3]/div/div[1]/div/a[2]/span"));
		mousehover.moveToElement(pic).perform();
		Thread.sleep(2000);
		button.click();
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.className("fancybox-iframe")));

		Select sizeDd = new Select(driver.findElement(By.xpath("//*[@id='group_1']")));
		sizeDd.selectByVisibleText("M");
		driver.findElement(By.xpath("//*[@id='color_11']")).click();
		driver.findElement(By.xpath("//*[@id='add_to_cart']/button/span")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")).click();
		
		driver.findElement(By.id("newsletter-input")).sendKeys("asdf@asdf.com");
		driver.findElement(By.id("newsletter-input")).sendKeys(Keys.RETURN);
	}
}
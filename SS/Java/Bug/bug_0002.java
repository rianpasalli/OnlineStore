package automationFw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bug_0002 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/!DATA/JAVA/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.name("email_create")).sendKeys("dfaasdfdfasdfasdfasdfasdfasdfasdfasdfgasdfaasdfasdfsasdfasdfasdfdfadf@aasasdfasdfasdfasdfasdfasdfasdfasdfasdasdfasdffaasdfasdfasdfasdfsdfadsfasdfg.com");
		
		driver.findElement(By.xpath("//*[@id='SubmitCreate']/span")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='submitAccount']")).click();

	}

}
package automationFw;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/!DATA/JAVA/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/");
		//driver.get("http://automationpractice.com/index.php?controller=authentication");
		driver.manage().window().maximize();
		
		WebElement linkSignUp = driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
		
		//1.1 Login (positive case)
		linkSignUp.click();
		driver.findElement(By.name("email")).sendKeys("asdf@asdf.com");
		driver.findElement(By.name("email")).sendKeys(Keys.TAB);
		
		String txtEmail = driver.findElement(By.name("email")).getCssValue("background-image");
			Assert.assertEquals("url(\"http://automationpractice.com/themes/default-bootstrap/img/icon/form-ok.png\")", txtEmail);
		System.out.println(txtEmail);
		
		driver.findElement(By.name("passwd")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id='SubmitLogin']/span")).click();
		
		String txtWelcome = driver.findElement(By.xpath("//*[@id='center_column']/p")).getText();
			Assert.assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", txtWelcome);
		System.out.println(txtWelcome);
		WebElement btnSignup = driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[2]/a"));
		btnSignup.click();
		System.out.println("1.1 Login --- OK");
		
		
		//1.2 Login (negative case)
		driver.findElement(By.name("email")).sendKeys("asdfasdf.com");
		driver.findElement(By.name("email")).sendKeys(Keys.TAB);
		
		String txtEmail2 = driver.findElement(By.name("email")).getCssValue("background-image");
			Assert.assertEquals("url(\"http://automationpractice.com/themes/default-bootstrap/img/icon/form-error.png\")", txtEmail2);
		System.out.println(txtEmail2);
		driver.findElement(By.name("passwd")).sendKeys("12345");
		driver.findElement(By.name("passwd")).sendKeys(Keys.RETURN);
		
			Assert.assertEquals("Invalid email address.", driver.findElement(By.xpath("//*[@id='center_column']/div[1]/ol/li")).getText());
		System.out.println();
		
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("asdf@asdf.com");
		driver.findElement(By.name("passwd")).clear();
		driver.findElement(By.name("passwd")).sendKeys("123456");
		driver.findElement(By.name("passwd")).sendKeys(Keys.RETURN);
			Assert.assertEquals("Authentication failed.", driver.findElement(By.xpath("//*[@id='center_column']/div[1]/ol/li")).getText());

		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("passwd")).clear();
		driver.findElement(By.name("passwd")).sendKeys(Keys.RETURN);
			Assert.assertEquals("An email address required.", driver.findElement(By.xpath("//*[@id='center_column']/div[1]/ol/li")).getText());
		
		System.out.println("1.2 Login --- OK");
		
		//1.3 Forgot Password
		driver.findElement(By.xpath("//*[@id='login_form']/div/p[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='form_forgotpassword']/fieldset/p/button/span")).click();
			Assert.assertEquals("Invalid email address.", driver.findElement(By.xpath("//*[@id='center_column']/div/div/ol/li")).getText());
		
		driver.findElement(By.name("email")).sendKeys("asdfasdf.com");
		driver.findElement(By.xpath("//*[@id='form_forgotpassword']/fieldset/p/button/span")).click();
			Assert.assertEquals("Invalid email address.", driver.findElement(By.xpath("//*[@id='center_column']/div/div/ol/li")).getText());
		
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("asdf@asdf.com");
		driver.findElement(By.xpath("//*[@id='form_forgotpassword']/fieldset/p/button/span")).click();
			Assert.assertEquals("A confirmation email has been sent to your address: asdf@asdf.com", driver.findElement(By.xpath("//*[@id='center_column']/div/p")).getText());
		
		driver.findElement(By.xpath("//*[@id='center_column']/ul/li/a/span")).click();

		System.out.println("1.3 Forgot Password - OK");
		//fill text and stroke key
		/*driver.findElement(By.name("search_query")).sendKeys("test");
		driver.findElement(By.name("search_query")).sendKeys(Keys.RETURN);
		
		//find element by xpath
		driver.findElement(By.xpath("//*[@id='columns']/div[1]/a/i")).click();
		driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div/div[1]/div/a[2]")).click();

		//check button style
		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
			email.sendKeys("a");
			email.sendKeys(Keys.TAB);		
		System.out.println(email.getCssValue("background-image"));
			email.clear();
			email.sendKeys("as@as.com");
			email.sendKeys(Keys.TAB);
		System.out.println(email.getCssValue("background-image")); 
		
		//mouseover and click
		Actions mousehover = new Actions(driver);	
		WebElement pic = driver.findElement(By.xpath("//*[@id='homefeatured']/li[1]/div/div[1]/div/a[1]/img"));;
		WebElement button =  driver.findElement(By.xpath("//*[@id='homefeatured']/li[1]/div/div[1]/div/a[2]/span"));
		mousehover.moveToElement(pic).perform();
		Thread.sleep(2000);
		button.click();
		*/
	}

}

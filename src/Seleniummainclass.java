import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

public class Seleniummainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver ;
		//		WebDriver driver1 ;

		System.setProperty("webdriver.chrome.driver", "C:/Naina/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");

		//Element definition

//		WebElement searchBox = driver.findElement(By.id("search_query_top"));
//		WebElement searchButton = driver.findElement(By.name("submit_search"));
//		WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
	
//		WebElement searchBox = driver.findElement(By.cssSelector("input#search_query_top"));
//		WebElement searchButton = driver.findElement(By.cssSelector("button[name='submit_search']")); // unable to search by class name .btn btn-default button-search
		
//		WebElement searchButton = driver.findElement(By.cssSelector("button.btn.btn-default.button-search"));
//		
//		//Test steps
//		
//		signIn.click();
//	
//		WebElement enterEmail = driver.findElement(By.id("email"));
//		WebElement enterPassword = driver.findElement(By.id("passwd"));
//		WebElement submitButton = driver.findElement(By.name("SubmitLogin"));
//		
//		
//		WebElement LogIn = driver.findElement(By.cssSelector(".login"));
//		
//		enterEmail.sendKeys("trainee@lps.co.nz");
//		enterPassword.sendKeys("password01");
//		submitButton.click();
//		
//		// WebElement signOut = driver.findElement(By.xpath("//a[@class='logout']"));
//		
//		WebElement signOut = driver.findElement(By.xpath("//a[@class='logout']"));
//		
//		String Value;
//		Value = signOut.getText();
//		
//		System.out.println(Value);
//		
//		
//		if (Value.contains("Sign out")) {
//			
//			System.out.println("Test case validated");
//			
//		} else {
//
//			System.out.println("Test case failed");
//		}
//		
//		WebElement searchTshirts = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
//		
//		searchTshirts.click();
//		
//		searchBox.sendKeys("Jeans");
//		searchButton.click();

//		WebElement alertNotFound = driver.findElement(By.id("center_column"));
//		WebElement alertNotFound = driver.findElement(By.cssSelector("p.alert.alert-warning"));

//		String notFoundText;
//		notFoundText = alertNotFound.getText();
//
//		System.out.println(notFoundText);
//
//		if (notFoundText.contains("Jeans")) {
//			
//			System.out.println("Test case passed");	
//			
//		} else {
//
//			System.out.println("Test case failed");
//		}


		

		//		String BT;
		//		String BT1;
		//		
		//		BT="CHROME";
		////		//BT="Firefox";
		//		//BT1=BT.toLowerCase();
		//		
		//
		//		if (BT.equalsIgnoreCase("chrome")) {
		//			
		//			System.setProperty("webdriver.chrome.driver", "C:/Naina/chromedriver.exe");
		//			
		//						driver = new ChromeDriver();
		//			
		//		} else {
		//			
		//			System.setProperty("webdriver.gecko.driver", "C:/Naina/geckodriver.exe");
		//			
		//						driver1 = new FirefoxDriver();
		//		}

		//		switch (BT) {
		//
		//		case "chrome":
		//
		//			System.setProperty("webdriver.chrome.driver", "C:/Naina/chromedriver.exe");
		//
		//			driver = new ChromeDriver();
		//
		//			break;
		//
		//		case "firefox":
		//
		//			System.setProperty("webdriver.gecko.driver", "C:/Naina/geckodriver.exe");
		//
		//			driver1 = new FirefoxDriver();
		//
		//
		//		default:
		//
		//			System.out.println("NO Browser selected");
		//
		//			break;
		//		}		




	}

}

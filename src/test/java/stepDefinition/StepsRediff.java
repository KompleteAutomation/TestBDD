package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import okhttp3.Credentials;

public class StepsRediff {

	WebDriver driver;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//	    throw new PendingException();
		System.out.println(System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver_86.exe");
		driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.rediff.com/");


	}






	//	

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//	    throw new PendingException();
		driver.findElement(By.linkText("Rediffmail")).click();
	}

	@When("^User enters Login Credentials and clicks on Login$")
	public void user_enters_ussername_Credentials_to_LogIn() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//	    throw new PendingException();
		driver.findElement(By.id("login1")).sendKeys("girraj@gmail.com");
		driver.findElement(By.id("password")).sendKeys("temp");
		driver.findElement(By.name("proceed")).click();

	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//	    throw new PendingException();
		System.out.println("Login Sucessful");
	}



	@When("^User enters credentials and clicks on Login$")
	public void user_enters_credentials_and_clicks_on_Login(DataTable logindata) throws Throwable {
		//	    // Write code here that turns the phrase above into concrete actions
		//	    // For automatic transformation, change DataTable to one of
		//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		//		
		////		List<List<String>> testData = logindata.raw();
		List<Map<String, String>> testData = logindata.asMaps(String.class, String.class);

		for (Map<String, String> cData : testData) {


			String username = cData.get("Username"); 
			////				testData.get("Username");
			//				
			//				
			String password  = cData.get("Password");

			System.out.println(username);
			System.out.println(password);
			driver.findElement(By.id("login1")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.name("proceed")).click();
		}

	}



	//	@When("^User enters credentials and clicks on Login$")
	//	public void user_enters_credentials_and_clicks_on_Login(List<Credentials> logindata) throws Throwable {
	//	    // Write code here that turns the phrase above into concrete actions
	//	    // For automatic transformation, change DataTable to one of
	//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	//		
	////		List<List<String>> testData = logindata.raw();
	////		List<Map<String, String>> testData = logindata.asMaps(String.class, String.class);
	//		String username = logindata.getUserName();
	//				testData.get(0).get("Username"); 
	////				testData.get("Username");
	//				
	//				
	//		String password  = testData.get(0).get("Password");
	//		
	//		System.out.println(username);
	//		System.out.println(password);
	//		driver.findElement(By.id("login1")).sendKeys(username);
	//		driver.findElement(By.id("password")).sendKeys(password);
	//		driver.findElement(By.name("proceed")).click();
	//	    
	//	}
	//	
	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and clicks on Login$")
	public void user_enters_and_and_clicks_on_Login(String username, String password) throws Throwable {

		System.out.println(username);
		System.out.println(password);
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("proceed")).click();

	}


}

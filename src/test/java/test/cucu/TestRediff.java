package test.cucu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRediff {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver_86.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.linkText("Rediffmail")).click();
		
		driver.findElement(By.id("login1")).sendKeys("girraj@gmail.com");
		driver.findElement(By.id("password")).sendKeys("temp");
		driver.findElement(By.name("proceed")).click();
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		driver.close();

	}

}

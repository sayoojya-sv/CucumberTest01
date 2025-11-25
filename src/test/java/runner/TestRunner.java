package runner;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/Features",
		glue="stepdefinitions",
		plugin= {"pretty","html:target/Cucu.html"}
		)

public class TestRunner extends AbstractTestNGCucumberTests{
	public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	WebDriver driver=new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	WebElement uname=driver.findElement(By.id("user-name"));
	uname.sendKeys("Sample");
	WebElement pass=driver.findElement(By.id("password"));
	uname.sendKeys("adhi78");

	WebElement login=driver.findElement(By.id("login-button"));
	login.click();

	}
}
	
// fro writing scripts see for *(Interface WebDriver)

//http://seleniumhq.github.io/selenium/docs/api/java/index.html

// for regression testinhg test each and every scenarion like consider positive and neagative //also 

// for understanding on scripts in java 
//see in selenuimhq.org ,select  Selenium Client & WebDriver Language Bindings
// the select javadoc , the search fro webdriver , then 
// select reaf overview, pakake

package sample1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public WebDriver facebook; // any variable declartion can b given istead of facebook 
	
	@Test // writing logic in test method //
	public void test() {
		facebook.get("http://www.facebook.com");
		WebElement mo=facebook.findElement(By.id("month")); //identifiung drop down button 
		Select s = new Select(mo); //creating an object slect class
		s.selectByVisibleText("Mar"); // selecting the value from drop down 
		
		//facebook.findElement(By.id("u_0_d")).click(); // for female and male button selection //
		facebook.findElement(By.name("sex")).click();
		
	}
	@Before //here facebook = driver //
	public void before()
	{
	facebook= new FirefoxDriver();
	facebook.manage().window().maximize(); //for maximize windows of fb 
	
	}
	
	@After
	public void after()
	{
	//facebook.quit();
	}
}
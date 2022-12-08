package com.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.selenium.pagefactory.SeleniumPageFactory;
import com.util.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LumaLoginFunction {
	
	public void getLogin(){
		//open a browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // ctrl+shift+O will import automatically
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().to(Constants.URL);
		SeleniumPageFactory pf = new SeleniumPageFactory(driver);		
		//click sign in 
		pf.getSigninBtn().get(0).click();
		//put user
		pf.getEmail().click();
		pf.getEmail().sendKeys(Constants.user);
		//put pass
		pf.getPassword().click();
		pf.getPassword().sendKeys(Constants.password);
		//click sign in 
		pf.getSecondSigninBtn().click();
		//validation
		
	}

}

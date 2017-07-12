package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.function.utils.FireFoxUtils;
import com.pageItems.PageXpath;

public class Test_SecondFloor {
	
private WebDriver driver;
	
	@BeforeClass
	public void beforeclass(){
		driver=FireFoxUtils.startFireFox();
		driver.get(PageXpath.URL);
	}
	
	@Test
	public void testSecondFloor(){
		String name=FireFoxUtils.whereXpath(PageXpath.SECOND_FLOOR).getText();
		FireFoxUtils.whereXpath(PageXpath.SECOND_BRANCH).click();
		FireFoxUtils.whereXpath(PageXpath.SECOND_FIRST_SHOP).click();
	}

}

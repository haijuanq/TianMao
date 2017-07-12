package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.function.utils.FireFoxUtils;
import com.pageItems.PageText;
import com.pageItems.PageXpath;

public class Test_Register {
	private WebDriver driver;
	
	@BeforeClass
	public void beforeclass(){
		driver=FireFoxUtils.startFireFox();
		driver.get(PageXpath.URL);
	}
	
	@Test
	public void testRegister() throws Exception{
		FireFoxUtils.whereXpath(PageXpath.REGISTER).click();
		//无法通过等待iframe来实现????
//		FireFoxUtils.waitforIframe(5, PageXpath.J_Member);
		Thread.sleep(3000);
		//通过iframe ID来定位
		FireFoxUtils.switchFrame(PageXpath.J_Member);
		FireFoxUtils.whereXpath(PageXpath.AGREEMENT).click();
		FireFoxUtils.whereXpath(PageXpath.MOBILE).sendKeys(PageText.MOBILE_NUMBER);
		
		//拖拽滑块
		WebElement source= FireFoxUtils.whereXpath(PageXpath.HUAKUAI);
		Actions action=new Actions(driver);
		action.clickAndHold(source).moveByOffset((int)(Math.random()*100+300), 0);
		Thread.sleep(1000);
		action.clickAndHold(source).moveByOffset((int)(Math.random()*100+100), 0);
		Thread.sleep(1000);
		action.clickAndHold(source).release();
		action.build().perform();
		
		
		
		
	}
	
	@AfterClass
	public void afterclass(){
		driver.close();
	}

}

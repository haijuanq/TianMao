package com.test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.function.utils.FireFoxUtils;
import com.pageItems.PageText;
import com.pageItems.PageXpath;

public class Test_Login {
	
	private WebDriver driver;
	
//	@BeforeClass
//	public void beforeclass(){
//		driver=FireFoxUtils.startFireFox();
////		driver.get(PageXpath.URL);
//	}
	@BeforeMethod
	public void beforemethod(){
		driver=FireFoxUtils.startFireFox();
		driver.get(PageXpath.URL);
	}
	
	@Test
	public void testLogin(){
		//点击请登陆
		FireFoxUtils.whereXpath(PageXpath.Login).click();
		FireFoxUtils.switchFrame(PageXpath.J_LOGIN);
		try {
			
			FireFoxUtils.whereXpath(PageXpath.LOGIN_BYPWD).click();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			
			WebElement name=FireFoxUtils.whereXpath(PageXpath.USER_NAME);
			name.clear();
			name.sendKeys(PageText.NAME);
			FireFoxUtils.whereXpath(PageXpath.PWD).sendKeys(PageText.PWD);
			FireFoxUtils.whereXpath(PageXpath.LOGIN_BUTTON).click();
		}
		
		//判断出现提示语时，则登陆成功
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement point=FireFoxUtils.whereXpath(PageXpath.POINT);
		assertTrue(point.isDisplayed());
		
	}
	@Test
	public void testLoginError(){
		//点击请登陆
				FireFoxUtils.whereXpath(PageXpath.Login).click();
				FireFoxUtils.switchFrame(PageXpath.J_LOGIN);
				try {
					
					FireFoxUtils.whereXpath(PageXpath.LOGIN_BYPWD).click();
				} catch (Exception e) {
					// TODO: handle exception
				}finally{
					
					WebElement name2=FireFoxUtils.whereXpath(PageXpath.USER_NAME);
					name2.clear();
					name2.sendKeys(PageText.NAME);
					FireFoxUtils.whereXpath(PageXpath.PWD).sendKeys(PageText.PWD_ERROR);
					FireFoxUtils.whereXpath(PageXpath.LOGIN_BUTTON).click();
				}
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				WebElement error=FireFoxUtils.whereXpath(PageXpath.ERROR);
				assertTrue(error.isDisplayed());
	}
	
	@AfterMethod
	public void afterclass(){
		driver.close();
	}

}

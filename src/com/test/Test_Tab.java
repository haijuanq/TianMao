package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.function.utils.FireFoxUtils;
import com.pageItems.PageText;
import com.pageItems.PageXpath;

public class Test_Tab {
	
	private WebDriver driver;
	
	@BeforeClass
	public void beforeclass(){
		driver=FireFoxUtils.startFireFox();
		driver.get(PageXpath.URL);
	}
	@Test
	public void testTab(){
		FireFoxUtils.whereXpath(PageXpath.TIANMAO_MARCKET).click();
		//跳转window
		FireFoxUtils.switchWindow();
		//鼠标悬停，选择地区为北京
		//存在问题：没有办法确定区域位置
		Actions bulider=new Actions(driver);
		bulider.moveToElement(FireFoxUtils.whereXpath(PageXpath.ADDRESS)).perform();
		FireFoxUtils.whereXpath(PageXpath.BEIJING).click();
		//搜索商品：护发素
		FireFoxUtils.whereXpath(PageXpath.SEARCH_TM).sendKeys(PageText.SEARCH_TM);
		FireFoxUtils.whereXpath(PageXpath.SUBMIT).click();
		FireFoxUtils.whereXpath(PageXpath.BRAND).click();
		FireFoxUtils.whereXpath(PageXpath.SALES_TM).click();
		String firstTitle=FireFoxUtils.whereXpath(PageXpath.FIRST_TITLE).getText();
		String firstPrice=FireFoxUtils.whereXpath(PageXpath.FIRST_PRICE).getText();
		
		System.out.println("天猫超市中资生堂护发素销量第一为："+firstTitle+",其价格为"+firstPrice);
		
	}
	@AfterClass
	public void afterclass(){
		//关闭当前窗口
		//driver.close();
		//关闭所有窗口
		driver.quit();
	}

}

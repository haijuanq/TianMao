package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.function.utils.FireFoxUtils;
import com.pageItems.PageText;
import com.pageItems.PageXpath;

public class Test_Search {
	private WebDriver driver;
	
	@BeforeClass
	public void beforeclass(){
		driver=FireFoxUtils.startFireFox();
		driver.get(PageXpath.URL);
	}
	@Test
	//搜索‘宝宝’，返回搜索界面第一个商品到名称，以及店铺名
	public void testSearch(){
		FireFoxUtils.whereXpath(PageXpath.SEARCH).sendKeys(PageText.SEARCH_NAME);
		FireFoxUtils.whereXpath(PageXpath.SEARCH_BUTTON).click();
		String first_goods=FireFoxUtils.whereXpath(PageXpath.FIRST_GOODS).getText();
		String first_shop=FireFoxUtils.whereXpath(PageXpath.FIRST_SHOP).getText();
		String sales=FireFoxUtils.whereXpath(PageXpath.SALES).getText();
		System.out.println("搜索出来的第一件商品的名称为："+first_goods+",该商品属于"+first_shop+",其月销售额为"+sales);
		
	}
	
	@AfterMethod
	public void afterclass(){
		driver.close();
	}

}

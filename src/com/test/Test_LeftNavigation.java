package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.function.utils.FireFoxUtils;
import com.pageItems.PageXpath;

public class Test_LeftNavigation {
	
	private WebDriver driver;
	
	@BeforeClass
	public void beforeclass(){
		driver=FireFoxUtils.startFireFox();
		driver.get(PageXpath.URL);
	}
	/**
	 * 在天猫首页点击左导航栏进行商品选择
	 */
	
	@Test
	public void testLeftNavigation(){
		FireFoxUtils.whereXpath(PageXpath.LIFT_NAVIGATION).click();
		//切换窗口，喵生鲜
		FireFoxUtils.switchWindow();
		WebElement it1=FireFoxUtils.whereXpath(PageXpath.FRUITS);
		String fruits=it1.getText();
		//去掉换行输出
		String it=fruits.replace("\n", "");
		it1.click();
		
		//获取搜索页面第一个商品到信息
		String first=FireFoxUtils.whereXpath(PageXpath.M_TITLE).getText();
		String price=FireFoxUtils.whereXpath(PageXpath.M_PRICES).getText();
		
		System.out.println("在天猫首页点击左导航栏进入喵生鲜，选择"+it+",位于第一个商品为"+first+",其价格为"+price);
		
	}
	@AfterClass
	public void afterclass(){
		//关闭当前窗口
		//driver.close();
		//关闭所有窗口
		driver.quit();
	}

}

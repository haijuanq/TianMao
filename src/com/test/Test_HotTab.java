package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.function.utils.FireFoxUtils;
import com.pageItems.PageXpath;

public class Test_HotTab {
	
	private WebDriver driver;
	
	@BeforeClass
	public void beforeclass(){
		driver=FireFoxUtils.startFireFox();
		driver.get(PageXpath.URL);
	}
	
	@Test
	public void testHotTab(){
		WebElement hotTab=FireFoxUtils.whereXpath(PageXpath.HOT_TAB);
		//先获取内容后点击
		String tab=hotTab.getText();
		hotTab.click();
		//切换window
		FireFoxUtils.switchWindow();
		
		WebElement keyTab=FireFoxUtils.whereXpath(PageXpath.KEYTAB);
		String key=keyTab.getText();
		keyTab.click();

		
		FireFoxUtils.whereXpath(PageXpath.SEARCH_SALES).click();
		WebElement hotSale=FireFoxUtils.whereXpath(PageXpath.FIRST_GOODS);
		String hottest=hotSale.getText();
		WebElement hotShop=FireFoxUtils.whereXpath(PageXpath.FIRST_SHOP);
		String shop=hotShop.getText();
		WebElement Sales=FireFoxUtils.whereXpath(PageXpath.SALES);
		String sales=Sales.getText();
		System.out.println("在首页中第四个热门搜索标签为:"+tab+",在搜索页第三个keyTab为:"+key+"\n该标签下销量最高的商品为:"+hottest+",属于"+shop+",其月销量为"+sales);
		
		
	}
	@AfterClass
	public void afterclass(){
		//关闭当前窗口
		//driver.close();
		//关闭所有窗口
		driver.quit();
	}

}

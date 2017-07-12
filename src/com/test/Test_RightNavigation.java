package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.function.utils.FireFoxUtils;
import com.pageItems.PageXpath;

public class Test_RightNavigation {
	

	private WebDriver driver;
	
	@BeforeClass
	public void beforeclass(){
		driver=FireFoxUtils.startFireFox();
		driver.get(PageXpath.URL);
	}
	/**
	 * 右导航栏遇到问题，该导航栏貌似是单独到页面，
	 */
	@Test
	public void testRightNavigation(){
		FireFoxUtils.whereXpath(PageXpath.RIGHT_NAVIGATION).click();
		FireFoxUtils.switchFrame("j_minilogin_iframe");
		FireFoxUtils.whereXpath(PageXpath.LOGIN_BYPWD);
	}

}

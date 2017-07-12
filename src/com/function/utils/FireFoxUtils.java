package com.function.utils;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FireFoxUtils {
	private static  WebDriver driver;
	
	
	public static WebDriver startFireFox(){
		ProfilesIni pi=new ProfilesIni();
		FirefoxProfile profile=pi.getProfile("default");
		 driver=new FirefoxDriver(profile);
		return driver;
	}
	
		//跳转不同的frame
		public static void switchFrame(String Frame){
			driver.switchTo().defaultContent();
			driver.switchTo().frame(Frame);
		} 
		
		public static WebElement whereXpath(String Xpath){
			WebElement e=driver.findElement(By.xpath(Xpath));
			return e;
		}
		
		/**
		 * 
		 * @param seconds 最大等待时间
		 * @param xpath  要等待到元素
		 */
		
		public static void waitforElement(int seconds,String xpath){
			(new WebDriverWait(driver, seconds)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
		}
		/**
		 * 等待iframe出现并SwitchToIt
		 * @param seconds 最大等待时间
		 * @param xpath   要等待到iframe
		 */
		public static void waitforIframe(int seconds,String xpath){
			(new WebDriverWait(driver, seconds)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(whereXpath(xpath)));
		}
		
		/**
		 * 切换不同到window。在原页面点击跳转元素后，若跳转到新到页面，需使用该方法
		 */
		public static void switchWindow(){
			//获取原页面句柄
			String present=driver.getWindowHandle();
			//获取当前所有页面的句柄
			Set<String> currentWindows=driver.getWindowHandles();
			for(String it:currentWindows){
				if(!(it.equals(present))){
					//跳转到新页面
					driver.switchTo().window(it);
				}
			}
		}

}

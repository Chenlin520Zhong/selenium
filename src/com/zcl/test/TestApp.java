package com.zcl.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

		  WebDriver driver  = new ChromeDriver();

			driver.manage().window().maximize();
	        driver.get("http://www.baidu.com");
	      //2.；浏览器最大化
	        WebElement searchBox = driver.findElement(By.id("kw"));
	        searchBox.sendKeys("小坦克 博客园");
	        WebElement searchButton = driver.findElement(By.id("su"));
	        searchButton.click();
	        //searchButton.submit();
	        Scanner in = new Scanner(System.in);
	        String s=in.nextLine();
	        //显示等待
	        //WebDriverWait wait = new WebDriverWait(driver,10);
	        
	        driver.close();
	        driver.quit();
	}

}

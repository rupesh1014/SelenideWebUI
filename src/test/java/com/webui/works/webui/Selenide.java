package com.webui.works.webui;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.*;


public class Selenide {
	

	
@Test()
public void firstMethod() {
	
	Configuration.browser="chrome";
	open("http://demoqa.com/frames-and-windows/");
	$(By.id("menu-item-374")).click();
	sleep(2000);
	
	
	
	}

@Test()
public void secondMethod() {
	
	Configuration.browser="chrome";
	open("http://gmail.com");
	SoftAssert soft= new SoftAssert();
	soft.assertTrue(false);
	soft.assertTrue(true);
	soft.assertAll();
	
	
	}


}

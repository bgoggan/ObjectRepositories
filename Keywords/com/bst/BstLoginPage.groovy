package com.bst

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import java.util.List

import org.apache.commons.lang3.StringUtils

import org.openqa.selenium.By
import org.openqa.selenium.NoSuchElementException
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.ui.Select

public class BstLoginPage {
	
	public BstLoginPage (WebDriver driver) {
		super(driver)
	}
	
	@FindBy(xpath = "//input[@id='txtUsername']")
	private WebElement Username
	
	public WebElement getUsername() {
		return Username;
	}
	
	@FindBy(xpath = "//input[@id='txtPassword']")
	private WebElement Password
	
	public WebElement getPassword() {
		return Password;
	}
	
	@FindBy(xpath = "//div[@id='pnlLoginAlert']")
	private WebElement LoginErrorMessage
	
	public WebElement getLoginErrorMessage() {
		return LoginErrorMessage;
	}
	
	@FindBy(xpath = "//input[@id='btnSubmit']")
	private WebElement LoginButton
	
	public WebElement getLoginButton() {
		return LoginButton;
	}
}

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

public class Homepage {
	
	public Homepage (WebDriver driver) {
		super(driver)
	}
	
	@FindBy(xpath = "//input[@value='BST Global']")
	private WebElement BstGlobalCheckbox
	
	public WebElement getBstGlobalCheckbox() {
		return BstGlobalCheckbox;
	}
	
	@FindBy(xpath = "(//input[@data-field-id='field13'])[2]")
	private WebElement BstGlobalPartnerCheckbox
	
	public WebElement getBstGlobalPartnerCheckbox() {
		return BstGlobalPartnerCheckbox;
	}
	
	@FindBy(xpath = "//input[@placeholder='Company']")
	private WebElement Company
	
	public WebElement getCompany() {
		return Company;
	}
	
	@FindBy(xpath = "//span[contains(text(), 'Contact')]")
	private WebElement ContactMenu
	
	public WebElement getContactMenu() {
		return ContactMenu;
	}
	
	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement Email
	
	public WebElement getEmail() {
		return Email;
	}
	
	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement FirstName
	
	public WebElement getFirstName() {
		return FirstName;
	}
	
	@FindBy(xpath = "//input[@placeholder='Job Title']")
	private WebElement JobTitle
	
	public WebElement getJobTitle() {
		return JobTitle;
	}
	
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement LastName
	
	public WebElement getLastName() {
		return LastName;
	}
	
	@FindBy(xpath = "//a[contains(text(),'Support')]")
	private WebElement LoginSupportLink
	
	public WebElement getLoginSupportLink() {
		return LoginSupportLink;
	}
	
	@FindBy(xpath = "//textarea[@placeholder='Message']")
	private WebElement MessageBox
	
	public WebElement getMessageBox() {
		return MessageBox;
	}
}

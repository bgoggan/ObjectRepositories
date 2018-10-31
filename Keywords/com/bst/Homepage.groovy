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
		driver
	}

	private WebElement BstGlobalCheckbox = driver.findElement(By.xpath("//input[@value='BST Global']"))

	public WebElement getBstGlobalCheckbox() {
		return BstGlobalCheckbox
	}

	private WebElement BstGlobalPartnerCheckbox = driver.findElement(By.xpath("(//input[@data-field-id='field13'])[2]"))

	public WebElement getBstGlobalPartnerCheckbox() {
		return BstGlobalPartnerCheckbox
	}

	private WebElement Company = driver.findElement(By.xpath("//input[@placeholder='Company']"))

	public WebElement getCompany() {
		return Company
	}

	private WebElement ContactMenu = driver.findElement(By.xpath("//span[contains(text(), 'Contact')]"))

	public WebElement getContactMenu() {
		return ContactMenu
	}

	private WebElement Email = driver.findElement(By.xpath("//input[@placeholder='Email']"))

	public WebElement getEmail() {
		return Email
	}

	private WebElement FirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"))

	public WebElement getFirstName() {
		return FirstName
	}

	private WebElement JobTitle = driver.findElement(By.xpath("//input[@placeholder='Job Title']"))

	public WebElement getJobTitle() {
		return JobTitle
	}

	private WebElement LastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"))

	public WebElement getLastName() {
		return LastName
	}

	private WebElement LoginSupportLink = driver.findElement(By.xpath("//a[contains(text(),'Support')]"))

	public WebElement getLoginSupportLink() {
		return LoginSupportLink
	}

	private WebElement MessageBox = driver.findElement(By.xpath("//textarea[@placeholder='Message']"))

	public WebElement getMessageBox() {
		return MessageBox
	}
}

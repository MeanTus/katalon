import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.urlShrole)

WebUI.maximizeWindow()

WebUI.click(findTestObject('objCreateAccount/linkCreate'))

WebUI.setText(findTestObject('objCreateAccount/inputFirstName'), 'Tu')

WebUI.setText(findTestObject('objCreateAccount/inputLastName'), 'Nguyen')

WebUI.setText(findTestObject('objCreateAccount/inputEmailCreate'), 'abcd123@gmail.com')

WebUI.setText(findTestObject('objCreateAccount/inputPass'), '123')

WebUI.click(findTestObject('objCreateAccount/inputEmailCreate'))

WebUI.verifyElementText(findTestObject('objCreateAccount/txtInvalidPassword'), 'This password does not meet our requirements')

WebUI.setText(findTestObject('objCreateAccount/inputPass'), '12345678')

WebUI.click(findTestObject('objCreateAccount/inputEmailCreate'))

WebUI.verifyElementText(findTestObject('objCreateAccount/txtInvalidPassword'), 'This password does not meet our requirements')

WebUI.setText(findTestObject('objCreateAccount/inputPass'), '12345678xX')

WebUI.click(findTestObject('objCreateAccount/inputEmailCreate'))

WebUI.verifyElementText(findTestObject('objCreateAccount/txtInvalidPassword'), 'This password does not meet our requirements')

WebUI.setText(findTestObject('objCreateAccount/inputPass'), GlobalVariable.password)

WebUI.setText(findTestObject('objCreateAccount/inputConfirmPass'), '12314')

WebUI.click(findTestObject('objCreateAccount/btnAgree'))

WebUI.verifyElementText(findTestObject('objCreateAccount/txtInvalidConfirmPassword'), 'This password does not match')

WebUI.closeBrowser()


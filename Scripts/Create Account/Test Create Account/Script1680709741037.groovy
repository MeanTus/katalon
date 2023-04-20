import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.googlecode.javacv.cpp.opencv_stitching.FisheyeWarper as FisheyeWarper
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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import java.text.SimpleDateFormat as SimpleDateFormat

String newEmail = ('tu' + System.nanoTime()) + '@gmail.com'

GlobalVariable.email = newEmail

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.urlShrole)

WebUI.maximizeWindow()

//Create Account
WebUI.click(findTestObject('objCreateAccount/linkCreate'))

WebUI.setText(findTestObject('objCreateAccount/inputFirstName'), GlobalVariable.firstName)

WebUI.setText(findTestObject('objCreateAccount/inputLastName'), GlobalVariable.lastName)

WebUI.setText(findTestObject('objCreateAccount/inputEmailCreate'), newEmail)

WebUI.setText(findTestObject('objCreateAccount/inputPass'), GlobalVariable.password)

WebUI.setText(findTestObject('objCreateAccount/inputConfirmPass'), GlobalVariable.password)

WebUI.click(findTestObject('objCreateAccount/btnAgree'))

WebUI.click(findTestObject('objCreateAccount/btnCreate'))

WebUI.click(findTestObject('sideBar/logOut'))

WebUI.click(findTestObject('objLogin/linkLogin'))

WebUI.closeBrowser()


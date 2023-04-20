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

CustomKeywords.'demo.login.loginWebApp'(GlobalVariable.urlShrole, 'tu@gmail.com', GlobalVariable.password)

WebUI.click(findTestObject('objHomePage/profile picture/btnCamera'))

//verify upload file too large
WebUI.uploadFile(findTestObject('objHomePage/profile picture/inputUploadFile'), 'D:\\data test katalon\\Giáo-án-BMH.docx')

WebUI.verifyElementText(findTestObject('objHomePage/profile picture/errUpload'), 'Unable to upload image file size too large.')

//verify upload file img
WebUI.uploadFile(findTestObject('objHomePage/profile picture/inputUploadFile'), 'D:\\data test katalon\\DSC08033.jpg')

WebUI.click(findTestObject('objHomePage/profile picture/btnUpload'))

WebUI.closeBrowser()


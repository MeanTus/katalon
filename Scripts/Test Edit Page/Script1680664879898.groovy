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

CustomKeywords.'demo.login.loginWebApp'(GlobalVariable.urlShrole, GlobalVariable.email, GlobalVariable.password)

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl(GlobalVariable.urlShrole)
//
//WebUI.maximizeWindow()
//
//WebUI.setText(findTestObject('objLogin/inputEmail'), 'tu@gmail.com')
//
//WebUI.setEncryptedText(findTestObject('objLogin/inputPass'), 'RigbBhfdqOBpqcAU9qz6SQ==')
//
//WebUI.click(findTestObject('objLogin/buttonLogin'))
WebUI.click(findTestObject('sideBar/editProfile'))

//Variable
String firstName = 'Tu Minh'

String lastName = 'Nguyen1'

String emailContactPrimary = 'tu123@gmail.com'

String phoneNumber = '12345678'

String skype = '11111111111'

String name = 'Tú Minh'

String relationship = 'friend'

String emailContact = 'tuMinh@gmail.com'

String phoneContact = '91011121314'

String addressLine1 = '11'

String addressLine2 = '222'

String city = '333'

String suburb = '444'

String zip = '555'

//Edit personal
WebUI.click(findTestObject('objEditPage/personal/btnEditPersonal'))

WebUI.scrollToElement(findTestObject('objEditPage/personal/btnSave'), 0)

WebUI.sendKeys(findTestObject('objEditPage/personal/inputFirstName'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('objEditPage/personal/inputFirstName'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('objEditPage/personal/inputFirstName'), firstName)

WebUI.sendKeys(findTestObject('objEditPage/personal/inputLastName'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('objEditPage/personal/inputLastName'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('objEditPage/personal/inputLastName'), lastName)

WebUI.sendKeys(findTestObject('objEditPage/personal/inputDateOfBirth'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('objEditPage/personal/inputDateOfBirth'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('objEditPage/personal/inputDateOfBirth'), '31 Jul 2000')

WebUI.click(findTestObject('objEditPage/personal/inputGender'))

WebUI.click(findTestObject('objEditPage/personal/itemGender'))

WebUI.click(findTestObject('objEditPage/personal/inputCountry'))

WebUI.click(findTestObject('objEditPage/personal/itemCountry'))

WebUI.click(findTestObject('objEditPage/personal/inputCitizenship'))

WebUI.click(findTestObject('objEditPage/personal/itemCitizenship'))

WebUI.click(findTestObject('objEditPage/personal/inputLanguage'))

WebUI.click(findTestObject('objEditPage/personal/itemLanguage'))

WebUI.click(findTestObject('objEditPage/personal/inputLanguageProfi'))

WebUI.click(findTestObject('objEditPage/personal/itemLanguageProfi'))

WebUI.click(findTestObject('objEditPage/personal/btnSave'))

//verify personal
WebUI.verifyElementText(findTestObject('objEditPage/personal/verifyName'), (firstName + ' ') + lastName)

WebUI.verifyElementText(findTestObject('objEditPage/personal/verifyDateOfBirth'), 'Born ' + '31 July 2000')

WebUI.verifyElementText(findTestObject('objEditPage/personal/verifyGender'), 'Male')

WebUI.verifyElementText(findTestObject('objEditPage/personal/verifyCountry'), 'Albania')

WebUI.verifyElementText(findTestObject('objEditPage/personal/verifyLanguage'), 'Albanian(Business)')

//
//// contact edit
WebUI.click(findTestObject('objEditPage/contact/btnEdit'))

WebUI.sendKeys(findTestObject('objEditPage/contact/inputEmail'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('objEditPage/contact/inputEmail'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('objEditPage/contact/inputEmail'), emailContactPrimary)

WebUI.sendKeys(findTestObject('objEditPage/contact/inputPhone'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('objEditPage/contact/inputPhone'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('objEditPage/contact/inputPhone'), phoneNumber)

WebUI.sendKeys(findTestObject('objEditPage/contact/inputSkype'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('objEditPage/contact/inputSkype'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('objEditPage/contact/inputSkype'), skype)

WebUI.sendKeys(findTestObject('objEditPage/contact/inputName'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('objEditPage/contact/inputName'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('objEditPage/contact/inputName'), name)

WebUI.sendKeys(findTestObject('objEditPage/contact/inputRela'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('objEditPage/contact/inputRela'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('objEditPage/contact/inputRela'), relationship)

WebUI.sendKeys(findTestObject('objEditPage/contact/inputEmailRela'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('objEditPage/contact/inputEmailRela'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('objEditPage/contact/inputEmailRela'), emailContact)

WebUI.sendKeys(findTestObject('objEditPage/contact/inputPhoneRela'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('objEditPage/contact/inputPhoneRela'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('objEditPage/contact/inputPhoneRela'), phoneContact)

WebUI.click(findTestObject('objEditPage/contact/btnSave'))

//verify contact
WebUI.verifyElementText(findTestObject('objEditPage/contact/verifyEmail'), emailContactPrimary)

WebUI.verifyElementText(findTestObject('objEditPage/contact/verifyPhoneNumber'), phoneNumber + ' (Primary)')

WebUI.verifyElementText(findTestObject('objEditPage/contact/verifySkype'), skype)

WebUI.verifyElementText(findTestObject('objEditPage/contact/verifyEmailContact'), emailContact)

WebUI.verifyElementText(findTestObject('objEditPage/contact/verifyRela'), ('(' + relationship) + ')')

WebUI.verifyTextPresent(name, false)

WebUI.verifyTextPresent(phoneContact, false)

WebUI.click(findTestObject('objEditPage/address/btnAddAddress'))

WebUI.scrollToElement(findTestObject('objEditPage/address/btnSave'), 0)

WebUI.sendKeys(findTestObject('objEditPage/address/inputAddressLine1'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('objEditPage/address/inputAddressLine1'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('objEditPage/address/inputAddressLine1'), addressLine1)

WebUI.sendKeys(findTestObject('objEditPage/address/inputAddressLine2'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('objEditPage/address/inputAddressLine2'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('objEditPage/address/inputAddressLine2'), addressLine2)

WebUI.click(findTestObject('objEditPage/address/inputCountry'))

WebUI.click(findTestObject('objEditPage/address/itemCountry'))

WebUI.click(findTestObject('objEditPage/address/inputState'))

WebUI.click(findTestObject('objEditPage/address/itemState'))

WebUI.sendKeys(findTestObject('objEditPage/address/inputCity'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('objEditPage/address/inputCity'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('objEditPage/address/inputCity'), city)

WebUI.sendKeys(findTestObject('objEditPage/address/inputSuburd'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('objEditPage/address/inputSuburd'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('objEditPage/address/inputSuburd'), suburb)

WebUI.sendKeys(findTestObject('objEditPage/address/inputZip'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('objEditPage/address/inputZip'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('objEditPage/address/inputZip'), zip)

WebUI.click(findTestObject('objEditPage/address/btnSave'))

WebUI.verifyElementText(findTestObject('objEditPage/address/verifyAddressLine1'), addressLine1)

WebUI.verifyElementText(findTestObject('objEditPage/address/verifyAddressLine2'), (((suburb + ', ') + city) + ', Berat, ') + 
    zip)

WebUI.verifyElementText(findTestObject('objEditPage/address/verifyAddressCountry'), 'Albania')


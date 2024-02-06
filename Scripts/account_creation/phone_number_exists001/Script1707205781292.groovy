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

WebUI.navigateToUrl('https://www.amazon.in/')

WebUI.click(findTestObject('Object Repository/account_creation/phone_number_exists001/Page_Online Shopping site in India Shop Onl_10c5f3/i_hm-icon nav-sprite'))

WebUI.click(findTestObject('Object Repository/account_creation/phone_number_exists001/Page_Online Shopping site in India Shop Onl_10c5f3/b_Hello, sign in'))

WebUI.click(findTestObject('Object Repository/account_creation/phone_number_exists001/Page_Amazon Sign In/h5_New to Amazon'))

WebUI.verifyElementText(findTestObject('Object Repository/account_creation/phone_number_exists001/Page_Amazon Sign In/h5_New to Amazon'), 
    'New to Amazon?')

WebUI.click(findTestObject('Object Repository/account_creation/phone_number_exists001/Page_Amazon Sign In/a_Create your Amazon account'))

WebUI.setText(findTestObject('Object Repository/account_creation/phone_number_exists001/Page_Amazon Registration/input_customerName'), 
    'H')

WebUI.setText(findTestObject('Object Repository/account_creation/phone_number_exists001/Page_Amazon Registration/input_email'), 
    '7779970102')

WebUI.setEncryptedText(findTestObject('Object Repository/account_creation/phone_number_exists001/Page_Amazon Registration/input_password'), 
    'MFyDUS+SCPQ=')

WebUI.click(findTestObject('Object Repository/account_creation/phone_number_exists001/Page_Amazon Registration/inputcontinue'))

WebUI.click(findTestObject('Object Repository/account_creation/phone_number_exists001/Page_/div_Mobile number already in use          Y_bd9461'))

WebUI.closeBrowser()

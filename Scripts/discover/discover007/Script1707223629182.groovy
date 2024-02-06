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

WebUI.click(findTestObject('Object Repository/discover/discover007/Page_Online Shopping site in India Shop Onl_10c5f3/a_Amazon miniTV'))

WebUI.click(findTestObject('Object Repository/discover/discover007/Page_Amazon miniTV - Watch Free Web Series,_86fafa/span_Imported'))

WebUI.click(findTestObject('Object Repository/discover/discover007/Page_Watch Dubbed Web Series, Korean Drama,_0fb818/span_Web Series'))

WebUI.click(findTestObject('Object Repository/discover/discover007/Page_Watch Latest Web Series Online for Fre_49d131/span_Movies'))

WebUI.click(findTestObject('Object Repository/discover/discover007/Page_Watch Popular Movies  Short Films Onli_56b9b2/span_Romance'))

WebUI.click(findTestObject('Object Repository/discover/discover007/Page_Watch Trending Romantic Web Series  Mo_a46f5a/span_Comedy'))

WebUI.click(findTestObject('Object Repository/discover/discover007/Page_Watch Comedy Web Series, Short Films  _4c3a92/img_AppNavbar_mShopIcon__4UsHr'))

WebUI.click(findTestObject('Object Repository/discover/discover007/Page_Online Shopping site in India Shop Onl_10c5f3/a_Sell'))

WebUI.click(findTestObject('Object Repository/discover/discover007/Page_Amazon.in CrossShop1/a_Mobiles'))

WebUI.closeBrowser()


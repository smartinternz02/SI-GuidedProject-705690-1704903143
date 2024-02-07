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

WebUI.click(findTestObject('Object Repository/integration/successful002/Page_Online Shopping site in India Shop Onl_10c5f3/i_hm-icon nav-sprite'))

WebUI.click(findTestObject('Object Repository/integration/successful002/Page_Online Shopping site in India Shop Onl_10c5f3/b_Hello, sign in'))

WebUI.setText(findTestObject('Object Repository/integration/successful002/Page_Amazon Sign In/input_email'), '7779970102')

WebUI.click(findTestObject('Object Repository/integration/successful002/Page_Amazon Sign In/inputcontinue'))

WebUI.setEncryptedText(findTestObject('Object Repository/integration/successful002/Page_Amazon Sign In/input_password'), 
    'eSPcD+aU0jcqZChrJx5wLA==')

WebUI.click(findTestObject('Object Repository/integration/successful002/Page_Amazon Sign In/inputsignInSubmit'))

WebUI.click(findTestObject('Object Repository/integration/successful002/Page_Online Shopping site in India Shop Onl_10c5f3/a_Amazon miniTV'))

WebUI.click(findTestObject('Object Repository/integration/successful002/Page_Amazon miniTV - Watch Free Web Series,_86fafa/span_Imported'))

WebUI.click(findTestObject('Object Repository/integration/successful002/Page_Watch Dubbed Web Series, Korean Drama,_0fb818/span_Web Series'))

WebUI.click(findTestObject('Object Repository/integration/successful002/Page_Watch Latest Web Series Online for Fre_49d131/span_Movies'))

WebUI.click(findTestObject('Object Repository/integration/successful002/Page_Watch Popular Movies  Short Films Onli_56b9b2/span_Romance'))

WebUI.click(findTestObject('Object Repository/integration/successful002/Page_Watch Trending Romantic Web Series  Mo_a46f5a/span_Comedy'))

WebUI.click(findTestObject('Object Repository/integration/successful002/Page_Watch Comedy Web Series, Short Films  _4c3a92/img_AppNavbar_mShopIcon__4UsHr'))

WebUI.setText(findTestObject('Object Repository/integration/successful002/Page_Amazon.in/input_field-keywords_1'), 'poco x6')

WebUI.click(findTestObject('Object Repository/integration/successful002/Page_Amazon.in/inputnav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/integration/successful002/Page_Amazon.in  poco x6/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/integration/successful002/Page_Amazon.in  poco x6/a_1                                        _7d74ab'))

WebUI.click(findTestObject('Object Repository/integration/successful002/Page_Amazon.in Shopping Cart/input_proceedToRetailCheckout'))

WebUI.click(findTestObject('Object Repository/integration/successful002/Page_Select a delivery address/a_Add a new address'))

WebUI.click(findTestObject('Object Repository/integration/successful002/Page_Select a delivery address/span_India'))

WebUI.click(findTestObject('Object Repository/integration/successful002/Page_Select a delivery address/a_India'))

WebUI.setText(findTestObject('Object Repository/integration/successful002/Page_Select a delivery address/input_address-ui-widgets-enterAddressFullName'), 
    'Ritesh Kumar')

WebUI.setText(findTestObject('Object Repository/integration/successful002/Page_Select a delivery address/input_address-ui-widgets-enterAddressPhoneNumber'), 
    '7779970102')

WebUI.setText(findTestObject('Object Repository/integration/successful002/Page_Select a delivery address/input_address-ui-widgets-enterAddressPostalCode'), 
    '834010')

WebUI.setText(findTestObject('Object Repository/integration/successful002/Page_Select a delivery address/input_address-ui-widgets-enterAddressLine1'), 
    '847')

WebUI.setText(findTestObject('Object Repository/integration/successful002/Page_Select a delivery address/input_address-ui-widgets-enterAddressLine2'), 
    'Namkum Bazar, Ranchi')

WebUI.setText(findTestObject('Object Repository/integration/successful002/Page_Select a delivery address/input_address-ui-widgets-landmark'), 
    'Rajprastha Hospital')

WebUI.setText(findTestObject('Object Repository/integration/successful002/Page_Select a delivery address/input_address-ui-widgets-enterAddressCity'), 
    'RANCHI')

WebUI.click(findTestObject('Object Repository/integration/successful002/Page_Select a delivery address/span_JHARKHAND'))

WebUI.click(findTestObject('Object Repository/integration/successful002/Page_Select a delivery address/a_JHARKHAND'))

WebUI.click(findTestObject('Object Repository/integration/successful002/Page_Select a delivery address/input_a-button-input'))

WebUI.click(findTestObject('Object Repository/integration/successful002/Page_Amazon.in Checkout/input_ppw-instrumentRowSelection'))

WebUI.setText(findTestObject('Object Repository/integration/successful002/Page_Amazon.in Checkout/input___sif_encryptedVPA_collect'), 
    'demonritesh8092-1@oksbi')

WebUI.click(findTestObject('Object Repository/integration/successful002/Page_Amazon.in Checkout/input_ppw-widgetEventValidateUpiIdEvent'))

WebUI.click(findTestObject('Object Repository/integration/successful002/Page_Amazon.in Checkout/input_ppw-widgetEventSetPaymentPlanSelectCo_b3daea'))

WebUI.click(findTestObject('Object Repository/integration/successful002/Page_Amazon.in Checkout/span_No Thanks'))

WebUI.closeBrowser()


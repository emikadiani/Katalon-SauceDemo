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

WebUI.callTestCase(findTestCase('03. Shopping Cart/TC-SC-09_Checkout without items'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('04. Checkout your information/Page_Swag Labs/input_Checkout Your Information_firstName'), 
    'Emik')

WebUI.setText(findTestObject('04. Checkout your information/Page_Swag Labs/input_Checkout Your Information_lastName'), 'Adiani')

WebUI.setText(findTestObject('04. Checkout your information/Page_Swag Labs/input_Checkout Your Information_postalCode'), 
    '80361')

WebUI.click(findTestObject('04. Checkout your information/Page_Swag Labs/input_continue'))

WebUI.click(findTestObject('05. Checkout Overview/Page_Swag Labs/button_Finish'))

WebUI.verifyTextPresent('Your cart is empty', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('02. Homepage/Page_Swag Labs/Sign_Products'), 'PRODUCTS')


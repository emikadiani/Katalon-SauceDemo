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

WebUI.callTestCase(findTestCase('02. Homepage/TC-HP-06_Add to cart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02. Homepage/Page_Swag Labs/Page_Swag Labs/button_Atc bike light'))

WebUI.click(findTestObject('02. Homepage/Page_Swag Labs/Page_Swag Labs/button_Atc Labs Bolt t-shirt'))

WebUI.click(findTestObject('02. Homepage/Page_Swag Labs/Page_Swag Labs/icon_shopping_cart'))

WebUI.click(findTestObject('03. Shopping Cart/Page_Swag Labs/button_Remove_backpack'))

WebUI.click(findTestObject('03. Shopping Cart/Page_Swag Labs/button_Remove_bike light'))

WebUI.click(findTestObject('03. Shopping Cart/Page_Swag Labs/button_Remove_bolt tshirt'))

WebUI.click(findTestObject('03. Shopping Cart/Page_Swag Labs/button_Checkout'))


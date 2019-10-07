import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8082/frevvo/web/login')

WebUI.setText(findTestObject('Object Repository/Page_frevvo  Login/input_Username_username'), 'd@d')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_frevvo  Login/input_Password_password'), 'hngrAGUO4YCAWaVv7sCGDQ==')

WebUI.sendKeys(findTestObject('Object Repository/Page_frevvo  Login/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_frevvo  Your Applications/a_Edit'))

WebUI.click(findTestObject('Object Repository/Page_frevvo  Forms/a_Edit'))

WebUI.click(findTestObject('Object Repository/Page_frevvo  Form 9 Form/a_v0_e-edit-property'))

WebUI.delay(10)

WebElement obj = CustomKeywords.'com.katalon.plugin.keyword.shadow.ShadowKeywords.findElement'('frevvo-ui-form-properties#form-properties>frevvo-form-properties-page#settingsPage>input[title=\'Name of the form\']')

obj.click()

obj.sendKeys('QAAQAQAQ QAQAQA QAQAQA QAQAQA')

WebUI.closeBrowser()


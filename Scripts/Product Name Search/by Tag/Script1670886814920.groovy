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

Mobile.startApplication(GlobalVariable.KFM, false)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('KFM Objects/searchItem_button'), 0)

Mobile.tap(findTestObject('KFM Objects/searchObat'), 0)

Mobile.setText(findTestObject('KFM Objects/searchObat'), 'batuk', 0)

Mobile.tap(findTestObject('KFM Objects/tagName_Batuk-Pilek'), 0)

Mobile.scrollToText('ALPARA STRIP 10 KAPLET', FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.tap(findTestObject('KFM Objects/deleteName_Search'), 0)

Mobile.setText(findTestObject('KFM Objects/searchObat'), 'pusing', 0)

Mobile.tap(findTestObject('KFM Objects/tagName_Mual-Muntah'), 0)

Mobile.scrollToText('STARVIT 15 ML DUS 10 SACHET', FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.tap(findTestObject('KFM Objects/deleteName_Search'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('KFM Objects/deleteName_Search'), 0)

Mobile.setText(findTestObject('KFM Objects/searchObat'), 'hamil', 0)

Mobile.tap(findTestObject('KFM Objects/tagName_Hamil'), 0)

Mobile.scrollToText('SENSITIF STRIP UC TES KEHAMILAN', FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.tap(findTestObject('KFM Objects/deleteName_Search'), 0)


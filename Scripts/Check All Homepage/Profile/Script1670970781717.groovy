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

Mobile.tap(findTestObject('Object Repository/KFM Objects/Profile_Image'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/KFM Objects/assertPoint_profileName'), 'Mazway')

Mobile.tap(findTestObject('Object Repository/KFM Objects/ID_Member'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/KFM Objects/assertPoin_memberPhoneID'), '+6281310096543')

Mobile.tap(findTestObject('Object Repository/KFM Objects/Password'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/KFM Objects/asserPoint_Kata-Sandi'), 'Kata Sandi')

Mobile.tap(findTestObject('Object Repository/KFM Objects/Address'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/KFM Objects/assertPoin_Address'), 0)

Mobile.tap(findTestObject('Object Repository/KFM Objects/Voucher'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/KFM Objects/assertPoint_Voucher Saya'), 'Voucher Saya')

Mobile.closeApplication()


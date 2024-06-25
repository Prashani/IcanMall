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

Mobile.startApplication('D:\\ican lanka\\katalon\\app-iCanMall-debug (24).apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Profile'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.RelativeLayout (3)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Add a new address'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Enter your name'), 'jhon')

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Enter your mobile number'), '768978787')

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Enter alternative number'), '790908989')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Select the province, district, city'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Sri Lanka'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Western'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Colombo'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Colombo 7'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Street, houseapartment, etc'), 'abc road, colombo 7')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Save'), 0)

Mobile.closeApplication()


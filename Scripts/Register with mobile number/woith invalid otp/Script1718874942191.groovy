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

Mobile.tap(findTestObject('Object Repository/android.widget.RelativeLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Confirm (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Profile (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Confirm (3)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Enter your mobile number or email (1)'), '789090909')

Mobile.tap(findTestObject('Object Repository/android.widget.Button - GET CODE (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Enter Verification Code (1)'), '1111')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Sign in (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Sign in (1)'), 0)

Mobile.closeApplication()


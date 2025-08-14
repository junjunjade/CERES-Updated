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

String apkPath = GlobalVariable.APK_PATH;
Mobile.startApplication(apkPath, true);

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.EditText - Usercode'), 0)

Mobile.setText(findTestObject('Object Repository/Transactions/android.widget.EditText - Usercode'), '000000', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Transactions/android.widget.EditText - Password'), 'tzH6RvlfSTg=',
	0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - POS'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.Button - DINE-IN'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.Button - SALADS'), 0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - SALADS'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.Button - FRUIT SALAD'), 0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - FRUIT SALAD'), 0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - CEASAR SALAD'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.TextView - Ceasar Salad'), 0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.TextView - Ceasar Salad'), 0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.TextView - 3'), 0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.TextView - Ceasar Salad'), 0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - DISCOUNT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.Button - MEDAL OF VALOR'), 0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - MEDAL OF VALOR'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.EditText - Name'), 0)

Mobile.setText(findTestObject('Object Repository/Transactions/android.widget.EditText - Name'), 'MOV Customer', 0)

Mobile.setText(findTestObject('Object Repository/Transactions/android.widget.EditText - ID No'), '44445', 0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - OK DISCOUNT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.Button - PAYMENT'), 0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - PAYMENT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.Button - PAYPAL'), 0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - PAYPAL'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.EditText - REF NO'), 0)

Mobile.setText(findTestObject('Object Repository/Transactions/android.widget.EditText - REF NO'), '123456789', 0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - CONFIRM'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.Button - SETTLEMENT'), 0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - SETTLEMENT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.Button - OK CONFIRM PAYMENT'), 0)
Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - OK CONFIRM PAYMENT'), 0)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()


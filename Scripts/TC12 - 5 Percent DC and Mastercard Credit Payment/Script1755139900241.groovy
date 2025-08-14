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
import org.openqa.selenium.interactions.PointerInput
import org.openqa.selenium.interactions.Sequence
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import java.time.Duration

String apkPath = GlobalVariable.APK_PATH;
Mobile.startApplication(apkPath, true);

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.EditText - Usercode'), 0)

Mobile.setText(findTestObject('Object Repository/Transactions/android.widget.EditText - Usercode'), '000000', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Transactions/android.widget.EditText - Password'), 'tzH6RvlfSTg=',
	0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - POS'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.Button - PARTY TREATS'), 
    0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - PARTY TREATS'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.Button - SPAG-ALFREDO SAUCE'), 
    0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - SPAG-ALFREDO SAUCE'), 0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - DISCOUNT'), 0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - 5 OTHER DISCOUNT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.Button - PAYMENT'), 0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - PAYMENT'), 0)

// Swipe using W3C Actions
def driver = MobileDriverFactory.getDriver()
def finger = new PointerInput(PointerInput.Kind.TOUCH, "finger")
def swipe = new Sequence(finger, 1)

int deviceWidth = Mobile.getDeviceWidth()
int deviceHeight = Mobile.getDeviceHeight()

// You can adjust these to control the distance & position
int startX = (deviceWidth * 0.7).toInteger()     // 70% from left
int endX = (deviceWidth * 0.5).toInteger()       // 50% from left
int startY = (deviceHeight * 0.3).toInteger()    // 30% from top (higher on screen)

swipe.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startX, startY))
swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
swipe.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), endX, startY + 10))
swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()))

driver.perform([swipe])

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.Button - MASTER CARD DEBIT'),
	0)
Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - MASTER CARD CREDIT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.EditText - REF NO'), 0)

Mobile.setText(findTestObject('Object Repository/Transactions/android.widget.EditText - REF NO'), '123456', 0)

Mobile.setText(findTestObject('Object Repository/Transactions/android.widget.EditText - CUS NAME'), 'Wendel', 0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - CONFIRM'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.Button - SETTLEMENT'), 0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - SETTLEMENT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.Button - OK CONFIRM PAYMENT'), 0)
Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - OK CONFIRM PAYMENT'), 0)

Mobile.delay(6, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()


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

// Start the app
String apkPath = GlobalVariable.APK_PATH
Mobile.startApplication(apkPath, true)

// Login flow
Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.EditText - Usercode'), 0)
Mobile.setText(findTestObject('Object Repository/Transactions/android.widget.EditText - Usercode'), '000000', 0)
Mobile.setEncryptedText(findTestObject('Object Repository/Transactions/android.widget.EditText - Password'), 'tzH6RvlfSTg=', 0)
Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - POS'), 0)

// Wait for target screen
Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.Button - PARTY TREATS'), 10)

// Perform horizontal swipe using W3C PointerInput
import org.openqa.selenium.interactions.PointerInput
import org.openqa.selenium.interactions.Sequence
import org.openqa.selenium.WebDriver
import java.time.Duration
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

def driver = MobileDriverFactory.getDriver()
def finger = new PointerInput(PointerInput.Kind.TOUCH, "finger")
def swipe = new Sequence(finger, 1)

// Optional: use screen size to make it dynamic
int deviceWidth = Mobile.getDeviceWidth()
int deviceHeight = Mobile.getDeviceHeight()

int startX = (deviceWidth * 0.7).toInteger()   // right side
int endX = (deviceWidth * 0.5).toInteger()     // left side
int startY = (deviceHeight * 0.3).toInteger()  // vertical center

swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
        PointerInput.Origin.viewport(), startX, startY))
swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
swipe.addAction(finger.createPointerMove(Duration.ofMillis(500),
        PointerInput.Origin.viewport(), endX, startY + 10)) // slight Y diff
swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()))

driver.perform([swipe])

// Continue the test
Mobile.delay(3)
Mobile.closeApplication()

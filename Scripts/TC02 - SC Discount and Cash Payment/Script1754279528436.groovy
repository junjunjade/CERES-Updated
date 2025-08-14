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

// 💡 NEW Imports for W3C swipe
import org.openqa.selenium.interactions.PointerInput
import org.openqa.selenium.interactions.Sequence
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import java.time.Duration

String apkPath = GlobalVariable.APK_PATH
Mobile.startApplication(apkPath, true)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.EditText - Usercode'), 0)

Mobile.setText(findTestObject('Object Repository/Transactions/android.widget.EditText - Usercode'), '000000', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Transactions/android.widget.EditText - Password'), 'tzH6RvlfSTg=',
	0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - POS'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.Button - DINE-IN'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.Button - CAKE SLICE'), 0)
Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - CAKE SLICE'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.Button - TRES LECHES'), 0)
Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - TRES LECHES'), 0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - MANGO CAKE'), 0)
Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - PASTRIES'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.Button - TRIPLE CHOCO BROWNIES'), 0)
Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - TRIPLE CHOCO BROWNIES'), 0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - DISCOUNT'), 0)

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

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.Button - SC DISCOUNT'), 0)
Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - SC DISCOUNT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.EditText - Name'), 0)
Mobile.setText(findTestObject('Object Repository/Transactions/android.widget.EditText - Name'), 'JIMAC QA', 0)
Mobile.setText(findTestObject('Object Repository/Transactions/android.widget.EditText - ID No'), '1234', 0)

Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - OK DISCOUNT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.Button - PAYMENT'), 0)
Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - PAYMENT'), 0)

// Second swipe must be a fresh PointerInput and Sequence
def driver2 = MobileDriverFactory.getDriver()
def finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger2")
def swipe2 = new Sequence(finger2, 2)

int deviceWidth2 = Mobile.getDeviceWidth()
int deviceHeight2 = Mobile.getDeviceHeight()

int startX2 = (deviceWidth2 * 0.9).toInteger()
int endX2 = (deviceWidth2 * 0.3).toInteger()
int startY2 = (deviceHeight2 * 0.3).toInteger()

swipe2.addAction(finger2.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startX2, startY2))
swipe2.addAction(finger2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
swipe2.addAction(finger2.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), endX2, startY2 + 10))
swipe2.addAction(finger2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()))

driver.perform([swipe2])

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.Button - CASH'), 0)
Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - CASH'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.TextView - 3'), 0)
Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.TextView - 3'), 0)
Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.TextView - 0'), 0)
Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.TextView - 0'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.Button - SETTLEMENT'), 0)
Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - SETTLEMENT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Transactions/android.widget.Button - OK CONFIRM PAYMENT'), 0)
Mobile.tap(findTestObject('Object Repository/Transactions/android.widget.Button - OK CONFIRM PAYMENT'), 0)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)
Mobile.closeApplication()
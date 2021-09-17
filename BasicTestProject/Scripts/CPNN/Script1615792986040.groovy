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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://se.ict.up.ac.th:10001/client/?fbclid=IwAR1v5TeD6NfiTPUfG0PaevMiWV_zANyixjbo7A6mTQRD72N8DlKo7bmX4j4#/')

WebUI.setText(findTestObject('Object Repository/Page_/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Page_/button_Login'))

WebUI.delay(2)

for (def index : (1..29)) {
    try {
        WebUI.navigateToUrl('https://se.ict.up.ac.th:10001/client/?fbclid=IwAR1v5TeD6NfiTPUfG0PaevMiWV_zANyixjbo7A6mTQRD72N8DlKo7bmX4j4#/admin/volunteer/register')

        WebUI.delay(3)

        WebUI.waitForPageLoad(0)

        WebUI.setText(findTestObject('Page_/input_Username'), findTestData('Cpnn').getValue('Username', index))

        WebUI.setText(findTestObject('Page_/input__Fname'), findTestData('Cpnn').getValue('Fname', index))

        WebUI.setText(findTestObject('Page_/input__Lname'), findTestData('Cpnn').getValue('Lname', index))

        WebUI.setText(findTestObject('Page_/input_Password'), findTestData('Cpnn').getValue('Password', index))

        WebUI.setText(findTestObject('Page_/input_Vpassword'), findTestData('Cpnn').getValue('Vpassword', index))

        WebUI.setText(findTestObject('Page_/input__cellphone'), findTestData('Cpnn').getValue('Cellphone', index))

        WebUI.scrollToPosition(999999, 999999)

        WebUI.waitForJQueryLoad(0)

        WebUI.click(findTestObject('Page_/select_province'))

        WebUI.clickOffset(findTestObject('Page_/select_province'), 0, 50)

        WebUI.click(findTestObject('Page_/Select_Amphor'))

        WebUI.clickOffset(findTestObject('Page_/Select_Amphor'), 0, 50)

        WebUI.click(findTestObject('Page_/Select_Tumbon'))

        WebUI.clickOffset(findTestObject('Page_/Select_Tumbon'), 0, 50)

        WebUI.click(findTestObject('Object Repository/Page_/button_Submit'))

        WebUI.delay(2)
    }
    catch (Exception e) {
        //  Block of code to handle errors
    } 
}
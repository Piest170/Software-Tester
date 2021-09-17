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

WebUI.navigateToUrl('https://www.calculator.net/bmi-calculator.html')

for (def index : (1..5)) {
    WebUI.click(findTestObject('Object Repository/Page_BMI Calculator/Page_BMI Calculator/tr_Age ages 2 - 120'))

    WebUI.setText(findTestObject('Object Repository/Page_BMI Calculator/Page_BMI Calculator/input_ages 2 - 120_cage'), 
		findTestData('Data Files/BMI Data').getValue('Age', index))

    WebUI.setText(findTestObject('Object Repository/Page_BMI Calculator/Page_BMI Calculator/input_Height_cheightmeter'), 
        findTestData('Data Files/BMI Data').getValue('Height', index))

    WebUI.setText(findTestObject('Object Repository/Page_BMI Calculator/Page_BMI Calculator/input_Weight_ckg'),
		findTestData('Data Files/BMI Data').getValue('Weight', index))

    WebUI.click(findTestObject('Object Repository/Page_BMI Calculator/Page_BMI Calculator/span_Male_rbmark'))

    WebUI.click(findTestObject('Object Repository/Page_BMI Calculator/Page_BMI Calculator/input'))
}


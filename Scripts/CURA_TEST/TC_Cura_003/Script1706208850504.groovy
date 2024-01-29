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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/CURA_HOME/OC_Make_Appointment/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/CURA_HOME/OC_Make_Appointment/Page_CURA Healthcare Service/input_username'), 
    'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/CURA_HOME/OC_Make_Appointment/Page_CURA Healthcare Service/input_password'), 
    '9NLz+4tGZcQ=')

WebUI.doubleClick(findTestObject('Object Repository/CURA_HOME/OC_Make_Appointment/Page_CURA Healthcare Service/input_form-control'))

WebUI.setEncryptedText(findTestObject('Object Repository/CURA_HOME/OC_Make_Appointment/Page_CURA Healthcare Service/input_password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/CURA_HOME/OC_Make_Appointment/Page_CURA Healthcare Service/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CURA_HOME/OC_Make_Appointment/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/CURA_HOME/OC_Make_Appointment/Page_CURA Healthcare Service/label_Apply for hospital readmission'))

WebUI.click(findTestObject('Object Repository/CURA_HOME/OC_Make_Appointment/Page_CURA Healthcare Service/input_programs'))

WebUI.click(findTestObject('Object Repository/CURA_HOME/OC_Make_Appointment/Page_CURA Healthcare Service/input_visit_date'))

WebUI.click(findTestObject('Object Repository/CURA_HOME/OC_Make_Appointment/Page_CURA Healthcare Service/td_17'))

WebUI.setText(findTestObject('Object Repository/CURA_HOME/OC_Make_Appointment/Page_CURA Healthcare Service/textarea_comment'), 
    'wjfega')

WebUI.click(findTestObject('Object Repository/CURA_HOME/OC_Make_Appointment/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/CURA_HOME/OC_Make_Appointment/Page_CURA Healthcare Service/amenu-toggle'))

WebUI.click(findTestObject('Object Repository/CURA_HOME/OC_Make_Appointment/Page_CURA Healthcare Service/a_History'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CURA_HOME/OC_Make_Appointment/Page_CURA Healthcare Service/h2_History'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/CURA_HOME/OC_Make_Appointment/Page_CURA Healthcare Service/div_Facility'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/CURA_HOME/OC_Make_Appointment/Page_CURA Healthcare Service/p_Hongkong CURA Healthcare Center'), 
    0)

WebUI.closeBrowser()


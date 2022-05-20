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

WebUI.verifyElementText(findTestObject('Object Repository/RealTaseCase/Page_CURA Healthcare Service/p_Hongkong CURA Healthcare Center'), 
    'Hongkong CURA Healthcare Center')

WebUI.verifyElementText(findTestObject('Object Repository/RealTaseCase/Page_CURA Healthcare Service/p_Yes'), 'Yes')

WebUI.verifyElementText(findTestObject('Object Repository/RealTaseCase/Page_CURA Healthcare Service/p_Medicaid'), 'Medicaid')

WebUI.verifyElementText(findTestObject('Object Repository/RealTaseCase/Page_CURA Healthcare Service/p_31052022'), '31/05/2022')

WebUI.verifyElementText(findTestObject('Object Repository/RealTaseCase/Page_CURA Healthcare Service/p_RealTestCase'), 'RealTestCase')

WebUI.click(findTestObject('Object Repository/RealTaseCase/Page_CURA Healthcare Service/a_Go to Homepage'), FailureHandling.STOP_ON_FAILURE)


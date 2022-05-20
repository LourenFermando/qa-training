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

WebUI.openBrowser("")

WebUI.navigateToUrl("https://about.gitlab.com/")

WebUI.click(findTestObject('Object Repository/GitLab/CaptureGitLab/1/svg'))

WebUI.click(findTestObject('Object Repository/GitLab/CaptureGitLab/1/a_Register'))

WebUI.click(findTestObject('Object Repository/GitLab/CaptureGitLab/2/svg_Deprecations_s16 gl-icon gl-mx-3 gl-text-gray-700'))

WebUI.click(findTestObject('Object Repository/GitLab/CaptureGitLab/2/a_GitHub'))

WebUI.setText(findTestObject('Object Repository/GitLab/CaptureGitLab/3/input_Username or email address_login'), "LourenFermando")

WebUI.setEncryptedText(findTestObject('Object Repository/GitLab/CaptureGitLab/3/input_Password_password'), "ulp9tVGCv8QBRmupbdIwQQ==")

WebUI.click(findTestObject('Object Repository/GitLab/CaptureGitLab/3/input_Password_commit'))

WebUI.click(findTestObject('Object Repository/GitLab/CaptureGitLab/4/a_Switch to GitLab Next_header-user-dropdown-toggle'))

WebUI.click(findTestObject('Object Repository/GitLab/CaptureGitLab/4/a_Sign out'))

WebUI.closeBrowser()
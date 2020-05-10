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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/CRM/frmLogin.aspx')

WebUI.setText(findTestObject('Object Repository/Page_CRM Backend/input_v20201203_UserName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CRM Backend/input_v20201203_Password'), 'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/input_v20201203_btnLogin'))

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/a_User Config'))

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/input_sirichoke-merchantcoth_ctl00ContentPl_8754f1'))

WebUI.setText(findTestObject('Object Repository/Page_CRM Backend/input__ctl00ContentPlaceHolder1txtName'), 'aaa')

WebUI.setText(findTestObject('Object Repository/Page_CRM Backend/input__ctl00ContentPlaceHolder1txtUserID'), 'aaa')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CRM Backend/input__ctl00ContentPlaceHolder1txtPassword'), 
    'gI2mlAjwl1k=')

WebUI.setText(findTestObject('Object Repository/Page_CRM Backend/input_email_ctl00ContentPlaceHolder1txtemail'), 'jutarat.npt@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/input_Add User ()_ctl00ContentPlaceHolder1btnSave'))

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/input_sirichoke-merchantcoth_ctl00ContentPl_8754f1'))

WebUI.setText(findTestObject('Object Repository/Page_CRM Backend/input__ctl00ContentPlaceHolder1txtName'), 'aaa')

WebUI.setText(findTestObject('Object Repository/Page_CRM Backend/input__ctl00ContentPlaceHolder1txtUserID'), 'aaa')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CRM Backend/input__ctl00ContentPlaceHolder1txtPassword'), 
    'gI2mlAjwl1k=')

WebUI.setText(findTestObject('Object Repository/Page_CRM Backend/input_email_ctl00ContentPlaceHolder1txtemail'), 'jutarat.npt@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/input_Add User ()_ctl00ContentPlaceHolder1btnSave'))

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/span_User ID'))

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/input_Add User ()_ctl00ContentPlaceHolder1b_9e4219'))

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/a_Log Out'))

WebUI.setText(findTestObject('Object Repository/Page_CRM Backend/input_v20201203_UserName'), '')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CRM Backend/input_v20201203_Password'), '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/input_v20201203_btnLogin'))

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/span_ UserName  Password'))

WebUI.setText(findTestObject('Object Repository/Page_CRM Backend/input_v20201203_UserName'), 'aaa')

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/input_v20201203_btnLogin'))

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/span_ Password'))

WebUI.setText(findTestObject('Object Repository/Page_CRM Backend/input_v20201203_UserName'), '')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CRM Backend/input_v20201203_Password'), 'jkqxgCfvpK4=')

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/input_v20201203_btnLogin'))

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/span_ UserName'))

WebUI.setText(findTestObject('Object Repository/Page_CRM Backend/input_v20201203_UserName'), 'aaa')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CRM Backend/input_v20201203_Password'), 'sWLZBldZkvA=')

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/input_v20201203_btnLogin'))

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/span_Username  Password'))

WebUI.setText(findTestObject('Object Repository/Page_CRM Backend/input_v20201203_UserName'), 'aaaa')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CRM Backend/input_v20201203_Password'), 'gI2mlAjwl1k=')

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/input_v20201203_btnLogin'))

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/span_Username  Password'))

WebUI.setText(findTestObject('Object Repository/Page_CRM Backend/input_v20201203_UserName'), 'aaa')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CRM Backend/input_v20201203_Password'), 'gI2mlAjwl1k=')

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/input_v20201203_btnLogin'))

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/a_Log Out'))

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/a_Forget Password'))

WebUI.setText(findTestObject('Object Repository/Page_CRM Backend/input_ Forget Password_txtEmail'), 'jutarat.npt')

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/input_ Forget Password_btnSendEmail'))

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/span_ Email'))

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/div_ Forget Password                       _aa9177'))

WebUI.setText(findTestObject('Object Repository/Page_CRM Backend/input_ Forget Password_txtEmail'), 'jutarat.npt@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/input_ Forget Password_btnSendEmail'))

WebUI.click(findTestObject('Object Repository/Page_CRM Backend/a_ Forget Password'))

WebUI.closeBrowser()


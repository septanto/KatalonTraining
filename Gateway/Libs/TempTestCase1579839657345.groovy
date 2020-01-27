import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/zf/bvflk8gx6y79qx728csjjqzh0000gp/T/Katalon/Test Cases/InternetBanking/BRI Ceria/TC01-Payment/20200124_112057/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/InternetBanking/BRI Ceria/TC01-Payment', new TestCaseBinding('Test Cases/InternetBanking/BRI Ceria/TC01-Payment',[:]), FailureHandling.STOP_ON_FAILURE , false)
    

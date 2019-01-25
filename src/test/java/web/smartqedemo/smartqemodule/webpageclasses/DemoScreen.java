package web.smartqedemo.smartqemodule.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class DemoScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"http://www.devrabbit.com/\",\"report_upload_url\":\"https://192.168.1.142:8080/TAF_Automation_DR/UploadReportFile\",\"project_name\":\"SmartQE-Demo\",\"project_description\":\"\",\"project_id\":200,\"module_name\":\"SmartQEModule\",\"module_description\":\"\",\"sub_module_id\":0,\"module_id\":345,\"testcase_name\":\"TC_Test\",\"testcase_id\":408,\"testset_id\":0,\"executed_timestamp\":-2086768001,\"browser_type\":\"chrome\"}";

	public static String projectName = "smartqedemo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public DemoScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//LI[@id='menu-item-1476']/A[1]")	
	private WebElement	Contact_290916A;
	public String clkAContact_290916() {
		waitForExpectedElement(driver, Contact_290916A);		
		String text = Contact_290916A.getText();
		Contact_290916A.click();
		return text;
	}

}
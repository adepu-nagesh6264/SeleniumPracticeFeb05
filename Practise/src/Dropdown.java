import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
driver.manage().window().maximize();
driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
driver.findElement(By.id("btnLogin")).click();
driver.findElement(By.xpath("//*[@id=\"menu_leave_viewLeaveModule\"]/b")).click();

driver.findElement(By.id("leaveList_cmbSubunit")).click();
Select s = new Select(driver.findElement(By.id("leaveList_cmbSubunit")));
s.selectByValue("6");
//leaveList_cmbSubunit

	}

}

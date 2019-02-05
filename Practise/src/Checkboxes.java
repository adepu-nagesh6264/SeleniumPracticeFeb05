import static org.testng.Assert.assertEquals;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.cssSelector("input[type=\"checkbox\"]")).size());
		driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).click();
		driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).click();
		driver.findElement(By.name("ctl00$mainContent$chk_IndArm")).click();
		driver.findElement(By.name("ctl00$mainContent$chk_StudentDiscount")).click();
		driver.findElement(By.name("ctl00$mainContent$chk_Unmr")).click();
		driver.findElement(By.xpath("//*[@id=\"discount-checkbox\"]/span/a")).click();
		Set<String> mw =driver.getWindowHandles();
		java.util.Iterator<String> i1=mw.iterator();
		
				
		
		
		
		
		
		
	}

}

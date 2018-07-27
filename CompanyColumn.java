import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CompanyColumn {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\Project\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://aamdevcecs-a517229.sites.us2.oraclecloud.com/authsite/QA_AAM ");
        driver.findElement(By.id("username")).sendKeys("abhishek.dabas@sofbang.com");
		driver.findElement(By.id("password")).sendKeys("Sfb#2018");
		driver.findElement(By.id("signin")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id=\"208\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"216\"]/a/span")).click();
		Thread.sleep(10000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\AAM Detail\\Company_CR.jpeg");
		Files.copy(src,dest);
System.out.println("Column not added properly");
	}

}

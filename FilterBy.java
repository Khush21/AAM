import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilterBy {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.id("name")).sendKeys("Abhishek");
		driver.findElement(By.id("Department")).sendKeys("IT");
		driver.findElement(By.id("email")).sendKeys("");
	//driver.close();
	
	System.out.println("OK");
		
	}

}

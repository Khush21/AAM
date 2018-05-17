import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Am {
	 
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Project\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://aamdevcecs-a517229.sites.us2.oraclecloud.com/authsite/americanAxle");
        driver.findElement(By.id("username")).sendKeys("abhishek.dabas@sofbang.com");
		driver.findElement(By.id("password")).sendKeys("Sfb#2018");
		driver.findElement(By.id("signin")).click();
		Thread.sleep(30000);

			
		//Search(driver);
		//legacysearch(driver);
		Logout(driver);
	} 
	private static void Logout(WebDriver driver) {
		try {
			driver.findElement(By.xpath("//*[@id=\"209\"]/a/span")).click();
			
		}
		catch(NoSuchElementException e) {
			System.out.println("Handled NoSuchElementException");	
	}
	}
	public static void legacysearch(WebDriver driver) throws InterruptedException {
		try {
			driver.findElement(By.xpath("//*[@id=\"204\"]/a/span")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id=\"218\"]/a")).click();
			Thread.sleep(10000);
			Select dType =new Select(driver.findElement(By.xpath("//*[@id=\"searchContractForm\"]/div[1]/div[1]/div/div/select")));
			dType.selectByIndex(1);
			Thread.sleep(5000);
			driver.findElement(By.id("authorName")).sendKeys("cary.crouse@aam.com");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"searchContractForm\"]/div[4]/div/div/button")).click();
			   Thread.sleep(10000);
	
		}
			catch(NoSuchElementException e) {
				System.out.println("Handled NoSuchElementException");	
			}
		System.out.println("OK");
		}
	
	public static void Search(WebDriver driver) throws InterruptedException {
		try {
			
			driver.findElement(By.xpath("//*[@id=\"container\"]/header/div[1]/div/div")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id=\"container\"]/header/div[1]/div/div")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id=\"204\"]/a/span")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id=\"206\"]/a")).click();
			Thread.sleep(10000);
			Select dType =new Select(driver.findElement(By.id("selectedType")));//
			dType.selectByIndex(0);
			Thread.sleep(10000);
			WebElement searchcontract=driver.findElement(By.id("contractNumber"));
			searchcontract.sendKeys("L1");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"searchContractForm\"]/div[8]/div/div/button")).click();

		}catch(NoSuchElementException e) {
			System.out.println("Handled NoSuchElementException");
		Thread.sleep(20000);
		}
		
		System.out.println("Done");	
			
			
		}
		

		}
		





	

	

	
	
	
		
	



















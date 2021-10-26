package sample1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div[@class='a4bIc']/input")).sendKeys("DXC Technologies");
		//driver.findElement(By.xpath("//div[@class='a4bIc']/input")).sendKeys("");
		Thread.sleep(10000);
		driver.quit();

	}

}

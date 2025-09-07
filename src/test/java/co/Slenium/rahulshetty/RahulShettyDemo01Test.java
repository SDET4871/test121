package co.Slenium.rahulshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RahulShettyDemo01Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		//driver.findElement(By.linkText("Sign In")).click();
		//driver.findElement(By.partialLinkText("Sign In")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.tagName("h1")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Welcome to Rahul Shetty Academy");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();

	}
}

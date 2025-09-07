//package co.Slenium.rahulshetty;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class RahulShettyDemo03_SuggestiveDropdown {
//
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		
//		WebDriver driver = new ChromeDriver();
//		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.get("https://www.spicejet.com/");
//		driver.manage().window().maximize();
//		
//		
//		// driver.findElement(By.id("autocomplete")).sendKeys("ind");
//		 
//		driver.findElement(By.xpath("//div[text()='From']/parent::div/div[2]/input")).sendKeys("su");
//		
//		List<WebElement> options=driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
//		
//		
//		System.out.println(options.size());
//		for(WebElement option:options) {
//			if(option.getText().equalsIgnoreCase("Surat"))
//			{
//				option.click();
//				break;
//			}
//			
//		}
//		
//		
//		// Handling Checkbox
//		
//		/*
//		//driver.findElement(By.xpath("//input[@value='option2']")).click();
//		driver.findElement(By.xpath("//input[@value='option2']")).click();
//		System.out.println(driver.findElement(By.xpath("//input[@value='option2']")).isSelected());
//		Thread.sleep(3000);
//		System.out.println(driver.findElements(By.xpath("//div[@id='checkbox-example']/fieldset/label")).size());
//		driver.close();
//		*/
//		
//		
//		// Handling Radio Buttons 
//		
//		driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).click();		
//	}
//
//}

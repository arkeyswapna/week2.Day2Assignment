package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactAsnmt2 {

	public static void main(String[] args) {
//		* //Pseudo Code
//		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
//		 * 2. Enter UserName and Password Using Id Locator 
//		 * 3. Click on Login Button using Class Locator
//		 * 4. Click on CRM/SFA Link 
//		 * 5. Click on contacts Button
//		 * 6. Click on Create Contact 
//		 * 7. Enter FirstName Field Using id Locator
//		 * 8. Enter LastName Field Using id Locator 
//		 * 9. Enter FirstName(Local) Field Using id Locator 
//		 * 10. Enter LastName(Local) Field Using id Locator 
//		 * 11. Enter Department Field Using any Locator of Your Choice 
//		 * 12. Enter Description Field Using any Locator of your choice  
//		 * 13. Enter your email in the E-mail address Field using the locator of your choice 
//		 * 14. Select State/Province as NewYork Using Visible Text
//		 * 15. Click on Create Contact 
//		 * 16. Click on edit button  
//		 * 17. Clear the Description Field using .clear 
//		 * 18. Fill ImportantNote Field with Any text 
//		 * 19. Click on update button using Xpath locator 
//		 * 20. Get the Title of Resulting Page.
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Contact Swapna");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Contact Thota");
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Contact IT");
		driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Contact description");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("Contactsapna@gmail.com");
		WebElement source1=driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		Select d1=new Select(source1);
		d1.selectByVisibleText("Alaska");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		driver.findElement(By.xpath("//textarea[@class='inputBox']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("ccccccc");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		System.out.println(driver.getTitle());	
						
	}

}

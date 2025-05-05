package Week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// launch chrome
				ChromeDriver Driver=new ChromeDriver();
				Driver.get("https://www.facebook.com/");
				Driver.manage().window().maximize();
				String Title1=Driver.getTitle();
				System.out.println(Title1);
				Driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
				Driver.findElement(By.id("pass")).sendKeys("Tuna@321");
				Driver.findElement(By.name("login")).click();
				
	}

}

package Week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookurl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// launch chrome
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://www.facebook.com/");
		Driver.manage().window().maximize();
		String Title1=Driver.getTitle();
		System.out.println(Title1);
		Driver.close();
	}

}

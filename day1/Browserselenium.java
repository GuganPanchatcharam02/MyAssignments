package Week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browserselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Chrome browser
        // ChromeDriver Driver=new ChromeDriver();
		//Edge browser
		EdgeDriver driver1=new EdgeDriver();
		
     driver1.get("http://leaftaps.com/opentaps/control/main");
     driver1.manage().window().maximize();
     String title=driver1.getTitle();
     System.out.println(title);
	}

}

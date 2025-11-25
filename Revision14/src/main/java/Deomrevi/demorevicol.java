package Deomrevi;

import java.util.ArrayList;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demorevicol {
	@Test
	public void colone() {
		ArrayList<String>alexpecetdresult = new ArrayList<String>();
		alexpecetdresult.add("udsy");
		alexpecetdresult.add("hari");
		alexpecetdresult.add("annad");
		alexpecetdresult.add("govind");
		alexpecetdresult.add("sudan");
		alexpecetdresult.add("dammu");
		ArrayList<String>actaulresult = new ArrayList<String>();							
		WebDriver driver = new  ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		for( int i = 1 ; i <= 6 ; i++) {                     
			String actaul = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[1]/ul/li[" + i + "]/a")).getText();
			System.out.println(actaul);
			actaulresult.add(actaul);
			
			
		}	
		Assert.assertEquals(actaulresult, alexpecetdresult);
	}
}

package Firstpage;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class seconr {
	@Test
	public void frow() {

	    ArrayList<String> alexpectedresult = new ArrayList<String>();
	    alexpectedresult.add("uday");
	    alexpectedresult.add("naveen");
	    alexpectedresult.add("ravi");
	    alexpectedresult.add("hari");
	    alexpectedresult.add("sahil");
	    alexpectedresult.add("soham");

	    ArrayList<String> actualresult = new ArrayList<String>();

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demowebshop.tricentis.com/register");

	    for(int i = 1; i <= 6; i++) {
	        String xpath = "/html/body/div[4]/div[2]/div[1]/div[1]/ul/li[" + i + "]/a";
	        String actual = driver.findElement(By.xpath(xpath)).getText();
	        System.out.println(actual);
	        actualresult.add(actual);
	    }

	    Assert.assertEquals(actualresult, alexpectedresult);
	}

	
}

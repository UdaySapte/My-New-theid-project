package firstpage;

import static org.testng.Assert.expectThrows;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class thridrow {
	@Test
	public void thirlastrow() {
		ArrayList<String>epectedersult = new ArrayList<String>();
		epectedersult.add("udaay");
		epectedersult.add("om");
		epectedersult.add("hira");
		epectedersult.add("shiv");
		epectedersult.add("book");
		ArrayList<String>acatulresult = new ArrayList<String>();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demowebshop.tricentis.com/register");
	    for(int i = 1;i<= 5;i++) {
	    	String actual = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]/ul/li[" + i + "]/a")).getText();
	    	System.out.println(actual);
	    	acatulresult.add(actual);
	    }
	    Assert.assertEquals(acatulresult, epectedersult);	
	}
	@Test
	public void foruthrow() {
		ArrayList<String> expectedresult = new ArrayList<String>();
		expectedresult.add("Facebook");       
		expectedresult.add("Twitter");
		expectedresult.add("RSS");
		expectedresult.add("YouTube");
		expectedresult.add("Google+");
	ArrayList<String> actaulresult = new ArrayList<String>();
  	  WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		for(int i = 1 ; i <= 5;i++) {
		String actual = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[4]/ul/li[" + i + "]/a")).getText();
			System.out.println(actual);
		actaulresult.add(actual);	
		}
		Assert.assertEquals(actaulresult,expectedresult);
	}
	@Test
	public void fifthrow() {
		ArrayList<String> Expectedresult = new ArrayList<String>();
		Expectedresult.add("Information");
		Expectedresult.add("Customer service");
		Expectedresult.add("My account\r\n"
				+ "");
		Expectedresult.add("Follow us");
		ArrayList<String>actualresult = new ArrayList<String>();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		for(int i = 1 ;i<=4 ;i++) {
			String actual = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[" + i + "]/h3")).getText();
			System.out.println(actual);
			actualresult.add(actual);
		}
		Assert.assertEquals(actualresult, Expectedresult);
	}
	@Test
	public void fristcloume() {
		ArrayList<String>Expectedresult = new ArrayList<String>();
		Expectedresult.add("Books");
		Expectedresult.add("Computers");
		Expectedresult.add("Electronics");
		Expectedresult.add("Apparel & Shoes");
		Expectedresult.add("Digital downloads");
		Expectedresult.add("Jewelry");
		Expectedresult.add("Gift Cards");
		ArrayList<String>actualresult = new ArrayList<String>();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		for(int i = 1; i <=7 ;i++) {
			String actual = driver.findElement(By.xpath(" /html/body/div[4]/div[1]/div[2]/ul[1]/li[" + i + "]/a")).getText();
			System.out.println(actual);
			actualresult.add(actual);
		}
		Assert.assertEquals(actualresult, Expectedresult);
	}
}

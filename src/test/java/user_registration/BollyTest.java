package user_registration;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import generic_utility.FileUtility;

public class BollyTest {
	public static void main(String[] args) throws InterruptedException, IOException {

		FileUtility fUtil = new FileUtility();
		String BROWSER = fUtil.getDataFromPropFile("bro");
		String URL = fUtil.getDataFromPropFile("url");
		String USER_NAME = fUtil.getDataFromPropFile("un");
		String USER_PASSWORD = fUtil.getDataFromPropFile("pwd");

		WebDriver driver = null;

		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("safari")) {
			driver = new SafariDriver();
		} else if (BROWSER.equals("ie")) {
			driver = new InternetExplorerDriver();
		} else {
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		Login
		driver.get(URL);

		driver.findElement(By.partialLinkText("User")).click();

		WebElement mob = driver.findElement(By.name("mobno"));
		mob.sendKeys(USER_NAME);

		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys(USER_PASSWORD);

		driver.findElement(By.name("login")).click();

//		Fill one reg form 
		driver.findElement(By.xpath("//span[text()='Registration Form']")).click();

		String dateofWedding = "08/15/2025";
		WebElement dateOfWed = driver.findElement(By.name("dom"));
		dateOfWed.sendKeys(dateofWedding);

		String hName = "Amitabh Bachchan";
		WebElement hus = driver.findElement(By.name("nofhusband"));
		hus.sendKeys(hName);

		String hPic = "C:\\Users\\User\\Basic_Selenium\\marriage-registration\\resources\\abpassport.jpeg";
		WebElement husPic = driver.findElement(By.name("husimage"));
		husPic.sendKeys(hPic);

		String wName = "Jaya Bachchan";
		WebElement wif = driver.findElement(By.name("nofwife"));
		wif.sendKeys(wName);

		String wPic = "C:\\Users\\User\\Basic_Selenium\\marriage-registration\\resources\\jbpassport.jpeg";
		WebElement wifPic = driver.findElement(By.name("wifeimage"));
		wifPic.sendKeys(wPic);

		String hRel = "Hindu";
		WebElement husrel = driver.findElement(By.name("hreligion"));
		husrel.sendKeys(hRel);

		String wRel = "Hindu";
		WebElement wiferel = driver.findElement(By.name("wreligion"));
		wiferel.sendKeys(wRel);

		String hDob = "11/10/1942";
		WebElement hdob = driver.findElement(By.name("hdob"));
		hdob.sendKeys(hDob);

		String wDob = "11/10/1948";
		WebElement wdob = driver.findElement(By.name("wdob"));
		wdob.sendKeys(wDob);

		String hStatus = "Bachelor";
		WebElement hwdDD = driver.findElement(By.name("hsbmarriage"));
		Select selHus = new Select(hwdDD);
		selHus.selectByVisibleText(hStatus);

		String wStatus = "Bachelor";
		WebElement wwdDD = driver.findElement(By.name("wsbmarriage"));
		Select selWife = new Select(wwdDD);
		selWife.selectByVisibleText(wStatus);

		String add = "Jalsa, B/2, Kapol Housing Society, VL Mehta Road, Juhu Mumbai - 400049";

		WebElement hAdd = driver.findElement(By.name("haddress"));
		hAdd.sendKeys(add);

		WebElement wAdd = driver.findElement(By.name("waddress"));
		wAdd.sendKeys(add);

		String hZipcode = "400049";
		WebElement hZip = driver.findElement(By.name("hzipcode"));
		hZip.sendKeys(hZipcode);

		String wZipcode = "400049";
		WebElement wZip = driver.findElement(By.name("wzipcode"));
		wZip.sendKeys(wZipcode);

		String hState = "Maharashtra";
		WebElement husState = driver.findElement(By.name("hstate"));
		husState.sendKeys(hState);

		String wState = "Maharashtra";
		WebElement wifeState = driver.findElement(By.name("wstate"));
		wifeState.sendKeys(wState);

		String hadh = (int) (Math.random() * (999999999)) + "021";
		String wadh = (int) (Math.random() * (999999999)) + "021";

		WebElement hAdhar = driver.findElement(By.name("hadharno"));
		hAdhar.sendKeys(hadh);

		WebElement wAdhar = driver.findElement(By.name("wadharno"));
		wAdhar.sendKeys(wadh);

		String wit1Name = "Govinda";
		WebElement wit1 = driver.findElement(By.name("witnessnamef"));
		wit1.sendKeys(wit1Name);

		String wit1address = "Ashoknagar";
		WebElement wit1add = driver.findElement(By.name("waddressfirst"));
		wit1add.sendKeys(wit1address);

		String wit2Name = "Namrata";
		WebElement wit2 = driver.findElement(By.name("witnessnames"));
		wit2.sendKeys(wit2Name);

		String wit2Address = "Sector 3";
		WebElement wit2add = driver.findElement(By.name("waddresssec"));
		wit2add.sendKeys(wit2Address);

		String wit3Name = "Pankaj";
		WebElement wit3 = driver.findElement(By.name("witnessnamet"));
		wit3.sendKeys(wit3Name);

		String wit3Address = "Sector 18";
		WebElement wit3add = driver.findElement(By.name("waddressthird"));
		wit3add.sendKeys(wit3Address);

		driver.findElement(By.id("submit")).click();

//		driver.switchTo().alert().accept();

		System.out.println("Registered Successfully!!!");

		Thread.sleep(3000);
		driver.quit();
	}
}
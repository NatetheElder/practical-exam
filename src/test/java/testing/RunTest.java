package testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import base.AddWebElements;
import utility.BrowserFactory;

public class RunTest {
	WebDriver driver;
	String url;
	String ItemName;
	String DueMonth;
	String DueYear;
	String DueDate;
	String browser;
	
	@Before
	public void readConfig() {
		
		Properties prop = new Properties();
		try {
			InputStream input = new FileInputStream("src/main/java/base/config.properties");
			prop.load(input);
			ItemName = prop.getProperty("ItemName");
			DueDate = prop.getProperty("DueDate");
			DueMonth = prop.getProperty("DueMonth");
			DueYear = prop.getProperty("DueYear");
			url = prop.getProperty("url");
			browser = prop.getProperty("browser");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void Test1() {
		driver = BrowserFactory.init(url, browser);

		AddWebElements additem = PageFactory.initElements(driver, AddWebElements.class);
	
		for (int i = 0; i < 5; i++) {
			additem.AddingItem(ItemName);
			additem.DueDay(DueDate);
			additem.DueMonth(DueMonth);
			additem.DueYear(DueYear);
			additem.ClickAdd();
		}
	
		BrowserFactory.tearDown();
	}

	@Test
	public void Test2() {
	
		driver = BrowserFactory.init(url, browser);

		AddWebElements additem = PageFactory.initElements(driver, AddWebElements.class);

		additem.CLICKONSINGLEITEM();
		additem.RemoveItem();
		BrowserFactory.tearDown();
	}
	@Test
	public void Test3() {
		driver = BrowserFactory.init(url, browser);

		AddWebElements additem = PageFactory.initElements(driver, AddWebElements.class);
		
		additem.Toggle();
		additem.RemoveItem();
	
		additem.BlueBackground();
		additem.WhiteBackground();
		BrowserFactory.tearDown();
		
		
		
		
	}
	
}

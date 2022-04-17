package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddWebElements extends Methods {
	
	public AddWebElements(WebDriver driver) {
		this.driver = driver;

	}

	WebDriver driver;

	@FindBy(how = How.NAME, using = "data")
	WebElement ITEM_NAME;
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/input[2]")
	WebElement ADDBUTTON;
	@FindBy(how = How.NAME, using = "category")
	WebElement CATEGORY;
	@FindBy(how = How.NAME, using = "due_day")
	WebElement DAY;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[2]/option[4]")
	WebElement DATE;
	@FindBy(how = How.NAME, using = "due_month")
	WebElement MONTH;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]/option[4]")
	WebElement MONTHNAME;
	@FindBy(how = How.NAME, using = "due_year")
	WebElement YEAR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[4]/option[1]")
	WebElement YEARNAME;
	@FindBy(how = How.NAME, using = "todo[0]")
	WebElement CLICKONSINGLEITEM;
	@FindBy(how = How.NAME, using = "submit")
	WebElement REMOVEITEM;
	@FindBy(how = How.NAME, using = "allbox")
	WebElement TOGGLE;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[1]")
	WebElement SETWHITEBACKGROUND;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[2]")
	WebElement SETBLUEEBACKGROUND;

	public void AddingItem(String ItemName) {
		
		int generatedNum = generateRandomNumber(999);
		ITEM_NAME.sendKeys(ItemName + generatedNum);
	}

	public void DueDay(String date) {
		
		selectFromDropDown(DAY, date);
		}

	public void DueMonth(String month) {

		selectFromDropDown(MONTH, month);

	}

	public void DueYear(String year) {
		selectFromDropDown(YEAR, year);
	}

	public void ClickAdd() {
		ADDBUTTON.click();

	}

	public void Toggle() {
		
		TOGGLE.click();
		
	}
	public void CLICKONSINGLEITEM() {
		CLICKONSINGLEITEM.click();
	}

	public void RemoveItem() {
		REMOVEITEM.click();
	}
	public void WhiteBackground() {
		Actions action = new Actions(driver);
		action.contextClick(SETWHITEBACKGROUND).click();
	}
	public void BlueBackground() {
		Actions action = new Actions(driver);
		action.contextClick(SETBLUEEBACKGROUND).click();
	}
}

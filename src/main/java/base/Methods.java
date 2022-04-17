package base;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods {
	public void waitForElement(WebDriver driver, int waitTime, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, waitTime);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public int generateRandomNumber(int boundryNumber) {
		Random ran = new Random();
		return ran.nextInt(boundryNumber);

	}
	public void selectFromDropDown(WebElement element, String month) {
		Select sel = new Select(element);
		sel.selectByVisibleText(month);
		
	}
}

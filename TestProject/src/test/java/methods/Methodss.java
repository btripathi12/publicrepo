package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methodss {
	WebDriver driver;
	WebDriverWait wait;

	public Methodss(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public WebElement element(By locator) {
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void javaExecutorScrollIntoView(By locator) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()", element(locator));
	}

	public void click(By locator) {
		element(locator).click();
	}
}

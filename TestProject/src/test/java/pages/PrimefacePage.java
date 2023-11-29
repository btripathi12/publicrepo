package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import methods.Methodss;


public class PrimefacePage extends Methodss{
	
	By checkboxTable=By.xpath("(//div[@class='card'])[5]");
	By checkboxElement=By.xpath("(//div[@role='checkbox'])[4]");

	public PrimefacePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	public void element_to_scroll() {
		javaExecutorScrollIntoView(checkboxTable);
	}

	public void checkbox_to_check() {
		click(checkboxElement);
	}

}

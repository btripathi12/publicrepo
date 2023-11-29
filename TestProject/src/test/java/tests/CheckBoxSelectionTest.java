package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.PrimefacePage;

public class CheckBoxSelectionTest extends TestBase{
	

	@Test
	public void checkBoxChkTestCase() {
		page1.element_to_scroll();
		page1.checkbox_to_check();
	}
	
}

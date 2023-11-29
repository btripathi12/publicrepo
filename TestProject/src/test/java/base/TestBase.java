package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import io.github.bonigarcia.wdm.WebDriverManager;
import methods.Methodss;
import pages.PrimefacePage;

public class TestBase {

	public  WebDriver driver;
    public WebDriverWait wait;

	public static final String URL = "https://www.primefaces.org/primereact-v5/#/datatable/selection";
	
	public PrimefacePage page1;
    public Methodss methods;


	@BeforeSuite
	public void setUp(){

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get(URL);
        wait = new WebDriverWait(driver, 20);

		driver.manage().window().maximize();
		
        page1 = new PrimefacePage(driver, wait);

	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}

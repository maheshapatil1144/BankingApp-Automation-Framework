package testBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	// Thread-safe WebDriver instance
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	// Getter method to access WebDriver
	public static WebDriver getDriver() {
		return driver.get();
	}

	@BeforeClass
	@Parameters({ "browser" })
	public void setup(String br) throws IOException {
		switch (br.toLowerCase()) {
		case "chrome":
			driver.set(new ChromeDriver());
			break;
		case "edge":
			driver.set(new EdgeDriver());
			break;
		default:
			System.out.println("Invalid Browser Name...");
			return;
		}

		System.out.println("Browser setup started with: " + br);

		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getDriver().get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		getDriver().manage().window().maximize();
	}

	@AfterClass
	public void tearDown() {
		if (getDriver() != null) {
			getDriver().quit();
			driver.remove(); // Clean up thread-local storage
		}
	}
}
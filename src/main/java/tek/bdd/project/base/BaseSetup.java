package tek.bdd.project.base;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import tek.bdd.project.config.Browser;
import tek.bdd.project.config.ChromeBrowser;
import tek.bdd.project.config.ChromeHeadless;
import tek.bdd.project.config.EdgeBrowser;
import tek.bdd.project.config.FireFoxBrowser;
import tek.bdd.project.utilities.ReadYamlFiles;


public class BaseSetup {
    private static WebDriver webDriver;
    private final ReadYamlFiles environmentVariables;
    public static Logger logger;
    
    public BaseSetup() {
		String filePath = System.getProperty("user.dir") + "/src/main/resources/env_config.yml";
		String log4JPath = System.getProperty("user.dir") + "/src/main/resources/log4j.properties";
		try {
			environmentVariables = ReadYamlFiles.getInstance(filePath);
		} catch (FileNotFoundException e) {
			System.out.println("Failed for Load environment context. check possible file path errors");
			e.printStackTrace();
			throw new RuntimeException("Failed for Load environment context with message " + e.getMessage());

		}
		logger = logger.getLogger("logger_File");
		PropertyConfigurator.configure(log4JPath);
	}

	public WebDriver getDriver() {
		return webDriver;
	}

	public void setupBrowser() {
		HashMap uiProperties = environmentVariables.getYamlProperty("ui");
		String url = uiProperties.get("url").toString();
		Browser browser;
		switch (uiProperties.get("browser").toString().toLowerCase()) {
		case "chrome":
			if ((boolean) uiProperties.get("headless")) {
				browser = new ChromeHeadless();
			} else {
				browser = new ChromeBrowser();
			}
			webDriver = browser.openBrowser(url);
			break;
		case "firefox":
			browser = new FireFoxBrowser();
			webDriver = browser.openBrowser(url);
			break;
		case "edge":
			browser = new EdgeBrowser();
			webDriver = browser.openBrowser(url);
			break;
		default:
			throw new RuntimeException("Unknown Browser check environment properties");
		}
		
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.of(20, ChronoUnit.SECONDS));
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

//	}
	
//	public void quitBrowser() {
//		if(webDriver!=null)
//			webDriver.quit();
    }

}

//public void quitBrowser() {

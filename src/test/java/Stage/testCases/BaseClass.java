package Stage.testCases;
import Stage.utilities.ReadConfig;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class BaseClass {
    ReadConfig readConfig = new ReadConfig();

    public String stageURL = readConfig.getApplicationURL();

    public static WebDriver driver;

    public static Logger logger;

    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", readConfig.getChromeDriverPath());
        driver = new ChromeDriver();
        logger= Logger.getLogger("CPBFramework");
        PropertyConfigurator.configure("log4j.properties");
    }

    @AfterClass
    public void tearDown()
    {
        if(driver!=null) {
            driver.quit();
        }
    }
}

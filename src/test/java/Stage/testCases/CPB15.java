package Stage.testCases;
import org.testng.annotations.Test;

public class CPB15 extends BaseClass{
    @Test
        public void CPB15(){

        driver.get(stageURL);

        logger.info("open staging site");
    }
}
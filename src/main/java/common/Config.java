package common;
import com.codeborne.selenide.Configuration;

public class Config {


    public static final String PLATFORM_AND_BROWSER = "chrome"; //firefox, opera, edge, ie
    /** Clean browser cookies after each iteration **/
    public static final Boolean CLEAR_COOKIES = true;
    /** To keep the browser open after all tests **/
    public static final Boolean HOLD_BROWSER_OPEN = true;
    /** Clear the directory with the screen before starting the build **/
    public static final Boolean CLEAR_REPORT_DIR = true;


    static{
        Configuration.holdBrowserOpen = HOLD_BROWSER_OPEN;
        Configuration.reportsFolder = "build/reports/tests";
        Configuration.browser = PLATFORM_AND_BROWSER;

    }

}

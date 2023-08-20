package Utils;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class ConfigClass {
    @BeforeMethod
    public void setUp() {
        Configuration.browserSize = "1920x1080";
        open("https://www.instagram.com/");
        Configuration.timeout = 5000;
    }
}

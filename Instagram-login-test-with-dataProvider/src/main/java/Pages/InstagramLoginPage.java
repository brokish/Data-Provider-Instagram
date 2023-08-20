package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class InstagramLoginPage {
    public SelenideElement loginInputElement = $(By.xpath("//input[@aria-label='Phone number, username, or email']")),
            passwordInputElement = $(By.xpath("//input[@aria-label='Password']")),
            loginButtonElement = $(By.xpath("//button[@type='submit']")),
            wrongUsernameAndPasswordText = $(By.xpath("//div[@class='_ab2z']"));
}

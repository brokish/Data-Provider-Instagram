package Steps;

import Data.Constants;
import Pages.InstagramLoginPage;
import io.qameta.allure.Step;
import org.testng.Assert;

public class InstagramLoginSteps {
    InstagramLoginPage instagramLoginPage = new InstagramLoginPage();
    Constants constants = new Constants();

    @Step
    public InstagramLoginSteps fillUsernameInput(String username) {
        instagramLoginPage.loginInputElement.setValue(username);
        return this;
    }

    @Step
    public InstagramLoginSteps fillPasswordInput(String password) {
        instagramLoginPage.passwordInputElement.setValue(password);
        return this;
    }

    @Step
    public InstagramLoginSteps clickLoginButton() {
        instagramLoginPage.loginButtonElement.click();
        return this;
    }

    @Step
    public InstagramLoginSteps WrongDataTextValidation() {
        Assert.assertEquals(instagramLoginPage.wrongUsernameAndPasswordText.getText(), constants.WrongDataMessage);
        return this;
    }
}

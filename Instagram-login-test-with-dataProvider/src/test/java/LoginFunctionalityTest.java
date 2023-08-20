import Data.dataProvider;
import Steps.InstagramLoginSteps;
import Utils.ConfigClass;
import org.testng.annotations.Test;

public class LoginFunctionalityTest {
    ConfigClass configClass = new ConfigClass();
    InstagramLoginSteps instagramLoginSteps = new InstagramLoginSteps();

    // დატა პროვაიდერის გამოყენებით შემყავს ინსტაგრამზე 5 არავალიდური უზერის მონაცემი
    // ვამომწმებ გამოაქვს თუარა ტექსტი რომ მონაცემები არასწორია
    @Test(dataProvider = "usernames and passwords", dataProviderClass = dataProvider.class)
    public void instagramLoginValidation(String usernames, String passwords) {
        configClass.setUp();
        instagramLoginSteps.fillUsernameInput(usernames)
                .fillPasswordInput(passwords)
                .clickLoginButton()
                .WrongDataTextValidation();
    }
}

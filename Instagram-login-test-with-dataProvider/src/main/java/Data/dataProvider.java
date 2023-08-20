package Data;

import org.testng.annotations.DataProvider;

public class dataProvider {
    @DataProvider(name = "usernames and passwords")
    public Object[][] wrongUsersAndPasswords() {
        return new Object[][]{
                {"Catalonia", "Barcelona1234"},
                {"Morpheus", "BluePill"},
                {"Edward-Norton", "example"},
                {"Mark", "somePassword4"},
                {"user3939394848484", "password@@##%%%(()))"}
        };
    }
}

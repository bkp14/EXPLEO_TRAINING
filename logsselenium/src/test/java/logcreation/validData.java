package logcreation;

import org.testng.annotations.DataProvider;

public class validData {

    @DataProvider(name = "validData")
    public Object[][] validData() {
        return new Object[][] {
            {"test@demo.com", "123456"},
            {"demo@demo.com", "123456"}
        };
    }

    @DataProvider(name = "InvalidData")
    public Object[][] invalidData() {
        return new Object[][] {
            {"wrong@mail.com", "wrong"},
            {"abc@mail.com", "123"}
        };
    }
}
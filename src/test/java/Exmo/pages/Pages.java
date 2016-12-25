package Exmo.pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Created by IgorKruchenko on 24.12.2016.
 */
public class Pages {
    public static void switchToAnotherWindowFrom(String parentHandle) {

        for (String handle : getWebDriver().getWindowHandles()) {
            if (!handle.equals(parentHandle)) {
                getWebDriver().switchTo().window(handle);
                break;
            }
        }
    }
    public static void setValue(String label, String value) {
        $("#" + label).setValue(value);
    }
}

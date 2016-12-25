package Exmo;

import Exmo.pages.AutorizationPage;
import Exmo.pages.Pages;
import Exmo.pages.PromoPage;
import Exmo.widgets.Profiles;
import com.codeborne.selenide.Condition;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static Exmo.pages.Pages.switchToAnotherWindowFrom;
import static Exmo.widgets.InputData.*;
import static Exmo.widgets.Locators.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Created by IgorKruchenko on 24.12.2016.
 */
public class ExmoTest {

    @Before
    public void openResource(){
        clearBrowserCache();
        open(Url);
    }

    @After
    public void closeResource(){
        close();
    }

    @Test
    public void autorizationTest() {
        String windowHandle = String.valueOf(getWebDriver().getWindowHandle());

        PromoPage.openAutorizationPage();
        sleep(2000);
        switchToAnotherWindowFrom(windowHandle);
        Pages.setValue("email", Login);
        Pages.setValue("password", Pass);
        SUBMIT.click();
        LOGO.click();
        LOGOUT.waitUntil(Condition.visible, 10000);
        Profiles profiles = new Profiles();
        profiles.openAllPage();
    }

    @Test
    public void autorization2Test() {
        String windowHandle = String.valueOf(getWebDriver().getWindowHandle());

        PromoPage.openAutorizationPage();
        sleep(2000);
        switchToAnotherWindowFrom(windowHandle);
        AutorizationPage.setValues(new String[]{"email", "password"}, new String[]{Login, Pass});
        SUBMIT.click();
        LOGO.click();
        LOGOUT.waitUntil(Condition.visible, 10000);
        Profiles profiles = new Profiles();
        profiles.openAllPage();
    }
}

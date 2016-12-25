package Exmo.widgets;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by IgorKruchenko on 24.12.2016.
 */
public class Locators {
    public static SelenideElement AUTORIZATION = $(By.xpath("*//.[@class='btn blue']"));
    public static SelenideElement LOGO = $(By.xpath("*//img[@alt='EXMO LOGO']"));
    public static SelenideElement LOGOUT = $(By.xpath("*//div[@ng-click='logout()']"));

    public static SelenideElement SUBMIT = $(By.xpath(".//button[contains(@class,'reg_start_btn ')]"));
}

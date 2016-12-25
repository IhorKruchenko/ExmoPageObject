package Exmo.pages;

import com.codeborne.selenide.Condition;

import static Exmo.widgets.Locators.AUTORIZATION;

/**
 * Created by IgorKruchenko on 24.12.2016.
 */
public class PromoPage extends Pages{
    public static void openAutorizationPage() {
        AUTORIZATION.waitUntil(Condition.visible, 10000).click();
    }
}

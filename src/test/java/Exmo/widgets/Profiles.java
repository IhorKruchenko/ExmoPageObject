package Exmo.widgets;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.title;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Created by IgorKruchenko on 24.12.2016.
 */
public class Profiles {
    public void openAllPage() {
        int tabsCounter = $$(By.xpath(".//nav[@class='navigation']/div/ul/li")).size();

        for (int i = 1; i<tabsCounter; i++){
            getTabByIndex(i).hover();
            int size = getSubTabsCount(i);
            for (int j = 1; j<=size; j++){
                getSubTabByIndex(i,j).click();
                System.out.println(title().replaceAll("Eхmо.com | Биткоин биржа и трейдинг платформа ",""));
                //System.out.println(title().replaceAll("", "");
                if(title().startsWith("Error")){
                    System.out.println("NOT OPENED: "+getWebDriver().getCurrentUrl());
                }
                getTabByIndex(i).hover();
            }
            System.out.println("------");
        }
    }

    private SelenideElement getTabByIndex(int index){
        return $(By.xpath(".//nav[@class='navigation']/div/ul/li["+index+"]"));
    }
    private int getSubTabsCount(int index){
        return $$(By.xpath(".//nav[@class='navigation']/div/ul/li["+index+"]/div/ul/li")).size();
    }
    protected SelenideElement getSubTabByIndex(int tabIndex, int subTabIndex){
        return $(By.xpath(".//nav[@class='navigation']/div/ul/li["+tabIndex+"]/div/ul/li["+subTabIndex+"]"));
    }
}

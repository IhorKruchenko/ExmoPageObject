package Exmo.pages;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by IgorKruchenko on 24.12.2016.
 */
public class AutorizationPage extends Pages{
    public static void setValues(String[] label, String[] value) {
        for (int i = 0; i < label.length; i++){
            $("#" + label[i]).setValue(value[i]);
        }
    }
}

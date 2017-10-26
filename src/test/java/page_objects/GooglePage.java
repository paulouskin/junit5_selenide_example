package page_objects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Created by NoteP on 25.10.2017.
 */
public class GooglePage {
    public SearchResultPage searchFor(String text) {
        $(By.name("q")).val(text).pressEnter();
        return page(SearchResultPage.class);
    }
}

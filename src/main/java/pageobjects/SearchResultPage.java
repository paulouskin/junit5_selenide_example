package pageobjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by NoteP on 25.10.2017.
 */
public class SearchResultPage {
    public ElementsCollection getResults() {
        return $$("#ires .g");
    }

    public SelenideElement getResult(int index) {
        return $("#ires .g", index);
    }
}

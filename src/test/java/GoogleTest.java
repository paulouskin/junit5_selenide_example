import org.junit.Test;
import page_objects.GooglePage;
import page_objects.SearchResultPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by NoteP on 25.10.2017.
 */
public class GoogleTest {
    @Test
    public void userCanSearch() {
        GooglePage page = open("http://google.com/ncr", GooglePage.class);
        SearchResultPage results = page.searchFor("selenide");
        results.getResults().shouldHaveSize(10);
        results.getResult(0).shouldHave(text("Selenide: concise UI tests in Java"));
    }
}

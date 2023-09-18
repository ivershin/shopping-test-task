package shoppingBag;

import base.Helpers;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SavedItem extends Helpers {

    private String name;
    private SelenideElement item;

    public SavedItem(String itemName) {
        this.name = itemName;
        this.item =
                $(byTestId("sfl-line-items"))
                        .$(new ByText(name))
                        .$x(ancestorByTestId("sfl-line-item"));
    }

    public SavedItem isVisible() {
        item.shouldBe(visible);
        return this;
    }

}

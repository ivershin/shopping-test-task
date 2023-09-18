package shoppingBag;

import base.Helpers;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ShoppingBagItem extends Helpers {

    private String name;
    private SelenideElement item;

    public ShoppingBagItem(String itemName) {
        this.name = itemName;
        this.item =
                $(byTestId("cart-line-items"))
                        .$(new ByText(name))
                        .$x(ancestorByTestId("cart-line-item"));
    }

    public ShoppingBagItem isVisible() {
        item.shouldBe(visible);
        return this;
    }

    public ShoppingBagItem isNotExist() {
        item.shouldNotBe(exist);
        return this;
    }

    public ShoppingBagItem saveForLater() {
        item
                .$(byTestId("cart-sfl-line-item-btn-text"))
                .click();
        return this;
    }
}

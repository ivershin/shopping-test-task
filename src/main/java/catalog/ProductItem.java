package catalog;

import base.Helpers;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;

import static com.codeborne.selenide.Selenide.$;

public class ProductItem extends Helpers {
    private String name;
    private SelenideElement item;

    public ProductItem(String itemName) {
        super();
        this.name = itemName;
        this.item = $(new ByText(name)).$x(ancestorByTestId("product-group"));
    }

    public ProductItem isVisible() {
        item.shouldBe(Condition.visible);
        return this;
    }

    public ProductItemPage open() {
        item.click();
        return new ProductItemPage(name);
    }

}

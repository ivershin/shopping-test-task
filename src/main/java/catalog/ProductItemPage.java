package catalog;

import base.Helpers;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import shoppingBag.ShoppingBag;

import static com.codeborne.selenide.Selenide.$;

public class ProductItemPage extends Helpers {
    String name;

    public ProductItemPage(String itemName) {
        name = itemName;
    }

    SelenideElement details = $(byTestId("pdp-detail"));

    public ProductItemPage addToWishlist() {
        details
                .$(byTestId("whishlist-btn"))
                .click();
        return this;
    }

    public ProductItemPage selectSize(Integer size) {
        details
                .$(byTestId("product-size"))
                .$(new ByText(size.toString()))
                .click();
        return this;
    }

    public ShoppingBag addToBag() {
        details
                .$(byTestId("add-to-cart-btn"))
                .click();
        return new ShoppingBag();
    }

}

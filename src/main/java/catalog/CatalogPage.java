package catalog;

import base.Helpers;
import com.codeborne.selenide.selector.ByText;

import static com.codeborne.selenide.Selenide.$;

public class CatalogPage extends Helpers {

    public CatalogPage filterByType(String type) {
        $(byTestId("category-link-list"))
                .$(new ByText(type))
                .click();
        return this;
    }

    public ProductItem getItem(String name) {
        return new ProductItem(name);
    }
}

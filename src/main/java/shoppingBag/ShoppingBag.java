package shoppingBag;

import base.Helpers;

import static com.codeborne.selenide.Selenide.$;

public class ShoppingBag extends Helpers {

    public ShoppingBagItem getItem(String name) {
        return new ShoppingBagItem(name);
    }

    public SavedItem getSavedItem(String name) {
        return new SavedItem(name);
    }

    public ShoppingBag openSaveForLater() {
        $(byTestId("save-for-later-tab")).click();
        return this;
    }

}

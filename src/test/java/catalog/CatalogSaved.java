package catalog;

import com.codeborne.selenide.Configuration;
import navigation.Navigation;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import shoppingBag.ShoppingBag;

public class CatalogSaved {

    static Navigation mainPage = new Navigation();

    @BeforeAll
    static void setUp() {
        Configuration.timeout = 15000;
        Configuration.browserSize = "1920x1080";

        mainPage
                .open()
                .openLogin()
                .login();
    }

    @Test
    @DisplayName("user can add to wishlist from item page")
    public void userCanAddToWishlistFromItemPage() {
        String type = "Signet Rings";
        String name = "Honey Mini Signet";

        mainPage
                .openRingsCatalog()
                .filterByType(type)
                .getItem(name)
                .open()
                .addToWishlist();

        mainPage
                .openWishlist()
                .getItem(name)
                .isVisible();
    }

    @Test
    @DisplayName("user can save for later from bag")
    public void userCanSaveForLaterFromBag() {
        String type = "Signet Rings";
        String name = "Slim Signet Ring";
        Integer size = 3;

        ShoppingBag shoppingBag = mainPage
                .openRingsCatalog()
                .filterByType(type)
                .getItem(name)
                .open()
                .selectSize(size)
                .addToBag();

        shoppingBag
                .getItem(name)
                .isVisible()
                .saveForLater()
                .isNotExist();

        shoppingBag
                .openSaveForLater()
                .getSavedItem(name)
                .isVisible();
    }

}

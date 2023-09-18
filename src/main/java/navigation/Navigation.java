package navigation;

import base.Helpers;
import catalog.CatalogPage;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Navigation extends Helpers {

    public Navigation open() {
        Selenide.open(System.getProperty("url"));
        $(new By.ById("onetrust-accept-btn-handler")).click();
        return this;
    }

    public LoginModal openLogin() {
        Selenide.$(byTestId("nav-dp-l1-user-navigation-signup")).hover();
        Selenide.$(byTestId("nav-dp-l2-user-button")).click();
        return new LoginModal();
    }

    public CatalogPage openRingsCatalog() {
        Selenide.open(System.getProperty("url") + "/category/rings");
        return new CatalogPage();
    }

    public Wishlist openWishlist() {
        Selenide.$(byTestId("nav-dp-l1-user-navigation-wishlist")).click();
        return new Wishlist();
    }


}

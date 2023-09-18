package navigation;

import base.Helpers;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.disappear;

public class LoginModal extends Helpers {

    SelenideElement modal = Selenide.$(byTestId("sign-up"));

    public Navigation login() {
        modal.$(byTestId("email-input")).setValue(System.getProperty("login"));
        modal.$(byTestId("password-input")).setValue(System.getProperty("password"));
        modal.$(byTestId("sign-in-submit-button")).click();
        modal.should(disappear);
        return new Navigation();
    }

}

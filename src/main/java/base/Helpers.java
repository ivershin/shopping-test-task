package base;

public class Helpers {

    public String byTestId(String selector) {
        return "[data-testid='" + selector + "']";
    }

    public String ancestorByTestId(String selector) {
        return "ancestor::*[@data-testid='" +selector + "']";
    }

}

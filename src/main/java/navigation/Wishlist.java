package navigation;

import base.Helpers;
import catalog.ProductItem;

public class Wishlist extends Helpers {

    public ProductItem getItem(String name) {
        return new ProductItem(name);
    }

}

package StoreFood;

import StoreFactory.Store;

public class StoreFood implements Store {

    @Override
    public void saleGood() {
        System.out.println("Tasty food");
    }

}

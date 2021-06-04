package KitchenApp;

public class MiniFridge extends Refrigerator implements StoreFood {

    public MiniFridge (String type, String brandName, boolean hasShelves) {
        super(type,brandName,hasShelves);
    }

    public void keepFresh() {
        System.out.println("I'm a fridge but small.");
    }
}

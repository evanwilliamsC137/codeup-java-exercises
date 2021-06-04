package KitchenApp;

//Abstract class
//Can serve as a superclass, but we cant directly instantiate an abstract class.

public class ApplianceTest {
    public static void main(String[] args) {
//        Will get error by tring to directly instatiate an abstract class.
//        Appliance app1 = new Appliance();

//        Appliance app1 = new Refrigerator("Two door","LG", true);
        Refrigerator app1 = new Refrigerator("Two door","LG", true);
//        StoreFood app1 = new Refrigerator("Two door","LG", true);

        System.out.println("The brand name: " + app1.brandName);
        System.out.println("The type: " + app1.type);
        System.out.println(app1.isHasShelves());
//        app1.sayHello();
        app1.keepFresh();

//        IceChest iceChest = new IceChest();

//        iceChest.keepFresh();

        MiniFridge mini = new MiniFridge("Supermini","LG", false);

        System.out.println(mini.brandName);



    }
}

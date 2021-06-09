package annotations;
//@SuppressWarnings("all")
@SuppressWarnings("unchecked")
public class Fruit implements Food {


    private String flavor;

    @Deprecated
    private boolean hasFlesh;

    private boolean edibleSeeds;

    @Override
    public String taste() {
        return this.flavor;
    }

    public static void main(String[] args) {
        Fruit lime = new Fruit();
        lime.flavor = "sour";
        System.out.println(lime.taste());
    }
}

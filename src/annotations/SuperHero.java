package annotations;

public class SuperHero extends Person {
    @SuppressWarnings("all")
//    @SuppressWarnings({"deprecated","unchecked"})
    private String publicID;

    public SuperHero(String firstName, String lastName, String publicID) {
        super(firstName,lastName);
        this.publicID = publicID;
    }

    public String getName() {
        return publicID;
    }

    public static void main(String[] args) {
        SuperHero superHero = new SuperHero("Evan", "Williams","SuperDude");
        System.out.println(superHero.getName());
    }
}

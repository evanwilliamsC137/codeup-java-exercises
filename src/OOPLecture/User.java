package OOPLecture;

public class User {
//    Setting up fields for user class

    public int id;
    public String username;
    private String password;
    public String email;
    private boolean isLoggedIn = false;


    public String getPassword(){
        return password;
    }


    public String setPassword(String password){
        return this.password = password;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLogedIn(boolean loggedIn) {
        this.isLoggedIn = loggedIn;
    }

    public void describeUser() {
        System.out.println("username: " + this.username);
        System.out.println("password: " + this.password);
        System.out.println("email: " + this.email);
        System.out.println("Logged in? " + this.isLoggedIn);
    }

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.isLoggedIn = isLoggedIn();

    }

    public User(){};

    public static void main(String[] args) {
        User testUser = new User();
        testUser.id = 1;
        testUser.username = "jayman";
        testUser.password = "password";
        testUser.email = "jayman@email.com";

        System.out.println("username: " + testUser.username);
        System.out.println("password: " + testUser.password);
        System.out.println("email: " + testUser.email);
        System.out.println("Logged in? " + testUser.isLoggedIn);

        User user2 = new User("codeup-dude", "gocodeup", "codeup@email.com");

        System.out.println(user2.username);
        System.out.println(user2.password);
        System.out.println(user2.email);
    }
}

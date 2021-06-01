

class Person {
    private String name;


    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello from " + this.name);
    }

    public static void main(String[] args) {
        Person testPerson = new Person();

        testPerson.name = "Evan";

        System.out.println("My name is: " + testPerson.name);

        testPerson.sayHello();
        testPerson.getName();
        testPerson.setName("Dave");

        System.out.println(testPerson.name);
    }
}


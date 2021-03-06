

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello from " + name);
    }

    public Person(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
//        Person testPerson = new Person("Evan");
//
//        System.out.println("My name is: " + testPerson.name);
//
//        testPerson.sayHello();
//        System.out.println(testPerson.getName());
//
//        testPerson.setName("Dave");
//        System.out.println(testPerson.getName());
//        testPerson.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}


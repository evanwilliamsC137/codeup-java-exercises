import grades.Student;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {


        HashMap<String, Student> students = new HashMap();
        students.put("evanwilliamsC137", new Student("Evan",new ArrayList<>()));
        students.put("otherGuy2021", new Student("Dave",new ArrayList<>()));
        students.put("HelloMan111", new Student("Josh",new ArrayList<>()));
        students.get("evanwilliamsC137").addGrade(95);
        students.get("evanwilliamsC137").addGrade(85);
        students.get("evanwilliamsC137").addGrade(75);

        students.get("otherGuy2021").addGrade(90);
        students.get("otherGuy2021").addGrade(80);
        students.get("otherGuy2021").addGrade(70);

        students.get("HelloMan111").addGrade(80);
        students.get("HelloMan111").addGrade(90);
        students.get("HelloMan111").addGrade(100);

        System.out.println("Welcome!");
        System.out.printf("Here are the Github usernames of our students:\n %s \n",students.keySet());




        for (int x = 0; x > 1;){
            System.out.println("What student would you like to see more information on?");

            Scanner sc = new Scanner(System.in);

            String userResponse = sc.nextLine();



            if (userResponse.equalsIgnoreCase("evanwilliamsC137")) {
                System.out.println("Name: " + students.get("evanwilliamsC137").getName());
                System.out.println("Grade average: " + students.get("evanwilliamsC137").getGradeAverage());
                System.out.println("Would you like to see students information?");
                String yesNo = sc.nextLine();
                if(yesNo.equalsIgnoreCase("Y") || yesNo.equalsIgnoreCase("Yes")){
                    x = 0;
                } else {
                    x ++;
                }
            }else if (userResponse.equalsIgnoreCase("otherGuy2021")) {
                System.out.println("Name: " + students.get("otherGuy2021").getName());
                System.out.println("Grade average: " + students.get("otherGuy2021").getGradeAverage());
                break;
            }else if (userResponse.equalsIgnoreCase("HelloMan111")) {
                System.out.println("Name: " + students.get("HelloMan111").getName());
                System.out.println("Grade average: " + students.get("HelloMan111").getGradeAverage());
                break;
            }
        }

//        if(input.equalsIgnoreCase("radi0guy64")){
//            System.out.println("Name: " + students.get("radi0guy64").getName());
//            System.out.println("GPA: " + students.get("radi0guy64").getGradeAverage());
//            System.out.println("Would you like to see students information?");
//            String yesNo = scanner.nextLine();
//            if(yesNo.equalsIgnoreCase("Y") || yesNo.equalsIgnoreCase("Yes")){
//                x = 0;
//            } else {
//                x ++;
//            }




    }
}

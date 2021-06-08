package grades;

import java.util.ArrayList;

public class Student {

    private String name;

    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }


    public double getGradeAverage() {
        int gradeCounter = 0;
        for(int x = 0; x < grades.size(); x ++){
            int grade = grades.get(x);
            gradeCounter += grade;
        }
        return (gradeCounter / grades.size());
    }

    public static void main(String[] args) {
        Student student = new Student("Evan", new ArrayList<>());
        System.out.println(student.getName());
        student.addGrade(200);
        student.addGrade(100);
        student.addGrade(300);
        System.out.println(student.grades);
        System.out.println(student.getGradeAverage());
    }

}

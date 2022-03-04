package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // Methods
    // returns the student's name
    public String getName(){
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        int gradeSum = 0;
        int gradesLength = this.grades.size();
        for (int grade : this.grades) {
            gradeSum += grade;
        }
        return (double) gradeSum / gradesLength;
    }

    public static void main(String[] args) {
        Student kat = new Student("Kat");
        System.out.println("kat.getName() = " + kat.getName());
        kat.addGrade(100);
        kat.addGrade(70);
        kat.addGrade(80);
        System.out.println("kat.getGradeAverage() = " + kat.getGradeAverage());
    }
}

package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
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
    // records attendance
    public void recordAttendance(String date, String value) {
        if (value.equalsIgnoreCase("a") || value.equalsIgnoreCase("p")){
            this.attendance.put(date, value);
        }
    }
    // returns the average of the students attendance
    public double getAttendanceAverage() {
        int totalDays = this.attendance.size();
        AtomicInteger absences = new AtomicInteger();
        this.attendance.forEach((key, value) -> {
            if (value.equalsIgnoreCase("a")) {
                absences.getAndIncrement();
            }
        });
        return (double) (100 * (totalDays - absences.get())) / totalDays;
    }
    // returns list of days a student was absent
    public void daysAbsent() {
        this.attendance.forEach((key, value) -> {
            if (value.equalsIgnoreCase("a")) {
                System.out.println("Date absent: " + key);
            }
        });
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

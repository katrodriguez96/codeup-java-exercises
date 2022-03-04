package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        // Create HashMap <GitHub username, Student obj>
        HashMap<String, Student> students = new HashMap<>();

        // Create 4 Students, 3 grades each
        Student alphi = new Student("Alphinaud");
        alphi.addGrade(100);
        alphi.addGrade(99);
        alphi.addGrade(100);
        alphi.recordAttendance("2022-03-04", "P");
        alphi.recordAttendance("2022-03-05", "P");
        alphi.recordAttendance("2022-03-06", "P");
        Student ali = new Student("Alisae");
        ali.addGrade(90);
        ali.addGrade(85);
        ali.addGrade(93);
        ali.recordAttendance("2022-03-04", "A");
        ali.recordAttendance("2022-03-05", "P");
        ali.recordAttendance("2022-03-06", "A");
        Student esti = new Student("Estinien");
        esti.addGrade(40);
        esti.addGrade(70);
        esti.addGrade(65);
        esti.recordAttendance("2022-03-04", "P");
        esti.recordAttendance("2022-03-05", "A");
        esti.recordAttendance("2022-03-06", "P");
        Student raha = new Student("G'raha");
        raha.addGrade(95);
        raha.addGrade(90);
        raha.addGrade(89);
        raha.recordAttendance("2022-03-04", "P");
        raha.recordAttendance("2022-03-05", "P");
        raha.recordAttendance("2022-03-06", "A");

        // Add students to HashMap
        students.put("summonerSage", alphi);
        students.put("redMage", ali);
        students.put("azureDragoon", esti);
        students.put("crystalExarch", raha);

        // Create Grades App in command line
        Scanner sc = new Scanner(System.in);
        String userInput;
        String userConfirm;
        System.out.println("Welcome!");
        do{
            System.out.println("\nHere are the GitHub usernames of our students:\n");
            System.out.println("|summonerSage| |redMage| |azureDragoon| |crystalExarch|\n");
            System.out.println("Which student would you like more information on?\n");
            userInput = sc.nextLine();
            if (students.containsKey(userInput)){
                Student currentStudent = students.get(userInput); // returns Student object
                System.out.printf("\nName: %s - Github username: %s", currentStudent.getName(), userInput);
                System.out.printf("\nCurrent average: %.1f", currentStudent.getGradeAverage());
                System.out.printf("\nCurrent attendance average: %.0f%%\n\n", currentStudent.getAttendanceAverage());
            } else {
                System.out.printf("\nSorry, no student found with the Github username of \"%s\"\n\n", userInput);
            }
            System.out.println("Would you like to see another student? [y/n]\n");
            userConfirm = sc.nextLine();
        }while(!userConfirm.equals("n"));
    }
}
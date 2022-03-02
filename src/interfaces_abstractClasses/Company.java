package interfaces_abstractClasses;

public class Company {
    public static void main(String[] args){
        Employee numberBot = new Accountant("accountantBot", "Accounting");
        Employee cleanerBot = new Custodian("cleanerBot", "Maintenance");
        System.out.println("numberBot.work() = " + numberBot.work());
        System.out.println("numberBot.getName() = " + numberBot.getName());
        System.out.println("cleanerBot.work() = " + cleanerBot.work());
        System.out.println("cleanerBot.getDepartment() = " + cleanerBot.getDepartment());
    }
}

package interfaces_abstractClasses;

public class Accountant extends Employee{
    public Accountant(String name, String department) {
        super(name, department);
    }

    @Override // annotation, not required
    public String work() {
        return "TPS reports drafted.";
    }

    public String morningMeeting() {
        return "Accountants have morning meetings between 8:15 - 8:45 am.";
    }
    public String lunchTime() {
        return "An accountant takes their lunch at 12:30pm.";
    }
}

package interfaces_abstractClasses;

public class Custodian extends Employee{
    public Custodian(String name, String department) {
        super(name, department);
    }

    @Override
    public String work() {
        return "Maintaining the building.";
    }
}

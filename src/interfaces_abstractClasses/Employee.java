package interfaces_abstractClasses;

public abstract class Employee {
    protected String name;
    protected String department;

    // Employee constructor
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Employee getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public abstract String work();
}

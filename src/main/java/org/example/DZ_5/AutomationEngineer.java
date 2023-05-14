package org.example.DZ_5;

public class AutomationEngineer extends Employee {

    private final String lastName;

    public AutomationEngineer(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getSeniority() {
        return "Senior";
    }

    @Override
    public String getPosition() {
        return "Automation Engineer";
    }
}

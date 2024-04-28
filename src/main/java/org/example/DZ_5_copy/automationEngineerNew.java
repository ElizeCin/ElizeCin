package org.example.DZ_5_copy;

public class automationEngineerNew extends employeeNew {
    private final String lastName;

    public automationEngineerNew(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    @Override
    public String getPosition() {
        return "Automation engineer";
    }

    @Override
    public String getSeniority() {
        return "Senior";
    }
    @Override
    public String getLastName(){
        return lastName;
    }

}

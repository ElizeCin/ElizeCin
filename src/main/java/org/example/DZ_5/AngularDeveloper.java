package org.example.DZ_5;

public class AngularDeveloper extends Employee {

    public AngularDeveloper(String name) {
        super(name);
    }

    @Override
    public String getSeniority() {
        return "Middle";
    }

    @Override
    public String getPosition() {
        return "Angular Developer";
    }
}

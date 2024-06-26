package org.example.DZ_5_copy;

public abstract class employeeNew {
    final String name;
    public employeeNew (String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getLastName(){
        return " ";
    }
    public abstract String getPosition();
    public abstract String getSeniority();
    public String getInfo(){
        return getName() + " " + getLastName() + " is a " + getSeniority() + " " + getPosition();
    }
    @Override
    public String toString() {
        return name;
    }
}

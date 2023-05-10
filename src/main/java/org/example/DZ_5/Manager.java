package my.hillel.studies.DZ_5;

import java.util.Arrays;

public class Manager extends Employee {

    private final String lastName;
    private Employee[] team;

    public Manager(String name, String lastName) {
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
        return "Manager";
    }

    public void setTeamMembers(Employee... members) {
        team = members;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " and has a team of " + team.length + " members: " + Arrays.toString(team);
    }
}

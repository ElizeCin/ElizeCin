package my.hillel.studies.DZ_5;

public class ManualTestEngineer extends Employee {

    private final String lastName;

    public ManualTestEngineer(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getSeniority() {
        return "Junior";
    }

    @Override
    public String getPosition() {
        return "Manual Test Engineer";
    }
}

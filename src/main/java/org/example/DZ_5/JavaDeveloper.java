package my.hillel.studies.DZ_5;

public class JavaDeveloper extends Employee {

    public JavaDeveloper(String name) {
        super(name);
    }

    @Override
    public String getSeniority() {
        return "Senior";
    }

    @Override
    public String getPosition() {
        return "Java Developer";
    }
}

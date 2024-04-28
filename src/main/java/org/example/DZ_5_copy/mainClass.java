package org.example.DZ_5_copy;

public class mainClass {
    public static void main(String[] args) {
        automationEngineerNew autoTester1 = new automationEngineerNew("Misha", "Aksani");
        manualTesterNew manualTester1 = new manualTesterNew("John", "Smzith");
        managerNew manager1 = new managerNew("William", "Underwood");
//        manager.setTeamMembers(autoTester1, manualTester);


        printInfo (autoTester1);
        printInfo(manualTester1);
        printInfo(manager1);
    }
    private static void printInfo(employeeNew employee) {
        System.out.println(employee.getInfo());
    }
}

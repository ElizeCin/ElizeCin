package org.example.my_drafts;

public class Oksana {
    public static void getOksana(String schedule) {
        switch (schedule){
            case "Morning":
                System.out.println("Oksana wakes up at 7 a.m.");
                break;
            case "Day":
                System.out.println("Oksana studies");
                break;
            case "Evening":
                System.out.println("Oksana plays and reads");
                break;
            case "Night":
                System.out.println("Oksana goes to bed at 21.00 !!!");
        }
    }

    public static void getOksana(Schedule schedule) {
        System.out.println("Enum = " + schedule.name());
        switch(schedule) {
            case MORNING -> {System.out.println("Oksana wakes up at 7 a.m.");
                System.out.println(schedule.getActions());
            }
            case DAY -> System.out.println("Oksana studies " + schedule.getActions() +"   "+ schedule.getMood());
            case EVENING -> System.out.println("Oksana plays and reads");
            case NIGHT -> System.out.println("Oksana goes to bed at 21.00 !!!");
            default -> System.out.println("Error");

        }
    }
}

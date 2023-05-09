package org.example.my_drafts;

public enum Schedule {
    MORNING("waking up", 5, true),
    DAY("studying", 6, false),
    EVENING("reading", 7),
    NIGHT("sleeping", 8);

    private String actions;
    private int mood;
    private boolean b;

    Schedule(String actions, int i) {
        this.actions = actions;
        this.mood = i;
    }


    Schedule(String actions, int i, boolean b) {
        this.actions = actions;
        this.mood = i;
        this.b = b;
    }

    public String getActions() {
        return actions;
    }

    public int getMood() {
        return mood;
    }

}

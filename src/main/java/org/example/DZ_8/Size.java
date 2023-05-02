package org.example.DZ_8;

public enum Size {
    SMALL("S", 20, 5),
    MEDIUM("M", 40, 10),
    LARGE("L", 80, 20),
    EXTRA_LARGE("XL", 120, 60);

    private final String abbreviation;
    private final int length;
    private final int width;

    Size(String abbreviation, int length, int width) {
        this.abbreviation = abbreviation;
        this.length = length;
        this.width = width;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return getAbbreviation() + " or " + name() + " size: length = " + getLength() + ", width = " + getWidth();
    }
}

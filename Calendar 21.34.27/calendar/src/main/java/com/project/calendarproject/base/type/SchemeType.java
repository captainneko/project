package com.project.calendarviewproject.base.type;


public enum SchemeType {
    TRIGLE,
    INDEX,
    BACKGROUND;

    public static SchemeType valueOf(int ordinal) {
        if (ordinal < 0 || ordinal >= values().length) {
            throw new IndexOutOfBoundsException("Invalid ordinal");
        }
        return values()[ordinal];
    }

}

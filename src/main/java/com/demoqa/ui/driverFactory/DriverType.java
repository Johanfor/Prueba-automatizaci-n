package com.demoqa.ui.driverFactory;

public enum DriverType {

    CHROME("Chrome"),
    FIREFOX("Firefox"),
    EDGE("Edge"),
    SAFARI("Safari");

    private String text;

    DriverType(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public static DriverType fromString(String text) {
        for (DriverType type : DriverType.values()) {
            if (type.text.equalsIgnoreCase(text)) {
                return type;
            }
        }
        return null;
    }

}

package com.tw;

public class Car {
    private final String engine;
    private final String body;
    private final String doors;
    private final String windows;
    private final String lights;
    private final String runsBy;

    public Car(String engine, String body, String doors, String windows, String lights, String runsBy) {
        this.engine = engine;
        this.body = body;
        this.doors = doors;
        this.windows = windows;
        this.lights = lights;
        this.runsBy = runsBy;
    }

    public String getEngine() {
        return engine;
    }

    public String getBody() {
        return body;
    }

    public String getDoors() {
        return doors;
    }

    public String getWindows() {
        return windows;
    }

    public String getRunsBy() {
        return runsBy;
    }

    public String getLights() {
        return lights;
    }
}

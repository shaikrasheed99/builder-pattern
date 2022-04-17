package com.tw;

public class Car {
    private final String engine;
    private final String body;
    private final String doors;

    public Car(String engine, String body, String doors) {
        this.engine = engine;
        this.body = body;
        this.doors = doors;
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
}

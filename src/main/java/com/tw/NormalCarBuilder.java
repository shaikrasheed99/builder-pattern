package com.tw;

public class NormalCarBuilder implements ICarBuilder {
    private String engine;
    private String body;
    private String doors;
    private String windows;
    private String lights;
    private String runsBy;

    @Override
    public NormalCarBuilder withEngine(String engineType) {
        this.engine = engineType;
        return this;
    }

    @Override
    public NormalCarBuilder withBody(String bodyType) {
        this.body = bodyType;
        return this;
    }

    @Override
    public NormalCarBuilder withDoors(String doors) {
        this.doors = doors;
        return this;
    }

    @Override
    public NormalCarBuilder withWindows(String windowsType) {
        this.windows = windowsType;
        return this;
    }

    @Override
    public NormalCarBuilder withLights(String lightsType) {
        this.lights = lightsType;
        return this;
    }

    @Override
    public NormalCarBuilder withRunsBy(String runsWith) {
        this.runsBy = runsWith;
        return this;
    }

    @Override
    public NormalCar build() {
        return new NormalCar(engine, body, doors, windows, lights, runsBy);
    }
}
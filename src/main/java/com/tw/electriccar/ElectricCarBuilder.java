package com.tw.electriccar;

import com.tw.ICarBuilder;

public class ElectricCarBuilder implements ICarBuilder {
    private String engine;
    private String runsBy;
    private String body;
    private String doors;
    private String windows;
    private String lights;

    @Override
    public ElectricCarBuilder withEngine(String engineType) {
        this.engine = engineType;
        return this;
    }

    @Override
    public ElectricCarBuilder withBody(String bodyType) {
        this.body = bodyType;
        return this;
    }

    @Override
    public ElectricCarBuilder withDoors(String doors) {
        this.doors = doors;
        return this;
    }

    @Override
    public ElectricCarBuilder withWindows(String windowsType) {
        this.windows = windowsType;
        return this;
    }

    @Override
    public ElectricCarBuilder withLights(String lightsType) {
        this.lights = lightsType;
        return this;
    }

    @Override
    public ElectricCarBuilder withRunsBy(String runsWith) {
        this.runsBy = runsWith;
        return this;
    }

    @Override
    public ElectricCar build() {
        return new ElectricCar(engine, body, doors, windows, lights, runsBy);
    }
}

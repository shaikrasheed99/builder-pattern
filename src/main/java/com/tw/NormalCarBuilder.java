package com.tw;

public class NormalCarBuilder implements ICarBuilder {
    private String engine;
    private String body;
    private String doors;

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
    public NormalCarBuilder withWindows() {
        return null;
    }

    @Override
    public NormalCarBuilder withLights() {
        return null;
    }

    @Override
    public NormalCarBuilder withRunsBy() {
        return null;
    }

    @Override
    public NormalCar build() {
        return new NormalCar(engine, body, doors);
    }
}
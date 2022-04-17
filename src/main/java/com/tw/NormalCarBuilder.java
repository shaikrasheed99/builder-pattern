package com.tw;

public class NormalCarBuilder implements ICarBuilder {
    private String engine;

    @Override
    public ICarBuilder withEngine(String engineType) {
        this.engine = engineType;
        return this;
    }

    @Override
    public ICarBuilder withBody(String boxy) {
        return null;
    }

    @Override
    public ICarBuilder withDoors() {
        return null;
    }

    @Override
    public ICarBuilder withWindows() {
        return null;
    }

    @Override
    public ICarBuilder withLights() {
        return null;
    }

    @Override
    public ICarBuilder withRunsBy() {
        return null;
    }

    @Override
    public NormalCar build() {
        return new NormalCar(engine);
    }
}
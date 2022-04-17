package com.tw;

public interface ICarBuilder {
    ICarBuilder withEngine(String engineType);

    ICarBuilder withBody(String bodyType);

    ICarBuilder withDoors(String doors);

    ICarBuilder withWindows();

    ICarBuilder withLights();

    ICarBuilder withRunsBy();

    Car build();
}

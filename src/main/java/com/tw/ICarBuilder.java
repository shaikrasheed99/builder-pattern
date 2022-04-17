package com.tw;

public interface ICarBuilder {
    ICarBuilder withEngine(String engineType);

    ICarBuilder withBody(String bodyType);

    ICarBuilder withDoors();

    ICarBuilder withWindows();

    ICarBuilder withLights();

    ICarBuilder withRunsBy();

    Car build();
}

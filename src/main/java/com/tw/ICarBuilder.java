package com.tw;

public interface ICarBuilder {
    ICarBuilder withEngine(String engineType);

    ICarBuilder withBody(String bodyType);

    ICarBuilder withDoors(String doors);

    ICarBuilder withWindows(String windowsType);

    ICarBuilder withLights(String lightsType);

    ICarBuilder withRunsBy(String runsWith);

    Car build();
}

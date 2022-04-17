package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElectricCarTest {
    @Test
    void shouldAbleToCreateElectricCarWithEngine() {
        ElectricCar tesla = new ElectricCarBuilder().withEngine("bldc").build();

        assertEquals("bldc", tesla.getEngine());
    }
}

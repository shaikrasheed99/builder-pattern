package com.tw;

import com.tw.electriccar.ElectricCar;
import com.tw.electriccar.ElectricCarBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElectricCarTest {
    @Test
    void shouldAbleToCreateElectricCarWithEngine() {
        ElectricCar tesla = new ElectricCarBuilder().withEngine("bldc").build();

        assertEquals("bldc", tesla.getEngine());
    }

    @Test
    void shouldAbleToCreateElectricCarWithAllTheParts() {
        ElectricCar apple = new ElectricCarBuilder().withEngine("bldc").withBody("metal").withDoors("two").withWindows("glass").withLights("halogen").withRunsBy("battery").build();

        assertEquals("bldc", apple.getEngine());
        assertEquals("metal", apple.getBody());
        assertEquals("two", apple.getDoors());
        assertEquals("glass", apple.getWindows());
        assertEquals("halogen", apple.getLights());
        assertEquals("battery", apple.getRunsBy());
    }
}

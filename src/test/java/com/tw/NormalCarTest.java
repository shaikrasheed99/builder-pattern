package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NormalCarTest {
    @Test
    void shouldAbleToCreateNormalCarWithEngine() {
        NormalCar suv = new NormalCarBuilder().withEngine("inline").build();

        assertEquals("inline", suv.getEngine());
    }

    @Test
    void shouldAbleToCreateNormalCarWithEngineAndBodyAndDoors() {
        NormalCar suv = new NormalCarBuilder().withEngine("inline").withBody("boxy").withDoors("four").build();

        assertEquals("inline", suv.getEngine());
        assertEquals("boxy", suv.getBody());
        assertEquals("four", suv.getDoors());
    }

    @Test
    void shouldAbleToCreateNormalCarWithAllTheParts() {
        NormalCar suv = new NormalCarBuilder().withEngine("inline").withBody("boxy").withDoors("four").withWindows("glass").withRunsBy("petrol").withLights("halogen").build();

        assertEquals("glass", suv.getWindows());
        assertEquals("petrol", suv.getRunsBy());
        assertEquals("halogen", suv.getLights());
    }
}

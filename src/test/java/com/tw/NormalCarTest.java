package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NormalCarTest {
    @Test
    void shouldAbleToCreateNormalCarWithEngine() {
        Car suv = new NormalCarBuilder().withEngine("inline").build();
        
        assertEquals("inline", suv.getEngine());
    }
}

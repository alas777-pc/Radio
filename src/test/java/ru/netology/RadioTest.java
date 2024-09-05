package ru.netology;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {


    @Test
    public void testEquals() {
        Radio radio1 = new Radio(1, 50, 0, 0, 10, 0, 100);
        Radio radio2 = new Radio(1, 50, 0, 0, 10, 0, 100);
        assertEquals(radio1, radio2);
    }

    @Test
    public void testHashCode() {
        Radio radio1 = new Radio(1, 50, 0, 0, 10, 0, 100);
        Radio radio2 = new Radio(1, 50, 0, 0, 10, 0, 100);
        assertEquals(radio1.hashCode(), radio2.hashCode());
    }

    @Test
    public void testToString() {
        Radio radio = new Radio(1, 50, 0, 0, 10, 0, 100);
        String expected = "Radio(currentStation=1, currentVolume=50, counterStation=0, minStation=0, maxStation=10, minVolume=0, maxVolume=100)";
        assertEquals(expected, radio.toString());
    }
}
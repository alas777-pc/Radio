package ru.netology;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void testConstructorWithCountStationAndCurrentVolume() {

        int countStation = 10;
        int currentVolume = 50;


        Radio radio = new Radio(countStation, currentVolume);


        assertEquals(countStation, radio.getCounterStation());
        assertEquals(currentVolume, radio.getCurrentVolume());
    }

    @Test
    public void testGetCurrentStation() {
        int i = 50;int expectedCurrentStation = 5;
        Radio radio = new Radio(expectedCurrentStation, 50, 10, 0, 10, 0, 100);


        int actualCurrentStation = radio.getCurrentStation();


        assertEquals(expectedCurrentStation, actualCurrentStation);
    }

    @Test
    public void testSetCurrentStation() {

        int expectedCurrentStation = 5;
        Radio radio = new Radio(10, 50, 10, 0, 10, 0, 100);


        radio.setCurrentStation(expectedCurrentStation);


        assertEquals(expectedCurrentStation, radio.getCurrentStation());
    }
}


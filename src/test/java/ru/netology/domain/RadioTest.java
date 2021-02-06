package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio(0,10,0,0,100,0);

    @Test
    public void nextStation() {
        int currentStation = 9;
        radio.setCurrentStation(currentStation);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextStation1() {
        int currentStation = 5;
        radio.setCurrentStation(currentStation);
        radio.nextRadioStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void nextStation2() {
        int currentStation = 10;
        radio.setCurrentStation(currentStation);
        radio.nextRadioStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void prevStation() {
        int currentStation = 0;
        radio.setCurrentStation(currentStation);
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void prevStation1() {
        int currentStation = -1;
        radio.setCurrentStation(currentStation);
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void prevStation2() {
        int currentStation = 5;
        radio.setCurrentStation(currentStation);
        radio.prevRadioStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void inputRadioStation() {
        int RadioStation = 7;
        int currentStation = 2;
        radio.setCurrentStation(currentStation);
        radio.inputRadioStation(RadioStation);
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void inputRadioStation1() {
        int RadioStation = 10;
        int currentStation = 2;
        radio.setCurrentStation(currentStation);
        radio.inputRadioStation(RadioStation);
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void inputRadioStation2() {
        int RadioStation = -1;
        int currentStation = 2;
        radio.setCurrentStation(currentStation);
        radio.inputRadioStation(RadioStation);
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void volumePlus() {
        int currentVolume = 10;
        radio.setCurrentVolume(currentVolume);
        radio.soundVolumePlus();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void volumePlusOne() {
        int currentVolume = 5;
        radio.setCurrentVolume(currentVolume);
        radio.soundVolumePlus();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void volumePlusTwo() {
        int currentVolume = 11;
        radio.setCurrentVolume(currentVolume);
        radio.soundVolumePlus();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void volumeMinus() {
        int currentVolume = 5;
        radio.setCurrentVolume(currentVolume);
        radio.soundVolumeMinus();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void volumeMinusOne() {
        int currentVolume = 0;
        radio.setCurrentVolume(currentVolume);
        radio.soundVolumeMinus();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void volumeMinusTwo() {
        int currentVolume = -1;
        radio.setCurrentVolume(currentVolume);
        radio.soundVolumeMinus();
        assertEquals(0, radio.getCurrentVolume());
    }

}


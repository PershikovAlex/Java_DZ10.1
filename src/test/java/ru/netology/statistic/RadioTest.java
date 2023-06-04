package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSelectNumberStation() {
        radio.setCurrentNumberStation(3);

        Assertions.assertEquals(3, radio.getCurrentNumberStation());
    }

    @Test
    public void shouldNextNumberStation() {
        Radio radio = new Radio(10);
        radio.setCurrentNumberStation(6);
        radio.nextNumberStation();

        Assertions.assertEquals(7, radio.getCurrentNumberStation());
    }

    @Test
    public void shouldPrevNumberStation() {
        radio.setCurrentNumberStation(6);
        radio.prevNumberStation();

        Assertions.assertEquals(5, radio.getCurrentNumberStation());
    }

    @Test
    public void shouldNextNumberStationAfterMax() {
        radio.setCurrentNumberStation(9);
        radio.nextNumberStation();

        Assertions.assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    public void shouldPrevNumberStationBeforeMin() {
        radio.setCurrentNumberStation(0);
        radio.prevNumberStation();

        Assertions.assertEquals(9, radio.getCurrentNumberStation());
    }

    @Test
    public void shouldNumberStationAboveMax() {
        radio.setCurrentNumberStation(10);

        Assertions.assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    public void shouldNumberStationBelowMin() {
        radio.setCurrentNumberStation(-1);

        Assertions.assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    public void shouldSelectVolume() {
        radio.setCurrentVolume(50);

        Assertions.assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(20);
        radio.increaseVolume();

        Assertions.assertEquals(21, radio.getCurrentVolume());
    }

    @Test
    public void shouldReduceVolume() {
        radio.setCurrentVolume(20);
        radio.reduceVolume();

        Assertions.assertEquals(19, radio.getCurrentVolume());

    }

    @Test
    public void shouldSetToMaxVol() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetToMinVol() {
        radio.setCurrentVolume(0);
        radio.reduceVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        radio.setCurrentVolume(110);

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldReduceVolumeBelowMin() {
        radio.setCurrentVolume(-5);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}




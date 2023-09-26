package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // ТЕСТЫ   НА   ЗВУК

    @Test
    public void shouldVolume() {           // тест текущей громкости
        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {      // тест минимальной громкости
        Radio radio = new Radio();
        radio.setMinVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {       // тест максимальной громкости
        Radio radio = new Radio();
        radio.setMaxVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetHiMaxVolume() {     // тест установки значения громксоти выше max значения
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLowMinVolume() {    // тест установки значения громксоти ниже min значения
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {       // тест понижения значения громкости (на единицу)
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume2() {       // тест понижения значения громкости (на единицу)
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaceVolume() {      // тест повышения значения громкости (на единицу)
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaceVolume2() {      // тест повышения значения громкости (на единицу)
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    // ТЕСТЫ   РАДИОСТАНЦИИ

    @Test
    public void shouldStation() {             // тест текущей радиостанции
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStation() {       // тест максимальной радиостанции
        Radio radio = new Radio();
        radio.setMaxStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinStation() {       // тест минимальной радиостанции
        Radio radio = new Radio();
        radio.setMinStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetHiMaxStation() {     // тест ввода значения радиостанции выше max значения
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLowMinStation() {     // тест ввода значения радиостанции ниже min значения
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceStation() {       // тест переключения радиостанции (уменьшение на единицу)
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.reduceStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceStation2() {       // тест переключения радиостанции (уменьшение на единицу)
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.reduceStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaceStation() {      // тест переключения радиостанции (увеличение на единицу)
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.increaceStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaceStation2() {     // тест переключения радиостанции (увеличение на единицу)
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.increaceStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}

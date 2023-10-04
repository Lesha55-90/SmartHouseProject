package ru.netology.radio;

public class Radio {
    // НАСТРОЙКА ЗВУКА!!!

    private int currentVolume;          // текущий показатель громкости

    public int getCurrentVolume() {    // запрос текущей громкости

        return currentVolume;
    }

    public void setMaxVolume() {       // максимальная громкость
        currentVolume = 100;
    }

    public void setMinVolume() {       // минимальная громкость

        currentVolume = 0;
    }


    public void setCurrentVolume(int newCurrentVolume) {   // настройка условий (значений)
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void reduceVolume() {        // уменьшение громкости
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void increaseVolume() {      // увеличение громкости
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    // НАСТРОЙКА РАДИОСТАНЦИЙ!!!

    private int currentStation;          // текущая радиостанция
    private int maxStation;

    public Radio() {
        this.maxStation = 9;

    }

    public Radio(int stationCount) {
        this.maxStation = stationCount - 1;

    }

    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentStation() {    // запрос текущей радиостанции
        return currentStation;
    }

    public void setMaxStation() {       // максимальная радиостанция (значение)
        currentStation = maxStation;
    }

    public void setMinStation() {       // минимальная радиостанция (значение)
        currentStation = 0;
    }

    public void setCurrentStation(int currentStation) {   // настройка условий (значений)
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void reduceStation() {        // переключения радиостанции (уменьшение на единицу)
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            setMaxStation();
        }
    }

    public void increaceStation() {       // переключения радиостанции (увеличение на единицу)
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            setMinStation();
        }
    }
}

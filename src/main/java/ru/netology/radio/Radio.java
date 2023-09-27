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

    public int getCurrentStation() {    // запрос текущей радиостанции
        return currentStation;
    }

    public void setMaxStation() {       // максимальная радиостанция (значение)
        currentStation = 9;
    }

    public void setMinStation() {       // минимальная радиостанция (значение)
        currentStation = 0;
    }

    public void setCurrentStation(int newCurrentStation) {   // настройка условий (значений)
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void reduceStation() {        // переключения радиостанции (уменьшение на единицу)
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            setMaxStation();
        }
    }

    public void increaceStation() {       // переключения радиостанции (увеличение на единицу)
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            setMinStation();
        }
    }
}

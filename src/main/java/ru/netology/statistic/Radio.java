package ru.netology.statistic;

public class Radio {
    private int minNumberStation = 0;
    private int quantityStation = 10;
    private int currentNumberStation;
    private int maxNumberStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;


    public Radio(int quantityStation) {

        this.maxNumberStation = quantityStation - 1;
    }


    public int getCurrentNumberStation() {

        return currentNumberStation;
    }

    public void setCurrentNumberStation(int newCurrentNumberStation) {
        if (newCurrentNumberStation < minNumberStation) {
            return;
        }
        if (newCurrentNumberStation > maxNumberStation) {
            return;
        }
        currentNumberStation = newCurrentNumberStation;
    }

    public void nextNumberStation() {
        if (currentNumberStation < maxNumberStation) {
            currentNumberStation = currentNumberStation + 1;
        } else {
            currentNumberStation = minNumberStation;
        }
    }

    public void prevNumberStation() {
        if (currentNumberStation > minNumberStation) {
            currentNumberStation = currentNumberStation - 1;
        } else {
            currentNumberStation = maxNumberStation;
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            newCurrentVolume = minVolume;
        }
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}


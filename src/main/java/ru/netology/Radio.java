package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
public class Radio {

    private int maxNumberRadioStation;

    private int minNumberRadioStation = 0;

    private int numberCurrentRadioStation;

    private int maxSoundVolumeRadio = 100;

    private int minSoundVolumeRadio = 0;

    private int soundVolumeRadio;

    public Radio() {
        this.maxNumberRadioStation = 9;
    }

    public Radio(int quantityRadioStations) {
        this.maxNumberRadioStation = quantityRadioStations - 1;
    }

    public void setNumberCurrentRadioStation(int newNumberCurrentRadioStation) {
        if (newNumberCurrentRadioStation < minNumberRadioStation) {
            newNumberCurrentRadioStation = maxNumberRadioStation;
        }
        if (newNumberCurrentRadioStation > maxNumberRadioStation) {
            newNumberCurrentRadioStation = minNumberRadioStation;
        }
        numberCurrentRadioStation = newNumberCurrentRadioStation;
    }

    public void setSoundVolumeRadio(int newSoundVolumeRadio) {
        if (newSoundVolumeRadio > maxSoundVolumeRadio) {
            newSoundVolumeRadio = maxSoundVolumeRadio;
        }
        if (newSoundVolumeRadio < minSoundVolumeRadio) {
            newSoundVolumeRadio = minSoundVolumeRadio;
        }
        soundVolumeRadio = newSoundVolumeRadio;
    }

    public void valueRadioStationUp() {
        int stationIncrease = numberCurrentRadioStation + 1;
        setNumberCurrentRadioStation(stationIncrease);
    }

    public void valueRadioStationDown() {
        int stationReduction = numberCurrentRadioStation - 1;
        setNumberCurrentRadioStation(stationReduction);
    }

    public void increaseVolume() {
        if (soundVolumeRadio < this.maxSoundVolumeRadio) {
            this.soundVolumeRadio = soundVolumeRadio + 1;
        }
    }

    public void downVolume() {
        if (soundVolumeRadio > this.minSoundVolumeRadio) {
            this.soundVolumeRadio = soundVolumeRadio - 1;
        }
    }
}





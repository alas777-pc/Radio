package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentStation;
    private int currentVolume;
    private int counterStation;
    private int minStation = 0;
    private int maxStation = 10;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int countStation, int currentVolume) {
        this.counterStation = countStation;
        this.maxStation = countStation - 1;
        this.currentVolume = currentVolume;
    }


}


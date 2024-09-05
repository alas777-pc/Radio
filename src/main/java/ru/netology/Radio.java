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
    private int minStation;
    private int maxStation = 10;
    private int minVolume;
    private int maxVolume = 100;


}





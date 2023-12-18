package org.finley.inshur.services;

public class HourToThreeHourWindowService {

    public int convertHoursToThreeHourWindows(int hours){
        return (int) Math.ceil(hours / 3.0);
    }
}

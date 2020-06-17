package com.mizan.part1;

public class BmwClass {

    // Access modifier: pulic, protected, private

   public int numberOfBulb;
    protected int numOdSeat;


   public void bmwName(String bmwSeries){
       System.out.println("this bmw is  " + bmwSeries);
    }
    public void parkingAssist(boolean parkingAssist){
        System.out.println("does this car has parkingAssist ? " +  parkingAssist);

    }
    public void numberOfCamera(int numOfCamera){
        System.out.println("this bmw has total " + numOfCamera+" Camera");
    }
    public void autoPilotFeature(boolean autoPilotFeature){
        System.out.println("does this car has autoPilotFeature ? "+  autoPilotFeature);
    }



}

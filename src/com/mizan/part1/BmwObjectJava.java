package com.mizan.part1;

public class BmwObjectJava {
    public static void main(String[] args) {
        BmwClass bmw9 = new BmwClass();
        bmw9.numberOfBulb = 10;
        bmw9.numOdSeat= 4;

        bmw9.bmwName("nineSeries");
        System.out.println("This car got " + bmw9.numberOfBulb + " bulbs.");
        System.out.println("This car has "  +bmw9.numOdSeat + " seats");
        bmw9.numberOfCamera(4);
        bmw9.autoPilotFeature(true);
        bmw9.parkingAssist(true);


        BmwClass bmw10 =new BmwClass();
        bmw10.numOdSeat = 5;
        System.out.println("This car has "+ bmw10.numOdSeat + " seats");
        bmw10.bmwName("10Series");
        bmw10.parkingAssist(false);
        bmw10.autoPilotFeature(true);





    }
}

package com.mizan.part1;

public class BmwClass1 {
    String color;
    String price;
    String driven;
    int numOfSeat;

    public BmwClass1(String color, String price, String driven, int numOfSeat ){
        this.color=color;
        this.price=price;
        this.driven= driven;
        this.numOfSeat=numOfSeat;
    }

    public static void bmwName(String bmwSeries){
        System.out.println("This bmw is "+ bmwSeries);

    }public void numOfCamera(int totalCamera){
        System.out.println("This Bmw has "+totalCamera +" Camera");

    }public void newInformation(){
        System.out.println("This bmw color is "+color+","+"driven is "+driven+" and total numOfSeat is "+ numOfSeat);
    }
    public void parkingAssist(boolean parkingAssist){
        System.out.println("Does this Bmw has parking Assist ?"+ parkingAssist);

    }public void numOfDoor(int numOfDoor){
        System.out.println("This Car has " +numOfDoor+ " door");
    }







}

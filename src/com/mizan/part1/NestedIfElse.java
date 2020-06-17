package com.mizan.part1;

import javax.swing.*;
import java.util.Scanner;

public class NestedIfElse {

    public static void main(String[] args) {
//        Scanner userInput = new Scanner(System.in);

//        String country = userInput.nextLine();
//        String stateName = userInput.nextLine();
//        String districtname = userInput.nextLine();

//        if (country.equalsIgnoreCase("USA")) {
//            System.out.println("your country is USA.");
//            if (stateName.equalsIgnoreCase("NY")) {
//                System.out.println("I also live in NY.");
//            } else if (stateName.equalsIgnoreCase("NJ")) {
//                System.out.println("My Friend is living there.");
//            } else if (stateName.equalsIgnoreCase("PA")) {
//                System.out.println("My brother is living there.");
//            } else {
//                System.out.println(" I never been to other state");
//            }
//        } else if (country.equalsIgnoreCase("CA")) {
//            System.out.println("your country is Canada.");
//            if (stateName.equalsIgnoreCase("TRO")) {
//                System.out.println("My Friend is living There");
//
//            } else {
//                System.out.println("I Never Been There");
//            }
//
//        }
//        else if (country .equalsIgnoreCase( "BD")){
//            System.out.println("your country is Bangladesh.");
//            if (districtname.equalsIgnoreCase( "Syl")){
//                System.out.println("I also from Syl.");
//            } else {
//                System.out.println( " I never been to other dist.");
//            }
//
//        } else {
//            System.out.println("I dont know ur country !!");
//        }

        String carMode = "D";
        String parkingType = "";
        String drivingMode = "sno";


        if (carMode.equalsIgnoreCase("P")) {

        } else if (carMode.equalsIgnoreCase("D")) {
            if (drivingMode.equalsIgnoreCase("snow")) {
                System.out.println("you are driving in snow");
            } else if (drivingMode.equalsIgnoreCase("Sport")) {
                System.out.println("you are driving in sport mode");
            } else if (drivingMode.equalsIgnoreCase("Regular")) {
                System.out.println("car is in regular mode");
            } else {
                System.out.println("car  is in unknown mode");
            }

        } else if (carMode.equalsIgnoreCase("N")) {
            System.out.println("you can put car in wash station");
        } else if (carMode.equalsIgnoreCase("R")) {
            System.out.println("car will be reverse and back camera is activated");
        } else {
            System.out.println("please check your car mode");
        }


    }

}

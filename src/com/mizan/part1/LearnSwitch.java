package com.mizan.part1;

import java.util.Scanner;

public class LearnSwitch {
    public static void main(String[] args) {

//        String country = "Eng";
//
//        switch (country){
//            case "BD":
//                System.out.println("your country is Bangladesh.");
//                break;
//            case "UK" :
//            case "Eng":
//                System.out.println("your country is United Kingdom.");
//                break;
//            case "AUS" :
//                System.out.println("your country is Australia.");
//                break;
//            default:
//                System.out.println("your country is not listed here.");


        // Modifying above example
        Scanner input = new Scanner(System.in);
        String country = input.nextLine();
        String districtname = input.nextLine();

        switch (country){
            case "BD":
//                if (districtname.equalsIgnoreCase( "Syl")){
//                    System.out.println("I also from Syl.");
//                } else {
//                    System.out.println( " I never been to other dist.");
//                }
                System.out.println("your country is Bangladesh.");
                break;
            case "UK" :
            case "Eng":
                System.out.println("your country is United Kingdom.");
                break;
            case "AUS" :
                System.out.println("your country is Australia.");
                break;
            default:
                System.out.println("your country is not listed here.");


        }

    }
}

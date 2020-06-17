package com.mizan.part1;

import java.util.Scanner;

public class LearningLoop {
    public static void main(String[] args) {
    // for loop
        // Starting point; Condition; increment or decrement
        // i++ is equal to i+1
//    for (int i = 0; i <=10; i++){
//        System.out.println(i);
//        System.out.println("mizan");
//        System.out.println("myName");
//   }

    //Decrement
//        for (int i = 5; i >=0; i--){
//            System.out.println(i);
//        }
//
//       for (int j = 2; j<11; j++){
//            System.out.println(j);
//        }
        // Pre or post decrement/increment
        int k =1;
//    System.out.println(--k);
//    System.out.println(k);
//    System.out.println(k);
//    System.out.println(k);

    // While loop
//    int age =4;
//    while(age<15) {
//        System.out.println("You can go to primary.");
//        age++;
//    }
//        int price=45;
//        while (price<50){
//            System.out.println("Buy this iteam");
//            price++;
//
//        }

        // Do-while loop


//    int age =4;
//   do {
//        System.out.println("You can go to primary.");
//       age++;
//    }
//   while(age<9);




//        System.out.println("please print the even number");
//  for(int l=1; l<=10; l++){
//      if(l%2==0){
//          System.out.println(l);
//      }
//  }

//        System.out.println("please print the odd number");

//          for (int i=1; i<=10; i++){
//              if (i%2!=0){
//                  System.out.println(i);
//              }
//          }
//
            // While loop without condition
//        Scanner userInput = new Scanner(System.in);
//        System.out.println("Please input true/false for door status");
//        boolean doorOpen = userInput.nextBoolean();
//
//        while (doorOpen){
//            System.out.println("Dont trun on A/C");
//            break;
//        }

        String[] nameList = {"Rub", "Phil", "Chris"};
        for (String name : nameList){
            System.out.println(name);
        }


    }
}
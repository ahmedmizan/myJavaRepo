package com.mizan.part1;

public class MethodLesson {
    public static void main(String[] args) {
        oddNumber(6,10);
    }

    public static void firstMethod(){
        System.out.println("we are learning method");
    }
        // Void Method
   public static void printOddNumber(){
               System.out.println("please print the odd number");
        for (int i=1; i<=10; i++){
         if (i%2!=0){
             System.out.println(i);
         }
        }
   }
   public static void printEvenNumber(){
               System.out.println("please print the even number");
        for (int i=1; i<=10; i++){
         if (i%2==0){
             System.out.println(i);
         }
        }
   }
    // Return method
   public static int size(){
        int length = 10;
        int width = 5;
        return length*width;
   }

    public static int calculateSize(){
        int length = 10;
        int width = 5;
        int size = length*width;
        return size;
    }

    // Parameterized method

    public static int calculateSize(int length, int width){
        int size = length*width;
        return size;
    }

    public static void myName(){
        System.out.println("my name is mizan");
    }
     public static void myCountry(){
         System.out.println("missing my country");
     }

     public static void printOddNumbers(){
         System.out.println("please print odd number");
         for (int i=0; i<=20; i++){
             if (i%2!=0){
                 System.out.println(i);
             }
         }
     }

     public static void evenNumbersPrint(){
         System.out.println("please print even number");
         for(int i=0; i<=20; i++){
             if (i%2==0){
                 System.out.println(i);
             }
         }
     }

     public static int totalPopulation(){
        int whitePeople = 200;
        int asianPeople =60;
       return whitePeople*asianPeople;

     }

     public static int totalIncome(){
        int grossSalary=2000;
        int othersIncome=5000;
        return grossSalary*othersIncome;
     }

     public static void oddNumber(int startingNum, int endingNum){

         for (int i=startingNum; i<=endingNum; i++){
             if (i%2!=0){
                 System.out.println(i);
             }
         }

     }



}

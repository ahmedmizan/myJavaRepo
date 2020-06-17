package com.mizan.part1;


import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionLearning {

    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        System.out.println("Pls enter a int number...");
        int numberOne = input.nextInt();
        System.out.println("Pls enter another int number...");
        int numberTwo = input.nextInt();
        try {
            calculateDivision(numberOne,numberTwo);
        } catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("There is a exception in this calculation.");
        } catch (NoSuchElementException e){
            System.out.println("We have no such element exception");

        }finally {
            System.out.println("This is finally block.");
        }

        System.out.println("Pls enter a int number...");
        int number3 = input.nextInt();
        System.out.println("Pls enter another int number...");
        int number4 = input.nextInt();
        int res = number3*number4;
        System.out.println("Result is : " + res);

   int[] age = {10, 29};
   try {
       for(int i = 0; i<=age.length; i++){
           System.out.println(age[i]);
   }

   }catch (ArrayIndexOutOfBoundsException e){
       System.out.println("There is a exception in this array");
       e.printStackTrace();
   }catch (NoSuchElementException e){
       System.out.println("we have no such element exception");
       e.printStackTrace();
   }finally {
       System.out.println("this is finally block");
   }






    }
    public static void calculateDivision(int numberOne, int numberTwo){
        int result = numberOne/numberTwo;
        System.out.println("Result is : " + result);
    }



}

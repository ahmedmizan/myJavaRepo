package com.mizan.part1;

public class IPhoneClass {


    int weight;
    String color;
    int resolution;

    public IPhoneClass(String color, int resolution){
        if(color.equalsIgnoreCase("green") || color.equalsIgnoreCase("yellow") || color.equalsIgnoreCase("blue")){
            System.out.println("your cant put this color.");
        } else {
            this.color = color;
        }
        if (resolution<1000)
            System.out.println("company are not produce");
        else
          this.resolution = resolution;
    }

    public void iPhoneName(int iPhoneSeries){

        System.out.println("this is iphone " + iPhoneSeries );
    }

    public void iPhoneBasicFeature(){
        System.out.println("This iPhone color is " + color + " and resolution is " + resolution + " and weight " + weight);
    }

    public void numberOfCamera(int numOfCamera){
        System.out.println("this iphone has "+ numOfCamera + " Camera");
    }
    public void memorySize(String memorySize){
        System.out.println("this iphone has "+  memorySize +" memory");
    }
}

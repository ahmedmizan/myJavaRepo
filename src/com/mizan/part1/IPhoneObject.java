package com.mizan.part1;

public class IPhoneObject {

    public static void main(String[] args) {

        IPhoneClass iPhone10 = new IPhoneClass("green", 1500);
        iPhone10.iPhoneName(10);
        iPhone10.memorySize("64 GB");
        iPhone10.numberOfCamera(2);
        iPhone10.weight = 200;
        iPhone10.iPhoneBasicFeature();



        IPhoneClass iPhone11 = new IPhoneClass("Black", 2000);
        iPhone11.iPhoneName(11);
        iPhone11.numberOfCamera(3);
        iPhone11.memorySize("128 GB");
        iPhone11.iPhoneBasicFeature();

    }
}

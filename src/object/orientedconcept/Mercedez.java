package object.orientedconcept;

public class Mercedez extends Car {


    private int noOfBulb;


    public int getNoOfBulb() {
        return noOfBulb;
    }

    public void setNoOfBulb(int noOfBulb) {
        this.noOfBulb = noOfBulb;
        System.out.println("Mercedez has total "+noOfBulb+ "no Of Bulb");

    }



    public void autoPilot(){
        System.out.println("Mercedez can drive itself for parking.");
    }

    public void entainmentPackage(){
        System.out.println("Mercedez got very exclusive entertainment system.");
    }

}

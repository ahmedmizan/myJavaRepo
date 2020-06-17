package object.orientedconcept;

public class MercedezObject {

    public static void main(String[] args) {
        Mercedez gLE = new Mercedez();

        gLE.setCarName("GLE");
        gLE.setColor("Red");
        System.out.println("This GLE is " + gLE.getColor() + " color.");
        gLE.setNoOfBulb(12);
        gLE.drive(90);
        gLE.autoPilot();
        gLE.entainmentPackage();
        gLE.setNumOfDoor(4);
        gLE.setPrice();
        gLE.setEngineCapacity("1500");
        gLE.setDriveMode("AWD");
        gLE.activateReverseCam();



    }

}

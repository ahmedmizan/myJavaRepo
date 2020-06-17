package object.orientedconcept;

public class CarObject {
    public static void main(String[] args) {
        Car carDetails = new Car();
       carDetails.setCarName("BMW");
        System.out.println(carDetails.getCarName());
        carDetails.setColor("Black");
        System.out.println(carDetails.getColor());
        carDetails.setNumOfDoor(4);
        System.out.println(carDetails.getNumOfDoor());
        carDetails.setDriveMode("AWD");
        System.out.println(carDetails.getDriveMode());


    }









}

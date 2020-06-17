package object.orientedconcept;

public class Bird extends Animal {

    private boolean isFeather;
    private String sizeOfWings;

    public Bird(int noOfLeg, String color, int weight, int height, boolean isFeather, String sizeOfWings) {
        super(noOfLeg, color, weight, height);
        this.isFeather = isFeather;
        this.sizeOfWings = sizeOfWings;
    }

    public boolean isFeather() {
        return isFeather;
    }

    public void setFeather(boolean feather) {
        isFeather = feather;
    }

    public String getSizeOfWings() {
        return sizeOfWings;
    }

    public void setSizeOfWings(String sizeOfWings) {
        this.sizeOfWings = sizeOfWings;
    }

    public void buildNest(){
        System.out.println("Bird can build own nest.");
    }

//   @Override
//    public void move(int speed){
//        System.out.println("Bird flys at speed of " + speed);
////        super.move(5);
//    }
    @Override
    public void eat(){
        System.out.println("Birds likes to eat insect");
        super.eat();
    }
//    @Override
//    public void walk(){
//        System.out.println("birds walks in small distance");
//        super.walk();
//    }


}

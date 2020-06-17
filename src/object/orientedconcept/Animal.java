package object.orientedconcept;


public class Animal {

    private int noOfLeg;
    private String color;
    private int weight;
    private int height;


    public Animal(int noOfLeg, String color, int weight, int height) {
        this.noOfLeg = noOfLeg;
        this.color = color;

        if (!(weight <= 0)) {
            this.weight = weight;
        } else {
            System.out.println("Pls check weight.");
        }

        if (!(height <= 0)) {
            this.height = height;
        } else {
            System.out.println("Pls check height.");
        }

    }

    public int getNoOfLeg() {
        return noOfLeg;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }


    public void move(int speed) {
        System.out.println("Animal can move at speed of " + speed);
    }

    public void move() {
        System.out.println("Animal can move");

    // Different types of Method overloading
    // 1. You can have parameter or nor parameter in same method
    // 2. You can have two different types of parameter
    // 3. Same type parameter but different type os sequence
}
    public void eat(){
        System.out.println("Animal eats");


    }
    public void walk(){
        System.out.println("Animal is moving around when they need");
    }
    public void walk(int speed){
        System.out.println("Animl speed is different from other animal ");
    }

}

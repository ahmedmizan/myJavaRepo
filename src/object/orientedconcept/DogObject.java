package object.orientedconcept;

public class DogObject {
    public static void main(String[] args) {
        DogClass information = new DogClass();
        information.setDogName("Tom");
        System.out.println(information.getDogName());
        information.setDogAge(5);
        System.out.println(information.getDogAge());
        information.setDogColor("white");
        System.out.println(information.getDogColor());
    }

}

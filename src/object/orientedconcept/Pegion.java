package object.orientedconcept;

public class Pegion {

    public static void main(String[] args) {
//        String myStg = "I am a good programmer.";
//        System.out.println(myStg.substring(7));

        Bird myPegion = new Bird(2,"White", 1, 50, true, "Medium" );
        System.out.println("My pegion got " + myPegion.getNoOfLeg() + " leg.");
//        myPegion.move(10);
//        myPegion.buildNest();
//        System.out.println( myPegion.getColor());
//        System.out.println(myPegion.getWeight());
//        System.out.println(myPegion.getHeight());
        myPegion.walk(10);
        System.out.println(myPegion.isFeather());
        System.out.println(myPegion.getSizeOfWings());
        myPegion.eat();


    }
}

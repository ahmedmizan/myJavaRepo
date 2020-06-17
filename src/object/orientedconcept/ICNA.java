package object.orientedconcept;

public class ICNA implements School {


    @Override
    public void building() {
        System.out.println("ICNA got 3 stored building.");
    }

    @Override
    public void teachingMethods() {
        System.out.println("ICNA got both onsite and online teaching system.");
    }
}

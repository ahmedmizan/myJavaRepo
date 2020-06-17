package object.orientedconcept;

public class AdminOfice {
    public static void main(String[] args) {
        Employee salarySheet = new Employee();
       salarySheet.setName("Murad");
        System.out.println("Value of name variable : " + salarySheet.getName());

        salarySheet.setdOB("May-07-2010");
        System.out.println(salarySheet.getdOB());

        salarySheet.setsSN("333333334");
        System.out.println("This US Employee's SSN is " + salarySheet.getsSN());


        // Create Dog Class with private varibles
        // Create getter and setter
        // Call them in Object class

    }

}

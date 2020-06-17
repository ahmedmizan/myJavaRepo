package object.orientedconcept;

public class Employee {

    private String name;
    private String dOB;
    private String sSN ;


    public String getsSN() {
        System.out.println("Someone accessing SSN.");
        return sSN;
    }

    public void setsSN(String sSN) {
        if (sSN.length() == 9 && isNumeric(sSN)){
            this.sSN = sSN;

        } else
            System.out.println("SSN should be numeric and 9 digit long.");
    }

    public boolean isNumeric(String data){
        boolean numeric = true;
        char[] charArray = data.toCharArray();
        for (char letter : charArray) {
            if (!Character.isDigit(letter)) {
                numeric = false;
            }
        }
        return numeric;
    }




    public void setName(String name){

        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setdOB(String dOB){
        this.dOB = dOB;
        System.out.println("human has specefic dob.ex: "+ dOB);
    }
    public String getdOB(){
        return this.dOB;
    }










}

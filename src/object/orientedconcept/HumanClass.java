package object.orientedconcept;

public class HumanClass extends Employee {
    private String HumanName;
    private  String religion;
    private int numOfLegs;
    private String educationLevel;

    public String getHumanName() {
        return HumanName;
    }
    public void setHumanName(String humanName) {
        HumanName = humanName;
        System.out.println("For identity every human has a specefic name like-"+ humanName);
    }
    public String getReligion() {
        return religion;
    }
    public void setReligion(String religion) {
        this.religion = religion;
        System.out.println("Human are following different type religion and best religion is "+religion);
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }
    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
        System.out.println("Every Human has two legs");
    }
    public String getEducationLevel() {
        return educationLevel;
    }
    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
        System.out.println("one of highest education level is "+ educationLevel);

    }
    public void drive(){

        System.out.println("human loved to travel new place");
    }
    public void business(){
        System.out.println("human has different type of business for earning money");
    }
    public void mediCare(){

        System.out.println("medicare is urgent need for human life");
    }


}

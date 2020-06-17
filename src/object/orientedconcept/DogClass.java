package object.orientedconcept;

public class DogClass {
    private   String dogName;
    private int dogAge;
    private String dogColor;

    public String getDogColor() {
        return dogColor;
    }

    public void setDogColor(String dogColor) {
        this.dogColor = dogColor;
    }

    public void setDogName(String dogName){
        this.dogName = dogName;
    }
    public String getDogName(){
        return this.dogName;
    }

    public void setDogAge(int dogAge){
        this.dogAge= dogAge;
    }
    public int getDogAge(){
        return this.dogAge;
    }

}

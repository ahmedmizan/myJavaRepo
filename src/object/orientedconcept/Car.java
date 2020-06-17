package object.orientedconcept;

public class Car {
   private String carName;
   private String color;
   private int price;
   private int numOfDoor;
   private String engineCapacity;
   private String driveMode;

    public String getEngineCapacity() {
        return engineCapacity;
    }
    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
        System.out.println("GLE engine capacity is "+ engineCapacity);
    }


   public void drive(int speed){
       System.out.println("This can can move at speed of " + speed);
   }

   public void activateReverseCam(){
       System.out.println("This car can activate reverse camera.");
   }



    public int getNumOfDoor() {
        return numOfDoor;
    }

    public void setNumOfDoor(int numOfDoor) {
        this.numOfDoor = numOfDoor;
        System.out.println("This Car has "+numOfDoor+" door");
    }

    public String getDriveMode() {
        return driveMode;
    }

    public void setDriveMode(String driveMode) {
        this.driveMode = driveMode;
        System.out.println("GLE has  "+driveMode+ " mode");
    }



  public void setCarName(String carName){
      this.carName= carName;
      System.out.println("my car is mercedez and model is "+ carName);

  }
    public String getCarName(){
      return this.carName;
    }

    public void setColor(String color){
      this.color= color;
        System.out.println("This gle color is "+ color);
    }
    public String getColor(){
      return this.color;
    }
    public void setPrice(){
      this.price=price;
    }
    public int getPrice(){
      return this.price=price;
    }








}


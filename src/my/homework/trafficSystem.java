package my.homework;

/*Create Traffic ticketing system
        1. Speed Limit = 70
        2. Every 5 miles over the speed limit will add 1 point
        3. Round the speed to downward value
        4. If user reaches 12 points then license is suspended
        Example:
        userspeed=78(70-75->1point)
        userspeed=88(70-75->1point,75-80->1point,80-85->1point ; total 3 points)*/


import java.util.Scanner;

public class trafficSystem {
    public static void main(String[] args) {
        dataInput();

    }


        public static void dataInput() {

            int speedLimit = 70;
            Scanner dataInput = new Scanner(System.in);
            System.out.println("please input your actual  speed ");

            int actualSpeed = dataInput.nextInt();
            if (actualSpeed <= speedLimit) {
                System.out.println("your speeding  is standard");
            }
            int ticketCalculation = (actualSpeed - speedLimit) / 5;
            System.out.println("your speed limit was over thats why you lost " + ticketCalculation+" points");
            if (ticketCalculation >= 12) {
                System.out.println("then license will be suspend");
            }
        }

}

package my.homework;

import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        ArrayListHomeWork myList = new ArrayListHomeWork();
        boolean quit =true;
        myList.printingInstruction();

        do{
            Scanner scanner=new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    myList.printingInstruction();
                    break;
                case 1:
                    myList.printGroceryList();
                    break;
                case 2:
                    System.out.println("please enter your item");
                    String item = scanner.next();
                    myList.addGroceryList(item);
                    break;
                case 3:
                    System.out.println("please enter your existing item");
                    String existingItem = scanner.next();
                    System.out.println("please enter your new item");
                    String newItem = scanner.next();
                    myList.modifyList(existingItem, newItem);
                    break;
                case 4:
                    System.out.println("please write to remove item name");
                    String removeItem = scanner.next();
                    myList.removeItem(removeItem);
                    break;
                case 5:
                    System.out.println("please enter which item you are searching");
                    String searchItem = scanner.next();
                    myList.findItem(searchItem);
                    break;
                case 6:
                    quit = false;
                    break;
            }
        } while (quit);


    }
}

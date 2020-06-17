package my.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListHomeWork {
/*
1. Grocery Management App

1. When user runs the app for first time, prompt user with below messages.

Press
0 - To print choice options.
1 - To print the list of grocery items.
2 - To add an item to the list.
3 - To modify an item in the list.
4 - To remove an item from the list.
5 - To search for an item in the list.
6 - To quit the application.
Enter your choice:

2. Based on the choice user makes, app should perform actions accordingly
3. By pressing 0 option key should display the the choice menu
4. By pressing 1 option key should display list of grocery items
5. By pressing 2 option key should prompt user to enter item to the list
6. By pressing 3 option key should prompt user to insert item number and modify that item attached to that number
7. By pressing 4 option key should prompt user to insert item number and remove that item attached to that number
8. By pressing 5 option key should prompt user to enter the item that would like
to search and if result should come back as true if the item is found or false if it doesn't exists
6. By pressing 6 option key should quit the app

 */



        ArrayList<String> groceryList = new ArrayList<String>();

        public void addGroceryList(String item){
           groceryList.add(item);
            System.out.println( item+" has been added in your Cart.");
        }


     public void printGroceryList(){
         System.out.println("your items are  " + groceryList);
    }

    public void modifyList(String existingItem, String newIteam){
         int position = groceryList.indexOf(existingItem);
         groceryList.set(position,newIteam);
        System.out.println(newIteam +" has added in your Cart");
    }

    public void removeItem(String product ){
         groceryList.remove(product);
        System.out.println(product+" has been removed from your cart");
    }

    public void findItem(String searchItem){
        boolean lookingItem = groceryList.contains(searchItem);
        if (lookingItem){
        System.out.println(searchItem + " is available in your cart");
    }else
            System.out.println(searchItem + " is not available in your cart");

    }

    public void printingInstruction(){
        System.out.println("Press ");
        System.out.println("0-To print the choice option");
        System.out.println("1-To print the list of grocery items");
        System.out.println("2-To add item in the list");
        System.out.println("3-To modify an item in the list");
        System.out.println("4-To remove an item from the list");
        System.out.println("5-To Search an item in the list");
        System.out.println("6-To quit from the apps");
    }








    }



package com.mizan.part1;
/**
 * Create a restaurant class with name, guestCapacity, guestCount
 * 1. Create a method that tells user if the seats are available
 * 2. Create a method that seatsParty
 * 3. Create a method that removesParty
 * 4. Create a method that allows host open for services by passing restaurant name & guestCapacity
 * 5. Create a method that printsRestaurantSummary
 */

public class RestaurantClass {

   String restaurantName;
   int guestCapacity;
   int guestCount=0;


   public RestaurantClass(String restaurantName, int guestCapacity) {
       this.restaurantName = restaurantName;
       this.guestCapacity = guestCapacity;
   }

   public void vacantSeatCount(){
       System.out.println(( guestCapacity - guestCount) + " seats are available");
   }

   public void seatsParty(int newGuest){
       if ((guestCapacity - guestCount)>newGuest){
           System.out.println("we can arrange seats for " + newGuest + " guest");
           guestCount = guestCount + newGuest;
       }else {
           System.out.println("we cant arrange");
       }
   }
   public void removeParty (int leftGuest){
      guestCount= guestCount- leftGuest;
       System.out.println(" total "+leftGuest+" guest left");
   }


   public void restaurantSummary(){
       System.out.println("This restaurant name is " +restaurantName+ "total guest capacity is "+ guestCapacity);
       System.out.println(" and now available seats are "+ (guestCapacity-guestCount));
       System.out.println("Present Guest count "+ guestCount);
   }












}

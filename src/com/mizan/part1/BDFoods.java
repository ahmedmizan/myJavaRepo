package com.mizan.part1;

public class BDFoods {
    public static void main(String[] args) {
        RestaurantClass restaurant = new RestaurantClass("BD Foods", 50);
        restaurant.restaurantSummary();
        restaurant.seatsParty(25);//
        restaurant.seatsParty(5);
        restaurant.removeParty(10);
        restaurant.seatsParty(10);//
        restaurant.restaurantSummary();
        restaurant.seatsParty(40);
        restaurant.restaurantSummary();

    }
}

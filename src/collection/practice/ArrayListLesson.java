package collection.practice;

import java.util.ArrayList;

public class ArrayListLesson {
    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Mizan");
//        names.add("Murad");
//        names.add("Rubel");
//        System.out.println(names);
//        System.out.println(names.isEmpty());
//        System.out.println(names.size());
//        System.out.println(names.contains("Mizan"));
//        System.out.println(names.get(1));
//        System.out.println(names.indexOf("Rubel"));
//        System.out.println(names.remove("Murad"));
//        System.out.println(names);
//        names.clear();
//        System.out.println(names);
//        names.add("Tahir");
//        System.out.println(names);
      System.out.println();

      ArrayList<String > cities = new ArrayList<>();
      cities.add("NY");
      cities.add("NJ");
      cities.add("MD");
      cities.add("CA");
        System.out.println(cities);
        System.out.println(cities.isEmpty());
        System.out.println(cities.size());
        System.out.println(cities.contains("NY"));
        System.out.println(cities.contains("PA"));
        System.out.println(cities.get(1));
        cities.add("VA");
        System.out.println(cities);
        System.out.println(cities.indexOf("NY"));
        cities.remove("NJ");
        System.out.println(cities);


    }
}

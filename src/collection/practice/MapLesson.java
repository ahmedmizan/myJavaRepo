package collection.practice;

import java.util.HashMap;
import java.util.Map;

public class MapLesson {

    // Map does mapping btwn key and value
    // Name : Murad Jamil
    // marks: 90     80

    public static void main(String[] args) {
        Map<String, Integer> resultSheet = new HashMap<>();

        resultSheet.put("Murad", 90);
        resultSheet.put("Tahir", 80);
        resultSheet.put("Jamil", 75);
        System.out.println(resultSheet);
//        resultSheet.remove("Murad");
//        System.out.println(resultSheet);
//        int markOfJamil=resultSheet.get("Jamil");
//        System.out.println(markOfJamil);
//        System.out.println(resultSheet.get("Jamil"));
      Map<String,Integer> priceSheet=new HashMap<>();
      priceSheet.put("Apple",10);
      priceSheet.put("Orange", 5);
      priceSheet.put("Banana", 5);
      for (Map.Entry entry: priceSheet.entrySet()){
          System.out.println("Product name "+entry.getKey()+" and total price $"+entry.getValue());
      }



//        for (Map.Entry entry : resultSheet.entrySet()){
////            System.out.println("Student name " + entry.getKey() + " got " + entry.getValue() + " marks.");
//            Integer marks = (Integer) entry.getValue();  // Example of casting
//            if(marks >= 80){
//                System.out.println("Student name " + entry.getKey() + " got " + entry.getValue() + " marks.");
//            }
//        }


    }

}

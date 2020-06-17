package my.homework;

import java.util.Arrays;

public class ReverseStringHomeWork {
    /* Write code to create abbreviation for any given string
         * Example: String msg = "Outfit of the day" //
         * Expected Outp : OOTD //GM HAGDTY.
           Another example
         * String msg = "have a great day to you"
         * Expected Outp : HAGDTY
         * /

  /**
         * reverse a string
         */
       /* String message = "happy holidays";
       //Output should be like > syadiloh yppah*/

    public static void main(String[] args) {

//        using loop
//        String greetings ="Happy Holidays";
//        int len = greetings.length();
//        String rev ="";
//        for (int i=len-1; i>=0; i--){
//            rev = rev + greetings.charAt(i);
//        }
//        System.out.println(rev);
//
////        using StringBuffer class:
//        StringBuffer sf = new StringBuffer(greetings);
//        System.out.println(sf.reverse());



        String msg = "Outfit of the day";
        String parts[]=msg.split(" ");
        System.out.println(Arrays.asList(parts));
        String abbreviation ="";
        for (int i = 0; i<parts.length; i++){
            abbreviation = abbreviation + parts[i].charAt(0);
        }
        System.out.println(abbreviation.toUpperCase());
















    }
}

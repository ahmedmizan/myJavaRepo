package com.mizan.part1;

public class StringPractice {
    public static void main(String[] args) {


        // String learning

        String myName = "My name is Mizan";
        char myLetter = myName.charAt(6);
        char abc  = myName.charAt(5);
        System.out.println(myName.charAt(5));

//        char myLetter = myName.charAt(3);
//        char abc  = myName.charAt(13);
//        System.out.println(myName.charAt(14));


        String myAdress = "PersonBlvd ";
        String myAdres = "personBlvd ";
//        myAdress.concat(myName);
        System.out.println(myName.concat(myAdres));
        System.out.println(myName.concat(" and my adress is " + myAdres));

//        String newAdress = myAdress.concat(myName);

//        System.out.println(newAdress);
//        boolean isEqual = myAdres.equals(myAdress);
//        System.out.println(isEqual);

//        boolean isContain = myName.contains(myAdres);
//        System.out.println(isContain);

//        boolean isAddEqual = myAdres.equalsIgnoreCase(myAdres);
//        System.out.println(isAddEqual);

//        int lengthOfString = myName.length();
//        System.out.println(lengthOfString);

//        boolean isMyNameEmpty = myName.isEmpty();
//        System.out.println(isMyNameEmpty);

//        String replace= myName.replace('M', 'R');
//        System.out.println(replace);
//
//        String daughterName = "Manha";
//        System.out.println(daughterName);
//            String myFood = "I Love Pizza";
//            char myWord = myFood.charAt(5);
//            System.out.println(myWord);
//        System.out.println(myWord);
//        String MyStore = "Domenaz";
//        myFood.concat("Dominez");
//        System.out.println(myFood.concat(MyStore));
//        String mySelf = "I am a good programmer";

//        char aboutMe = mySelf.charAt(10);
//        System.out.println(aboutMe);

//        int length = mySelf.length();
//        System.out.println(length);

//        boolean amIAGoodProgrammer = true;
//        System.out.println(amIAGoodProgrammer);

//        boolean isMySelfEmpty = mySelf.isEmpty() ;
//        System.out.println(isMySelfEmpty);

//        System.out.println("48 ".concat( myFood));

//        myFood = myName.concat(mySelf);
//        System.out.println("50 " + myFood);

//        int totalLength = mySelf.length();
//        System.out.println(totalLength);

//        String upperCase = mySelf.toUpperCase();
//        System.out.println(upperCase);

//        String lowerCase = mySelf.toLowerCase();
//        System.out.println(lowerCase);

        String myQuality = "   i am a good Programmer   ";
//        String myName ="my name is Mizan";
//        char mySelf = myQuality.charAt(5);
//        System.out.println(myQuality.charAt(5));
//        int lengthOfString= myQuality.length();
//        System.out.println(lengthOfString);
       String beginIndex =myQuality.substring(11);
        System.out.println(beginIndex);
//        int endIndex = myQuality.substring();
//        boolean isContain=myQuality.contains("not Good");
//        System.out.println(isContain);



//     1    char charAt(int index) returns char value for the particular index
//     2  int length()   returns string length
//     3  String substring(int beginIndex)   returns substring for given begin index.
//     4  String substring(int beginIndex, int endIndex) returns substring for given begin index and end index.
//     5  boolean contains(CharSequence s)   returns true or false after matching the sequence of char value.
//     6  boolean equals(String another) checks the equality of string with the given object.
//     7  boolean isEmpty()  checks if string is empty.
//        boolean isEmpty = myQuality.isEmpty();
//        System.out.println(isEmpty);
//     8  String concat(String str)  concatenates the specified string.
//     9  String replace(char old, char new) replaces all occurrences of the specified char value.
//     10 String replace(CharSequence old, CharSequence new) replaces all occurrences of the specified CharSequence.
//    11 boolean equalsIgnoreCase(String another)   compares another string. It doesn't check case.
//    12 String[] split(String regex)   returns a split string matching regex. eg. words=s1.split("\\s");//splits the string based on whitespace
//    13 String toLowerCase()   returns a string in lowercase.
//        String lowerCase = myQuality.toLowerCase();
//        System.out.println(lowerCase);
//    14 String toUpperCase()   returns a string in uppercase.
//        String upperCase= myQuality.toUpperCase();
//        System.out.println(upperCase);
//    15 String trim()  removes beginning and ending spaces of this string.


    }


}

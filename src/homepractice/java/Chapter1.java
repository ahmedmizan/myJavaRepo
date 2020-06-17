package homepractice.java;

public class Chapter1 {
    public static void main(String[] args) {
        String myString = "I am a student of MC College";
        System.out.println(myString);
//        Concat multiple string
        String concatString = myString +" " +"anotherString";
        String concateString = myString.concat("anotherString");
        System.out.println(concateString);
//        used carAt method to find the value at specific index from the string
        char findIndex = myString.charAt(8);
        System.out.println("The 9th index of my String is  "+ findIndex);
//        used toUpperCase method to convert string value to all upperCase
        String stateName = "new york";
        String upperCaseState = stateName.toUpperCase();
//        Trim the String
        String myTrimString = " My Name is Mizan ";
        System.out.println("String before triming:"+myTrimString);
        String trimmedString = myTrimString.trim();
        System.out.println("String after triming:"+trimmedString);
//       Finding the length of string
        int stringLength = myString.length();
        System.out.println("My String Length:"+ stringLength);
//        use contain method to find out if string contains specific value
        boolean isContain = myString.contains("student");
        System.out.println("is contain is:"+isContain);
//      Use Empty method to find out if string empty or not
        boolean isMyStringEmpty = myString.isEmpty();
        System.out.println("Is my string empty:"+isMyStringEmpty);
//        Null value string
        String nullString = null;
        System.out.println("String is:"+nullString);













//        String aboutMe = "I am a good programmer.";
//        String institution ="I am studying myself";
//        1   char charAt(int index) returns char value for the particular index
//        char myChar= aboutMe.charAt(5);
//        char abc =aboutMe.charAt(10);
//        System.out.println(aboutMe.charAt(10));
//
//        2  int length()   returns string length
//        int lengthOfString=aboutMe.length();
//        System.out.println(aboutMe.length());
//
//        3  String substring(int beginIndex)   returns substring for given begin index.
//        String beginIndex = (aboutMe.substring(5));
//        System.out.println(beginIndex);
//        4  String substring(int beginIndex, int endIndex) returns substring for given begin index and end index.
//        String myIndex= aboutMe.substring(5,11);
//        System.out.println(myIndex);
//        15 String trim()  removes beginning and ending spaces of this string.
//        String myTrimString ="  i am good programmer  ";
//        System.out.println("String before triming: "+myTrimString);
//        String trimmedString = myTrimString.trim();
//        System.out.println("String after triming: "+ trimmedString);


    }
}

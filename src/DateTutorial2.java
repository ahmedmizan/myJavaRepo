import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTutorial2 {
    public static void main(String[] args) throws ParseException {
//        1.java Date Example
//        Instance of Date Object
//        Date todayDate = new Date();
//        System.out.println(todayDate);

//     Example 1.1- Convert Date to String.
//        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
//        String date = sdf.format(todayDate);
//        Print current date in specified sdf format;
//        System.out.println(date);
//        SimpleDateFormat newDateFormater =new SimpleDateFormat("EEE-MMM-yy");
//        String formatedDate = newDateFormater.format(todayDate);
//        System.out.println(formatedDate);
//        SimpleDateFormat newDateFormater1=new SimpleDateFormat("EEE-MM-yy");
//        String formatedDated1=newDateFormater1.format(todayDate);
//        System.out.println(formatedDated1);

        // "05-11-20" is it Ramadan or Eid day
        SimpleDateFormat formater = new SimpleDateFormat("MM-dd-yyyy");
        String givenDate = "05-11-2020";
        Date expectedDate = formater.parse(givenDate);
//        "Fri, June 7 2013"
//        SimpleDateFormat formater1 = new SimpleDateFormat("EEE, MMM dd yyyy");
//        String providedDate = "Fri, June 7 2013";
//        Date lookingDate = formater1.parse(providedDate);
//        System.out.println(lookingDate);
//
//        SimpleDateFormat newFormater1=new SimpleDateFormat("MM-dd-yy");
//        String providedDate1 =newFormater1.format(lookingDate);
//        System.out.println(providedDate1);


//        System.out.println(expectedDate);
        // Use of Calender


        Calendar cal = Calendar.getInstance();
//       Date today = cal.getTime();
       Date today=cal.getTime();
        System.out.println(today);

         cal.add(Calendar.DATE, 1);
        Date tomorrow = cal.getTime();
        System.out.println(tomorrow);

        cal.add(Calendar.DAY_OF_MONTH, 10);




//        Date eidDay = cal.getTime();
//        System.out.println(eidDay);
//
//        if(expectedDate == eidDay){
//            System.out.println("It is Eid day");
//        } else
//            System.out.println("Nop you need to wait.");




//        Example 1.1 -Convert String to Date.
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
//        String dateInString="31-08-2016 10:20:56";
//        Date date = sdf.parse(dateInString);
//        Example 2.1- Get current date time using calender
//        SimpleDateFormat sdf = new SimpleDateFormat("yyy MM dd hh:mm:ss");
//        String currentTime= sdf.format(Calendar.getInstance().getTime());
//        System.out.println(currentTime);

//        Simple Calender example
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd HH:mm:ss");

        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println(year);
        int month =Calendar.getInstance().get(Calendar.MONTH);
        System.out.println(month);
        int dayOfMonth= Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        System.out.println("Day of month is "+dayOfMonth);
        int dayOfWeek= Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        System.out.println("Day of this week is "+dayOfWeek);
        int weekOfYear=Calendar.getInstance().get(Calendar.WEEK_OF_YEAR);

        int weekOfMonth=Calendar.getInstance().get(Calendar.WEEK_OF_MONTH);
        int hour = Calendar.getInstance().get(Calendar.HOUR);  //12 hour clock
        int hourOfDay=Calendar.getInstance().get(Calendar.HOUR_OF_DAY); //24 hour clock
        int minute =Calendar.getInstance().get(Calendar.MINUTE);
        int second =Calendar.getInstance().get(Calendar.SECOND);

        int milliSecond= Calendar.getInstance().get(Calendar.MILLISECOND);
        System.out.println("Right now second "+second+" and milliSecond is "
                + milliSecond);
//
//        System.out.println(sdf.format(Calendar.getInstance().getTime()));
//        System.out.println("year \t\t:"+year);
//        System.out.println("month\t\t:"+ month);
//        System.out.println("dayOfMonth\t\t"+dayOfMonth);
//        System.out.println("dayOfWeek\t\t"+dayOfWeek);




















    }






















}

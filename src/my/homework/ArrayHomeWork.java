package my.homework;
/**
 * Create a method to find average of an int-array
 * int[] numbers = {4, 7,9,10};
 * Find Average of above array
 */
/**
 * Create a method to find maximum value in the given int-array
 * int[] numbers = {45, 22, 11, 65, 189, 91, 100, 81};
 *
 * Maximum value in the given array: 189
 */
/**
 * Create a method that will tell the name of student with maximum marks/score.
 * int[] scores = {90, 89, 191, 100, 81};
 * String[] names = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};
 *
 * Ans -> Jesse scored the maximum score(191)
 */

public class ArrayHomeWork {
    public static void main(String[] args) {
        int[] numbers = new int[]{4, 7, 9, 10};
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
//            total=total+numbers
        }

//        System.out.println(total / numbers.length);

        int[] count = {45, 22, 11, 65, 189, 91, 100, 81};
        int max =count[0];
        for (int j = 0; j < count.length; j++){

            if (count[j] >= max) {
                max = count[j];
            }

        }
        System.out.println("Maximum value in the given array: "+max);


        int[] scores = {90, 89, 191, 100, 81};
     String[] names = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};


        int maxi = scores[0]; //191

        for (int j = 0; j <scores.length; j++){
            if (scores[j] > maxi) {
                maxi = scores[j];
            }

        }

        for(int k = 0; k<names.length; k++){

            System.out.println(names[k]);
        }

        System.out.println( names[2]     + "got the  Maximum marks among the list: "+maxi);








    }

}

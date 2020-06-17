package collection.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetLesson {
    public static void main(String[] args) {
        List<Integer> marksList = new ArrayList<>();
        marksList.add(50);
        marksList.add(60);
        marksList.add(60);
        System.out.println(marksList);

        Set<Integer> marks = new HashSet<>(marksList);
        System.out.println(marks);
//        marks.add(80);
//        marks.add(85);
//        marks.add(90);
//        marks.add(80);
//
//        System.out.println(marks);


        // int --> Integer
         // boolean --> Boolean
        // double --> Double
    }
}

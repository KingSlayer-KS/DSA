package Basic_stuff;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 99;
        marks[1] = 98;
        marks[2] = 95;

        // printing the array made
        System.out.println(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        // length of array
        System.out.println(marks.length);

        // sort array
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        // array assignment
        int[] mark = { 99, 98, 58 };
        System.out.println(mark);

        // 2D array
        int[][] finale_marks = { { 96, 69, 99 }, { 58, 99, 98 } };
        System.out.println(finale_marks[0][0]);
        System.out.println(finale_marks[0][1]);
        System.out.println(finale_marks[0][2]);
        System.out.println(finale_marks[1][0]);
        System.out.println(finale_marks[1][1]);
        System.out.println(finale_marks[1][2]);
    }

}

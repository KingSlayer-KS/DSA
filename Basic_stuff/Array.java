package Basic_stuff;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        /*
         * Syntax: type[] arrayname=new type[size];
         * OR
         * Syntax: type arrayname []=new type[size];
         * indexing from zero
         */
        int[] marks = new int[3];
        marks[0] = 99;// phy
        marks[1] = 98;// mat
        marks[2] = 95;// chem

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

        // array assignment alternative hwen we alredy know the size
        int[] mark = { 99, 98, 58 };
        System.out.println(mark);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[3];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
        sc.close(); 
    }

}

package Basic_stuff;

import java.util.*;

public class Two_D_Array {
    public static void main(String[] args) {

        // 2D array
        // syntax: int[][] name = new int[rows][columns];
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();

        int[][] nam = new int[rows][col];

        // for rows
        for (int i = 0; i < rows; i++) {
            // for columns
            for (int j = 0; j < rows; j++) {
                nam[i][j] = sc.nextInt();

            }
        }

        System.out.println();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(nam[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int[][] finale_marks = { { 96, 69, 99 }, { 58, 99, 98 } };
        System.out.println(finale_marks[0][0]);
        System.out.println(finale_marks[0][1]);
        System.out.println(finale_marks[0][2]);
        System.out.println(finale_marks[1][0]);
        System.out.println(finale_marks[1][1]);
        System.out.println(finale_marks[1][2]);

        sc.close();

    }

}

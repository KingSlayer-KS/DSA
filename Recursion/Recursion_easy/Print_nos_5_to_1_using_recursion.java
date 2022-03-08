package Recursion.Recursion_easy;

public class Print_nos_5_to_1_using_recursion {
    public static void number(int n) {
        if (n == 0) {
            return;
        }//base_case

        System.out.println(n);
        number(--n);
        /*
         * if (n >= 2) {
         * n--;
         * number(n);
         * }
         */
    }

    public static void main(String[] args) {
        int n = 5;
        number(n);
    }
}

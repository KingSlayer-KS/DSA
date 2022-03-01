package Recursion;

public class Print_nos_1_to_5_using_recursion {
    public static void number(int n) {
        if (n == 5) {
            return;
        }//base_case

        System.out.println(n);
        number(n);

    }

    public static void main(String[] args) {
        int n = 0;
        number(n);
    }
}

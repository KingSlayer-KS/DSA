package Basic_stuff;

import java.util.Scanner;

public class method_functions {

    public static void print_java(/** arguments go here along with its type it can also be null */
    ) {
        System.out.print("Hello java");

    }

    public static void mera_naam(String name) {
        System.out.print(name);
    }

    public static void add_kro(int a, int b) {
        System.out.print((int) a + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kk = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        add_kro(kk, k);
    }
}

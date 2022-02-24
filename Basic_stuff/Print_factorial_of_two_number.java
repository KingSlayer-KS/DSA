package Basic_stuff;

import java.util.Scanner;

public class Print_factorial_of_two_number {
    public static void FactorialOfTwoNumbers(int a, int fac) {

        if (a >= 0 && a != 0) {
            for (int i = 1; i <= a; i++) {
                fac = fac * (i);
            }
            System.out.printf("Factorial of number " + a + " is: " + fac);
        } else if (a == 0) {
            fac = 1;
            System.out.printf("Factorial of number " + a + " is: " + fac);
        } else if (a < 0) {
            System.out.println("Invalid Number bro");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fac = 1;

        FactorialOfTwoNumbers(a, fac);// calling he function

        sc.close();

    }

}

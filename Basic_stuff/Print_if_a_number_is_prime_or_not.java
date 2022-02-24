package Basic_stuff;

import java.util.Scanner;

public class Print_if_a_number_is_prime_or_not {
    public static Boolean Prime_checker(int a) {
        boolean p = true;
        if (a == 1) {
            p = false;
        }

        else if (a > 1) {
            for (int i = 2; i < a; i++) {
                if (a % i == 0  ) {
                    p = false;
                    break;

                }

            }
        }

        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        if (Prime_checker(a)) {
            System.out.println(a + " is a prime");
        } else {
            System.out.println(a + " is not a prime");
        }

    }

}

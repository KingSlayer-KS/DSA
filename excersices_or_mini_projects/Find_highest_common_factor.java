package excersices_or_mini_projects;

import java.util.*;

public class Find_highest_common_factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(),
                y = sc.nextInt(),
                HCF = 1;

        if (x == y) {
            HCF = x;
        } else if (x > y) {
            if (x % y == 0) {
                HCF = x / y;
            }

        } else if (y > x) {
            if (y % x == 0) {
                HCF = y / x;
            }
        }
        sc.close();
        System.out.println(HCF);
    }
}

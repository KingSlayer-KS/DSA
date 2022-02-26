package excersices_or_mini_projects;

import java.util.*;

public class Taking_input_until_user_stops_and_counts_integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zeros = 0;
        int positive = 0;
        int negative = 0;
        int cont;
        do {
            long num = sc.nextLong();

            if (num < 0) {
                negative++;
            }
            else if (num > 0) {
                positive++;
            }
            else {
                zeros++;
            }
            System.out.println("do u want to continue?(1/0)\n1=YES\n0=No");
            cont = sc.nextInt();

        }while (cont==1);

        System.out.println("total " + zeros + " ZEROS");
        System.out.println("total " + positive + " POSITIVES");
        System.out.println("total " + negative + " NEGATIVES");
        sc.close();

    }

}

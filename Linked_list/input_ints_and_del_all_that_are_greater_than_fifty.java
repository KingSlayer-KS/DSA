package Linked_list;

import java.util.LinkedList;
import java.util.Scanner;

public class input_ints_and_del_all_that_are_greater_than_fifty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> lls = new LinkedList<>();
        while (sc.hasNextInt()) {
            int k=sc.nextInt();
            if (k < 25) {
                lls.add(k);
            }
            
        }

        System.out.println(lls);
        System.out.println();

        
        sc.close();

    }
}

package Recursion.Recursion_advance;

import java.util.ArrayList;

public class Print_all_subset_of_first_n_natural_numbers {
    public static void print_arryList(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {

            System.out.print(subset.get(i));
            

        }
        System.out.println();

    }

    public static void subset_natural_nos(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            print_arryList(subset);
            return;
        }
        // adding_to_subset
        subset.add(n);
        subset_natural_nos(n - 1, subset);

        // removing_from_subset
        subset.remove(subset.size() - 1);
        subset_natural_nos(n - 1, subset);

    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        subset_natural_nos(n, subset);

    }
}

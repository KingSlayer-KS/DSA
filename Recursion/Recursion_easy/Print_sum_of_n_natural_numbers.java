package Recursion.Recursion_easy;

public class Print_sum_of_n_natural_numbers {
    public static void sum_number(int n, int sum, int i) {
        sum += i;

        if (n == 0) {
            System.out.println(sum);
            return;
        }
        // sum += i;
        sum_number(--n, sum, i + 1);

    }

    public static void main(String[] args) {
        int n = 5, i = 0;

        sum_number(n, 0, i);
    }
}

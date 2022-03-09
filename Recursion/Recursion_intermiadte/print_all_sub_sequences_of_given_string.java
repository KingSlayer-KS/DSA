package Recursion.Recursion_intermiadte;

import java.util.HashSet;

public class print_all_sub_sequences_of_given_string {
    public static void subsequence(String aa, int i, String N_str, HashSet<String> N_st) {
        if (i == aa.length()) {
            if (N_st.contains(N_str)) {
                return;
            } else {
                System.out.println(N_str);
                N_st.add(N_str);
                return;
            }
        }
        char ss = aa.charAt(i);
        subsequence(aa, i + 1, N_str + ss, N_st);
        subsequence(aa, i + 1, N_str, N_st);

    }

    public static void main(String[] args) {
        String aa = "aa";
        HashSet<String> a3 = new HashSet<>();
        int i = 0;
        subsequence(aa, i, "", a3);

    }
}

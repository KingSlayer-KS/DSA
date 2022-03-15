package Recursion.Recursion_advance;
//O(n!)-->big O of (n)factorial == time complixety
public class print_possible_permutations {
    public static void perms(String str, String per) {
        if (str.length() == 0) {
            System.out.println(per);
            return;

        }
        for (int i = 0; i < str.length(); i++) {
            char Fixating_string = str.charAt(i);

            String getting_perms = str.substring(0, i) + str.substring(i + 1);
            perms(getting_perms, per + Fixating_string);

        }
    }

    public static void main(String[] args) {
        String str = "abc";
        perms(str, "");

    }

}

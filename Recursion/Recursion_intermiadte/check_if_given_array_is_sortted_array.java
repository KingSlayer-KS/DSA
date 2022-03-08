package Recursion.Recursion_intermiadte;

public class check_if_given_array_is_sortted_array {
    public static void sorts(int[] aa, int i) {
        if (i == aa.length) {
            System.out.println("Yes");
            return;
        }
        if(aa[i-1]>aa[i] ){
            System.out.println("NO");
            return;
        }
        sorts(aa, i+1);
    }

    public static void main(String[] args) {
        int[] aa = { 1, 2, 4, 5, 5,5, 6, 7 };
        sorts(aa, 1);
    }

}

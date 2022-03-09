package Recursion.Recursion_intermiadte;

public class move_all_the_x_to_the_end {
    public static String aaa = "";
    public static int count;

    public static void x_addition(int count, String aaa, int j) {
        if (j == count) {
            System.out.println(aaa);
            return;
        }
        aaa+="x";
        x_addition(count,aaa,j+1);

    }

    public static void x_reallocation(String aa, int i) {
        if (i == aa.length()) {
            int j=0;
            x_addition(count, aaa, j);
            return ;
        }
        if (aa.charAt(i) != 'x') {
            aaa += aa.charAt(i);
        } else {
            count = count + 1;
        }
        x_reallocation(aa, i + 1);


    }

    public static void main(String[] args) {
        String aa = "axbcxxd";
        int i = 0;
        x_reallocation(aa,i);
        
    }

}

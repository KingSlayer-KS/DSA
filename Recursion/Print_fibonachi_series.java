package Recursion;

public class Print_fibonachi_series {
    public static void fibonacchi(int n0, int n1, int tot) {

        if (tot <= 0) {
            return;
        }
        int n3 = n0 + n1;
        System.out.print(n3+" ");
        fibonacchi(n1, n3, --tot);

    }

    public static void main(String[] args) {

        int n0 = 0, n1 = 1, tot = 7;
        System.out.print(n0+" "+n1+" ");
        fibonacchi(n0, n1, tot - 2);

    }

}

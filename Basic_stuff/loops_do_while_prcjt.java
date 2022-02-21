package Basic_stuff;


import java.util.Scanner;

public class loops_do_while_prcjt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int o = 0;

        do {
            System.out.println("number dal be");
            o = sc.nextInt();
            System.out.println("yeh le tera number: " + o);

        } while (o >= 0);

        System.out.println("Aur dalo negative number hogi ab end of story");

        sc.close();
    }

}

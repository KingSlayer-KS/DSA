package Basic_stuff;

import java.util.Scanner;

//task is to genrate random number then get user input to see is it matches the genrated number or not
public class mini_project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kk = (int) (Math.random() * 100);
        int in = 0;
        do {
            System.out.println("number guess kro be: ");
            in = sc.nextInt();

            if (in < 0) {
                break;
            } else if (kk == in) {
                System.out.println("yes u guessed it right");
                break;
            } else if (kk > in) {
                System.out.println("bro its bigger than u guessed urs is samaller");
            } else {
                System.out.println("bro its samaller than u guessed urs is bigger");
            }

        } while (0 <= in);
        System.out.println("the random numner genrated is \n[DRUM ROLL....]\n: " + kk);
        sc.close();
    }

}

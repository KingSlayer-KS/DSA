package Basic_stuff;


import java.util.Scanner;

public class Conditonal_stmt_project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price_notebook = 40;
        int price_pen = 10;

        System.out.println("kitna paisa hai tere pass");
        int money = sc.nextInt();

        if (money >= (price_notebook + price_pen)) {
            System.out.println("you can buy both");
        } else if (money == price_notebook) {
            System.out.println("you can buy only one either pen or notebook");
        } else if (money >= price_pen && money < price_notebook) {
            System.out.println("you can buy only pen");
        } else {
            System.out.println("u can buy nothing");
        }

        sc.close();
    }
}

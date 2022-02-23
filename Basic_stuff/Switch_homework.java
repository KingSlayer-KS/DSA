package Basic_stuff;

import java.util.Scanner;

public class Switch_homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        switch (c) {
            case 1:
                System.out.println(a + b);
                break;// add

            case 2:
                System.out.println(a - b);
                break;// minus

            case 3:
                System.out.println(a * b);
                break;// multiply

            case 4:
                System.out.println(a / b);
                break;// divide

            case 5:
                System.out.println(a % b);
                break;// mod

            default:
                System.out.println("Invalid_opperation");
                sc.close();
        }
    }

}

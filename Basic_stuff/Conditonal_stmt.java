package Basic_stuff;


import java.util.Scanner;

public class Conditonal_stmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Umar dal be");
        int umr = sc.nextInt();
        if (umr > 18)
            System.out.println("voter id banva te vote dal");
        else
            System.out.println("thand rakh kake hale bacha e tu");

        // logical and (&&) both conditoins are true
        int age = sc.nextInt();
        boolean character = sc.hasNextBoolean();
        if (age > 25 && character)
            System.out.println("promotion granted");
        else if (age < 25 && character)
            System.out.println("can be concidered for promotion ");
        else
            System.out.println("promotion revoked");

        // logical or (||) one of the two conditions satifies
        int marks = sc.nextInt();
        boolean is_good_manager = sc.hasNextBoolean();
        if (marks >= 80 || is_good_manager)
            System.out.println("promotion granted");
        else
            System.out.println("promotion revoked");

        sc.close();

    }

}

package Basic_stuff;

import java.util.Scanner;

public class Taking_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Age dal be:");
        int age = sc.nextInt();

        System.out.println("Umar dal be:");
        Float umar = sc.nextFloat();

        System.out.println("Naam dal be:");
        String nam = sc.next();

        System.out.println("line dal be:");
        String line = sc.nextLine();

        sc.close();

        System.out.println(age);
        System.out.println(umar);
        System.out.println(nam);
        System.out.println(line);
    }
}

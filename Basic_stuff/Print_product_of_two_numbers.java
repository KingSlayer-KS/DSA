package Basic_stuff;

import java.util.Scanner;

public class Print_product_of_two_numbers {
    public static int ProductOfTwoNumbers(int a,int b){
        return(a*b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Product of two number is: "+ProductOfTwoNumbers(a,b));//calling he function

        sc.close();
        
    }
    
}

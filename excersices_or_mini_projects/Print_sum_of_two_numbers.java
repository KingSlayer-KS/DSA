package excersices_or_mini_projects;

import java.util.Scanner;

public class Print_sum_of_two_numbers {
    public static int SumOfTwoNumbers(int a,int b){
        return(a+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Sum of two number is: "+SumOfTwoNumbers(a,b));//calling he function

        sc.close();
        
    }
    
}

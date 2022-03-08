package Recursion.Recursion_easy;

public class Print_factorial_of_n_number_alternate {
    public static Integer factorial(int n){
        
        if(n  == 0 || n  == 1){
            return 1;
        }
        int g=factorial(n-1);
        int fact=n*g;
        return fact;
        


    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(factorial(n));


    }
    
}

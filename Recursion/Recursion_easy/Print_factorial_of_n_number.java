package Recursion.Recursion_easy;

public class Print_factorial_of_n_number {
    public static void factorial(int n,int fact){
        
        if(n  == 0){
            System.out.println(fact);
            return;}
        else if(n  == 1){
            System.out.println(fact);
            return;
        }
         fact=fact*n;
        factorial(n-1,fact);


    }
    public static void main(String[] args) {
        int n=5;
        factorial(n,1);


    }
    
}

package Recursion.Recursion_easy;

public class print_x_to_power_n_using_recusrion_another_alternate {

    public static int to_power(int n,int x){
        if(n==0){

            return 1;
        }
       int  x_=to_power(n-1,x);
       System.out.println(x_);
        
        return x*x_;

        

    }
    public static void main(String[] args) {
        int n=5,x=2;
        System.out.println (to_power(n,x));
    }   

}

package Recursion.Recursion_easy;

public class print_x_to_power_n_using_recusrion {

    public static void to_power(int n,int x,int pow){
        if(n==0){
            System.out.println(pow);
            return;
        }
        pow = pow*x;
        to_power(n-1,x,pow);
        

    }
    public static void main(String[] args) {
        int n=4,x=5;
        to_power(n,x,1);
    }   

}

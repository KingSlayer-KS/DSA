package Recursion;
//log n time complexity
public class print_x_to_power_n_using_recusrion_alternate {

    public static int to_power(int n,int x){
        if(n==0){;
            return 1;
        }
        if(n%2==0){
            return to_power(n/2,x)*to_power(n/2,x);
        }
        else{
            return to_power(n/2,x)*to_power(n/2,x)*x;
        }



        

    }
    public static void main(String[] args) {
        int n=5,x=2;
        System.out.println(to_power(n,x));
    }   

}

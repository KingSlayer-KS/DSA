package Basic_stuff;

import java.util.Scanner;

public class Take_X_Y_as_input_and_find_value_of_X_to_power_Y {
    public static int Powering(int x, int y){
        int z=1;
        for (int i=1;i<=y;i++){
            z=z*x;
        }
        return z;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int oo=Powering(sc.nextInt(),sc.nextInt());
        System.out.println(oo);
        sc.close();
        
        
    }
    
}

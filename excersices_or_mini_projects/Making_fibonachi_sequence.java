package excersices_or_mini_projects;

import java.util.*;

public class Making_fibonachi_sequence {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int f1 =0,
        f2=1,
        n=sc.nextInt(),
        f3;
        System.out.print(f1+" "+f2+" ");
        for(int i=2;i<=n;i++){
            f3=f1+f2;
            System.out.print(f3+" ");
            f1=f2;
            f2=f3;
        }
        sc.close();


    }
    
}

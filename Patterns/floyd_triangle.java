package Patterns;

public class floyd_triangle {
    public static void main(String[] args) {
        int a= 4;
        int v= 1;
        for(int i= 1;i<=a;i++){
            for(int j= 1;j<=i;j++){
                System.out.print(v);
                v++;
            }
        System.out.println(" ");
        }
    }
    
}

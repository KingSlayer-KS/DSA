package Recursion.Recursion_intermiadte;
//complexity= 2^n
public class Tower_of_henoi {
    public static void tower(int n,String src,String help, String dst){
        if(n==1){
            System.out.println("transfer "+ n +" disk"+" from "+src+" to "+dst);
            return;
        }
        tower(n-1,src,dst,help);
        System.out.println("transfer "+ n +" disk"+" from "+src+" to "+dst);
        tower(n-1,help,src,dst);
        
    }
    public static void main(String[] args) {
        int n=4;
        tower(n,"S","H","D");

    }
    
}

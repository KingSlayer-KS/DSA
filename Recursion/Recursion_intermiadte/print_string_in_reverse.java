package Recursion.Recursion_intermiadte;

public class print_string_in_reverse {
    public static void reverse_fun(String s,int i){
        if(i<0){          
            return;
        }
        System.out.print(s.charAt(i));
        reverse_fun(s, i-1);
    }
    public static void main(String[] args) {
        String s= "abcd";
        reverse_fun(s,(s.length())-1);
    }
    
}

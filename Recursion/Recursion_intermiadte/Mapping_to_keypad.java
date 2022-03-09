package Recursion.Recursion_intermiadte;

public class Mapping_to_keypad {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
            "tu", "vwx", "yz" };

    public static void print_comb(String str, int i, String comb) {
        if(i==str.length()){
            System.out.println(comb);
            return;

        }
        char curca=str.charAt(i);
        String mapping=keypad[curca-'0'];

        for (int j=0;j<mapping.length();j++){
            print_comb(str, i+1, comb+mapping.charAt(j));
        }
    }

    public static void main(String[] args) {
        String str="23";
        print_comb(str, 0, "");

    }

}

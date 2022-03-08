package Recursion.Recursion_intermiadte;

public class First_and_last_occurance_of_given_element_in_string_alternative {
    public static int la = -1;
    public static int fi = -1;

    public static void occurance(String str, char element, int i) {
        if (i == str.length()) {
            System.out.println("first occurance is: " + fi + "\nlast occurance is: " + la);
            return;
        } else if (str.charAt(i) == element && fi == -1) {
            if (fi == -1) {
                fi = i;
            } else {
                la = i;
            }
        }
        occurance(str, element, i + 1);

    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        char element = 'b';
        int i = 0;
        occurance(str, element, i);
    }
}

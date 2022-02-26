package Basic_stuff;

import java.util.Scanner;

public class String_builders {
    public static void main(String[] args) {
        /*
         * Strings are normally immutable
         * but strigbuilder make a string that is mutable
         */
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Sirjan");
        System.out.println(sb);

        // printing_char_at_0(name.charAt(index))
        System.out.println(sb.charAt(0));

        System.out.println();

        // replacing_a_character_at_an_Index(name.setCharAt(index, 'string'))
        sb.setCharAt(0, 's');
        System.out.println(sb);

        System.out.println();

        // Inserting_a_character_at_an index(name.insert(index,"String"))
        sb.insert(0, "My nam is ");
        System.out.println(sb);

        System.out.println();

        // delete_character_form_an_index_to_a_index(name.delete(index,index))
        sb.delete(0, 10);
        System.out.println(sb);

        System.out.println();

        // append_charecters_at_end_(name.append("String))
        sb.append("deep");
        sb.append(" singh ");
        sb.append(" k");
        sb.append("a");
        sb.append("n");
        sb.append("d");
        sb.append("hari");

        System.out.println(sb);

        System.out.println();

        sc.close();
    }

}

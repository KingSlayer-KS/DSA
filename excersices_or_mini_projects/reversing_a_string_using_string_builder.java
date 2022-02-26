package excersices_or_mini_projects;;

public class reversing_a_string_using_string_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("sirjan");
     
        for (int i = 0; i < sb.length()/ 2; i++) {
            int front_index = i;
            int back_index = sb.length() - 1 - i;

            char front_char = sb.charAt(front_index);
            char back_char = sb.charAt(back_index);

            sb.setCharAt(back_index, front_char);
            sb.setCharAt(front_index,back_char );
            
           
        }
        System.out.println("\n"+sb+"\n");

    }

}

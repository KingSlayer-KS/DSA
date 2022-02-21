package Basic_stuff;



public class Constants {
    public static void main(String[] args) {
        // constant
        // ages are not constant values they change over time
        int age = 31;
        age = 32;
        age = 31;
        // but something like the value of sqrt of 2 or sqrt of 3 or value of pi is same
        // and never changes

        float P = 3.14F;
        /*
         * capital(F)used to cast into float
         * or we could also use [(float)] before typing the value
         */
        P = 3.4F;
        /*
         * here PI is not constant value yet
         * since we can change its value
         * so we have to add something to it
         */

        // that something is kew word final
        final float PI = 3.14F;
        // PI = 3.1F;
        /*
         * now if I try to change the value
         * it shows the red line and gives an error
         */
        System.out.println(PI + age + P);
        /*
         * NOTE* it is convention among java developers
         * we capitalize the name constant values
         */

    }
}

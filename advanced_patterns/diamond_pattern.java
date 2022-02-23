package advanced_patterns;

public class diamond_pattern {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= (n); i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // 1 st half numbers
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //flipping
        for (int i = n; i >0; i--) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // 1 st half numbers
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}

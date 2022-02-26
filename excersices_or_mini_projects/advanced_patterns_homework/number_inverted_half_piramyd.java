package excersices_or_mini_projects.advanced_patterns_homework;

public class number_inverted_half_piramyd {
    public static void main(String[] args) {
        int a = 4;
        for (int i = a; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a-i+1);
            }
            System.out.println();
        }
    }

}

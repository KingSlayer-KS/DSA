package Basic_stuff;

public class break_continue {
    public static void main(String[] args) {
        int kk = 0;
        while (true) {
            if (kk == 3) {
                kk = kk + 1;
                continue;
            }

            System.out.println(kk);

            kk = kk + 1;
            if (kk > 6) {
                break;
            }
        }

    }

}

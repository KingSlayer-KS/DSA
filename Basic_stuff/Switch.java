package Basic_stuff;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();// 1=>monday, 2=>tuesday
        sc.close();
        switch (day) {

            case 1:
                System.out.println("Monday");
                break;
            /*
             * breake because when one condion is satified
             * all the actions in the coming contitions
             * inrrespective of trueness are performed
             * so in order to stop that break is used
             */
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Wed-Sun");
                /*
                 * with defaul we need not ot add the break
                 * becsause the block end there
                 */
        }
    }
}

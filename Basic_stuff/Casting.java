package Basic_stuff;

public class Casting {
    public static void main(String[] args) {
//casting

        //implict casting
        double p = 100.0;
        //automaticly done by compiler
        double fp = p+18;
        System.out.println(fp);

        //exeplict casting
        int P = 100;
        int FP = P+(int)18.0;
        /*we have to specify it and is possible
        as long as the data types are compatible
        such as we cannot convert strings into integers*/

        /*if we put any number after the decimal in explicit casting
        it will truncate all the values after the decimal
        rather than rounding off the value after the decimal*/
        System.out.println(FP);
    }
}

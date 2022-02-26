package Basic_stuff;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name= sc.nextLine();
        System.out.println("The name is : "+name);

        System.out.println();

        //Concatinatin_string
        String f_name="Sirjan",
        l_name="S K",
        full_name="The name is " +f_name+" "+l_name;
        System.out.println(full_name);

        System.out.println();

        //length_of_the_string
        System.out.println(full_name.length());

        System.out.println();

        //itetratint the word  in a string charAT
        for (int i=0; i<full_name.length(); i++){
            System.out.println(full_name.charAt(i));
        }

        System.out.println();

        //comparision of two strings using(string1.compareTo(string2))
        //if string1 > string2 -> outputs a  +ve value
        //if string1 == string2 -> outputs a 0
        //if string1 < string2 -> outputs a  -ve value
        String string1="kkkssskkksss123321",string2="kkkssskkksss123321";
        if(string1.compareTo(string2)==0){
            System.out.println(true);
            System.out.println(string1+" & "+string2+"are equal");
        }else{
            System.out.println(string1+" & "+string2+"are not equal");
        }
        /*
        why we dont use "==" operator cuz in come cases "==" fails 
        so in most case we use (.comparesTo())*/

        System.out.println();

        /*
        slicing_string
        (string.substring(beg_index,end_index))
        [u can leave end_index empty if u want to print it till the end of the String]*/
        String naam="The name is Sirjan",
        sliced=naam.substring(12,naam.length()),
        sliced_alt=naam.substring(12);
        System.out.println(sliced);
        System.out.println(sliced_alt);
        




        








    sc.close();   
    }
    
}

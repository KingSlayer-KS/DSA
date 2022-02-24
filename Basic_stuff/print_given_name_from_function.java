package Basic_stuff;

import java.util.Scanner;

public class print_given_name_from_function {

    public static void PrintingName(String name){
        System.out.println("The Name is: "+name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Name=sc.nextLine();

        sc.close();
        
        PrintingName(Name);//calling the function
        
        
        
    }
}

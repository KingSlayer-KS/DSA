package OOPS;

/*

2 Types of polymorphism
    [+]RUN TIME /Function  OVER-RIDING
    [+]COMLILE TIME /Function OVERLOADING

    [-]Compile_time/overloading_polymorphism => same name vale function ko bar 
                            bar use karna alag alag purpose ke lie 
                            provided there are some differenciating factors 
                            like return type/arguments types/number of arguments 


    IN this file we will discuss about COMPILE TIME only
    IN compile time polymorphism we make a lot of variables with same name 
        but they differ in return typer or type of arguments taken or number 
        or arguments taken in diffrent data types
    */
class Student2 {
    String name;
    int age;

    public void print_info(String name) {
        System.out.println("Name= " + this.name);
    }

    public void print_info(int age) {
        System.out.println("age= " + this.age);
    }

    public void print_info(String name, int age) {
        System.out.println("Name= " + this.name + "   " + "age= " + this.age);
    }

    Student2(String name, int age) {
        // parameterized constructor
        this.name = name;
        this.age = age;
    }

}

public class polymorphism {
    public static void main(String[] args) {
        Student2 s1 = new Student2("Raj", 12);
        Student2 s2 = new Student2("esh", 5);
        Student2 s3 = new Student2("kum", 15);
        Student2 s4 = new Student2("ar", 10);

        s1.print_info(s1.age);
        s1.print_info(s1.name, s1.age);
        s1.print_info(s1.name);
        System.out.println();

        s2.print_info(s2.age);
        s2.print_info(s2.name);
        s2.print_info(s2.name, s2.age);
        System.out.println();

        s3.print_info(s3.age);
        s3.print_info(s3.name);
        s3.print_info(s3.name, s3.age);
        System.out.println();

        s4.print_info(s4.age);
        s4.print_info(s4.name);
        s4.print_info(s4.name, s4.age);
        System.out.println();
    }
}
package OOPS;

/* 
*constructor of class "xyz"=="xyz()" 
*constructors doesnot return anything tough tey are type of functions
*/
class Student {
    String name;
    int age;

    public void print_info() {
        System.out.println();
        System.out.println("Name= " + this.name + "\n" + "age= " + this.age);
    }

    Student() {
        // no parameters since this constructor are non-parameterized
        // here Student()=constructor,tis is non parameterized constructor

        System.out.println("CONSTRUCTOR HAZIR HOOOoooooo....!!");
    }

    Student(String name, int age) {
        // parameters since this constructor are parameterized
        this.name = name;
        // this.name ==>object ka name
        // name ==> argumen given in condtructor
        this.age = age;
        // like self.name & name in python

    }

    Student(Student s5) {
        // this is a copy constructor
        this.name = s5.name;
        this.age = s5.age;
    }

}

public class stu {
    public static void main(String[] args) {
        /*
         * Student s1 = new Student();
         * s1.name = "esh";
         * s1.age = 15;
         */
        // for a given object constructor is called once i.e during its creation
        Student s1 = new Student("Raj", 12);
        Student s2 = new Student("esh", 5);
        Student s3 = new Student("kum", 15);
        Student s4 = new Student("ar", 10);
        Student s5 = new Student(s4);
        s1.print_info();
        s2.print_info();
        s3.print_info();
        s4.print_info();
        s5.print_info();

        System.out.println();
        /*
        //as we can see in output we never specificaly declared the values for
        //(s5) but we still go em because of the copy constructor
        //which copied the values of (s4) and gave it to (s5)
         */

        /*
        NOTE:
        JAVA doesnot have destructors like C++ 
        because JAVA has garbage collectors*/

    }
}
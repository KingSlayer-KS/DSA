package OOPS;

class student1{
    String name;
    static String schoolname;

}

public class _static_ka_matlab  {
    public static void main(String[] args) {
        student1.schoolname="mera pyra school";
        student1 s1= new student1();
        student1 s2= new student1();
        student1 s3= new student1();
        student1 s4= new student1();
        s1.name="aaa";
        System.out.println("s1 :"+s1.schoolname);
        System.out.println("s2 :"+s2.schoolname);
        System.out.println("s3 :"+s3.schoolname);
        System.out.println("s4 :"+s4.schoolname);

       

    }


}

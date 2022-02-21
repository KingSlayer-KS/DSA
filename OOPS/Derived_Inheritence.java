package OOPS;

/*
Inheritence means inheriting the property/methods of a given class */
class Shape2 {
    String color;
}
//base class
class triangle extends Shape3 {
    public void area(int l, int b) {
        System.out.println("Area of triangle = "+0.5 * l * b);

    }
}
//child class
class equlatral extends triangle22 {
    public void area(int l, int b) {
        System.out.println("Area of equlatral triangle = "+0.5 * l * b);
    
        }

    }

//derived class
public class Derived_Inheritence {
    public static void main(String[] args) {
        triangle22 t1 = new triangle22();
        t1.color = "green";
        t1.area(5, 6);
        equlatral et1 = new equlatral();
        et1.color = "green";
        et1.area(5, 6);

        /*
         * we havent declared the color function in the square
         * but we can still use it because
         * of inheritence we did with shape class
         */

    }

}

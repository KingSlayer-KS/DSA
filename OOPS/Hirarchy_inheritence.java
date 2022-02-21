package OOPS;

/*
Inheritence means inheriting the property/methods of a given class */
class Shape3 {
    String color;
}
//base class
class triangle22 extends Shape3 {
    public void area(int l, int b) {
        System.out.println("Area of triangle = "+0.5 * l * b);

    }
}
//child class
class circle extends Shape3 {
    public void area(int r) {
        System.out.println("Area of equlatral triangle = "+(3.14) * r * r);
    
        }

    }
//child class
class eqlatral extends triangle22 {
    public void area(int l, int b) {
        System.out.println("Area of triangle = "+0.5 * l * b);

    }
}
//derived class

public class Hirarchy_inheritence {
    public static void main(String[] args) {
        triangle22 t1 = new triangle22();
        t1.color = "green";
        t1.area(5, 6);

        circle c1 = new circle();
        c1.color = "green";
        c1.area(5);

        eqlatral e1 = new eqlatral();
        e1.color = "green";
        e1.area(5,5);


    }

}

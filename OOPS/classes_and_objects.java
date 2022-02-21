package OOPS;

class Pen {
    // properties of pen
    String Type;
    String color;

    // function performed by pen or methods
    // functions in clas sare called methods
    public void write() {
        System.out.println("wrinting something");
    }

    public void prin_color() {
        System.out.println(this.color);
        // this is a java key word like the keyword self in python
    }
}

public class classes_and_objects {
    // object are entities thare are made to perform in programing world picked from
    // real world problems
    // clsss are the properties and things/tasks that an object can perform
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();
        Pen pen3 = new Pen();
        pen1.color = "blue";
        pen1.Type = "gel";
        pen2.color = "black";
        pen2.Type = "fountain";
        pen3.color = "green";
        pen3.Type = "fountain";
        // calling method pen

        pen1.prin_color();
        pen2.prin_color();
        pen3.prin_color();

    }

}

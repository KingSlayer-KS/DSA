package OOPS;
/*
Inheritence means inheriting the property/methods of a given class */
class Shape{
    String color;
}

class square extends Shape{

}

public class Inheritence {
    public static void main(String[] args) {
        square s1= new square();
        s1.color="greeen";
        /* 
        we havent declared the color function in the square
        but we can still use it because of inheritence we did with shape class*/
        
    }
    
}

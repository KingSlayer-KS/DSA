package OOPS;

interface Animal {
    int eyes = 2;

    public void walk();

}

interface herbivore {
}

// in a given java file only (interfaces) lets us use multiple inheritence

class lion implements Animal, herbivore {
    public void walk() {
        System.out.println("walks on 4 foot");
    }

}

public class Interface_Abstraction {
    public static void main(String[] args) {
        lion l1 = new lion();
        l1.walk();

    }

}

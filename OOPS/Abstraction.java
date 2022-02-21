package OOPS;

abstract class animal {
    abstract void walk();
    public void pet_able(){}
}

class horse extends animal {
    public void walk() {
        System.out.println("walk on 4 legs");
    }
    public void pet_able() {
        System.out.println(false);
    }


}

class chicken extends animal {
    public void walk() {
        System.out.println("walk on 2 legs");
    }
    public void pet_able() {
        System.out.println(false);
    }

}
class lion extends animal {
    public void walk() {
        System.out.println("walk on 4 legs");
    }
    public void pet_able() {
        System.out.println(true);
    }

}


public class Abstraction {
    public static void main(String[] args) {
        lion l1= new lion();
        l1.walk();
        l1.pet_able();

    }

}

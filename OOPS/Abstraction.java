package OOPS;

abstract class janvar {
    abstract void walk();
    public void pet_able(){}
}

class horse extends janvar {
    public void walk() {
        System.out.println("walk on 4 legs");
    }
    public void pet_able() {
        System.out.println(false);
    }


}

class chicken extends janvar {
    public void walk() {
        System.out.println("walk on 2 legs");
    }
    public void pet_able() {
        System.out.println(false);
    }

}
class sher extends janvar {
    public void walk() {
        System.out.println("walk on 4 legs");
    }
    public void pet_able() {
        System.out.println(true);
    }

}


public class Abstraction {
    public static void main(String[] args) {
        sher l1= new sher();
        l1.walk();
        l1.pet_able();

    }

}

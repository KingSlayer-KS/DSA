package OOPS;
class account{
    public String name;
    protected String email;
    private String psswd; //private function are used to acess by getters and setters
   
    public String getpasswd() {
        return this.psswd;

    }
    public void setpasswd(String pass){
        this.psswd=pass;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        account Account1  = new account();
        Account1.name= "ME";
        Account1.email= "me@me.me";
        Account1.setpasswd("mememe123");
        System.out.println(Account1.getpasswd());
    }
    
}

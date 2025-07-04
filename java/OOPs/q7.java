interface Animal {
    void makeSound();
}

abstract class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Poodle extends Dog {
    public void makeSound() {
   
        System.out.println("Yip-yip!");
    }
}

public class q7 {
    public static void main(String[] args) {
        Poodle poodle = new Poodle();
        poodle.makeSound();
    }
}

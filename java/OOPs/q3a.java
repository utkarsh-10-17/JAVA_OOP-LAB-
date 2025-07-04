abstract class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

  
    public void makeSound() {
        System.out.println("Meow!");
    }
}
class Main {
    public static void main(String[] args) {
       
        Dog dog = new Dog("Fido");

       
        dog.makeSound();

      
        Cat cat = new Cat("Garfield");

      
        cat.makeSound();
    }
}

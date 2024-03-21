import java.util.Scanner;

class Animal {
    protected String name;
    protected String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(this.name + " says: " + this.sound);
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name, "Woof");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name, "Meow");
    }
}

public class nptl_weekeig_one {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String dogName = obj.nextLine();
        String catName = obj.nextLine();

        Dog dog = new Dog(dogName);
        Cat cat = new Cat(catName);

        dog.makeSound();
        cat.makeSound();
    }
}

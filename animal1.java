/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal;


class Animal {
    public String name;  

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("This animal makes a sound.");
    }
    public String toStrig() {
        return "Animal: " + name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void sound() {
        System.out.println("The dog barks.");
    }
    public String toString() {
        return super.toString() + " (Dog)";
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    public void sound() {
        System.out.println("The cat meows.");
    }
    public String toString() {
        return super.toString() + " (Cat)";
    }
}

public class animal1 {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        Dog dog = new Dog("Rover");
        Cat cat = new Cat("Whiskers");
        animal.sound();  
        dog.sound();     
        cat.sound();    
        System.out.println(animal);
        System.out.println(dog);
        System.out.println(cat);
    }
}
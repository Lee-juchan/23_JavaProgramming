package lecture.ch08.Animal.InterfaceAnimal.App;

import lecture.ch08.Animal.InterfaceAnimal.impl.*;

public class InterfaceAnimalDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.sound();

        Cat cat1 = new Cat();
        cat1.sound();
    }
}

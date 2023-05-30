package lecture.ch08.Animal.AbstractAnimal.App;

import lecture.ch08.Animal.AbstractAnimal.impl.*;

public class AbstractAnimalDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Dog");
        dog1.sound();
        dog1.showCategory();

        Cat cat1 = new Cat("Cat");
        cat1.sound();
        cat1.showCategory();
    }
}

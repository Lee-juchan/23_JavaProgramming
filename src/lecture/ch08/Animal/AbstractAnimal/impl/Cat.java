package lecture.ch08.Animal.AbstractAnimal.impl;

import lecture.ch08.Animal.AbstractAnimal.AbstractAnimal;

public class Cat extends AbstractAnimal {
    public Cat() {
        super();
    }

    public Cat(String category) {
        super(category);
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

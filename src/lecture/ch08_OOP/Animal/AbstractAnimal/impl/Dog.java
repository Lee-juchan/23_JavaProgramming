package lecture.ch08_OOP.Animal.AbstractAnimal.impl;

import lecture.ch08_OOP.Animal.AbstractAnimal.AbstractAnimal;

public class Dog extends AbstractAnimal {
    public Dog() {
        super();
    }
    public Dog(String category) {
        super(category);
    }

    @Override
    public void sound() {
        System.out.println("Bark");
    }
    // method overrode
    public void sound(int times) { 
        for (int i = 0; i < times; i++) {
            System.out.println("Bark");
        }
    }

    // method override
    @Override
    public void showCategory() {
        super.showCategory();
        System.out.println("I'm wonderful " + super.category);
    }
}
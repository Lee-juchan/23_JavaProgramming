package lecture.ch08_OOP.Animal.InterfaceAnimal.impl;

import lecture.ch08_OOP.Animal.InterfaceAnimal.InterfaceAnimal;

public class Dog implements InterfaceAnimal {

    @Override
    public void sound() {
        // CATEGORY = "Dog"; 상수라 변경 불가
        System.out.println(CATEGORY + " Bark");
    }
}

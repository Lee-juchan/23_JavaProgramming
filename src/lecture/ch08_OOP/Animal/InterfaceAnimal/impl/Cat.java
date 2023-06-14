package lecture.ch08_OOP.Animal.InterfaceAnimal.impl;

import lecture.ch08_OOP.Animal.InterfaceAnimal.InterfaceAnimal;

public class Cat implements InterfaceAnimal{

    @Override
    public void sound() {
        System.out.println(CATEGORY + " Meow");
    }
}

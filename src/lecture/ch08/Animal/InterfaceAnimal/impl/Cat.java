package lecture.ch08.Animal.InterfaceAnimal.impl;

import lecture.ch08.Animal.InterfaceAnimal.InterfaceAnimal;

public class Cat implements InterfaceAnimal{

    @Override
    public void sound() {
        System.out.println(CATEGORY + " Meow");
    }
}

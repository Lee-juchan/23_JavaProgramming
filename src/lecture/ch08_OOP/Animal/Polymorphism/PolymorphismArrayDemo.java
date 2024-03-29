package lecture.ch08_OOP.Animal.Polymorphism;

import lecture.ch08_OOP.Animal.AbstractAnimal.*;
import lecture.ch08_OOP.Animal.AbstractAnimal.impl.*;

public class PolymorphismArrayDemo {
    public static void main(String[] args) {

        AbstractAnimal[] animals = new AbstractAnimal[5];

        animals[0] = new Dog("Dog");
        animals[1] = new Cat("Cat");
        animals[2] = new Dog("Dog");
        animals[3] = new Cat("Cat");
        animals[4] = new Dog("Dog");

        // 배열 순회, 내용 출력
        for(AbstractAnimal animal : animals) {
            animal.showCategory();
        }
    }
}

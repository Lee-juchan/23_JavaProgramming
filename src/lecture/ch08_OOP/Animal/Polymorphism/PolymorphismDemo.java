/*
    @brief : 추상 클래스, 인터페이스로 다형성 구현
    @details : 
*/

package lecture.ch08_OOP.Animal.Polymorphism;

import lecture.ch08_OOP.Animal.AbstractAnimal.*;
import lecture.ch08_OOP.Animal.AbstractAnimal.impl.*;

public class PolymorphismDemo {
    public static void main(String[] args) {

        // AbstractAnimal <- Dog 사용 가능
        AbstractAnimal dog1 = new Dog("Dog");
        AbstractAnimal cat1 = new Dog("Dog");

        dog1.sound();
        dog1.showCategory();
        cat1.sound();
        cat1.showCategory();
    }
}

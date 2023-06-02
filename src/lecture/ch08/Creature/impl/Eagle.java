package lecture.ch08.Creature.impl;

import lecture.ch08.Creature.*;

public class Eagle extends Birds implements Flyable {
    @Override
    public void sound() {
        System.out.println("eeeeagle");
    }
    
    @Override
    public void fly() {
        System.out.println("I can flyeeeeagle");
    }
}

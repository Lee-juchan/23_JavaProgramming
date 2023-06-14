package lecture.ch08_OOP.Creature.impl;

import lecture.ch08_OOP.Creature.*;

public class Human extends Mammals implements Swimable,Talkable {
    @Override
    public void sound() {
        System.out.println("aahuuuman");
    }
    
    @Override
    public void swim() {
        System.out.println("I can swiuuuuman");
    }
    
    @Override
    public void talk(Creature creature) {
        System.out.print("Hello~ who are you? ");
        creature.sound();
    }
}

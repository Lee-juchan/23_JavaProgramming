package lecture.ch08.Creature.impl;

import lecture.ch08.Creature.*;

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

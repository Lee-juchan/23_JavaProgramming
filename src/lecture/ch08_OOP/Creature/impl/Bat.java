package lecture.ch08_OOP.Creature.impl;

import lecture.ch08_OOP.Creature.*;

public class Bat extends Birds implements Flyable {
    @Override
    public void sound() {
        System.out.println("bbababbbt");
    }
    
    @Override
    public void fly() {
        System.out.println("I can flbbababbbty");
    } 
}

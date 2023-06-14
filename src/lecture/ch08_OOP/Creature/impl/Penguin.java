package lecture.ch08_OOP.Creature.impl;

import lecture.ch08_OOP.Creature.*;

public class Penguin extends Birds implements Swimable {

    @Override
    public void sound() {
        System.out.println("ppeeppennguin");
    }
    
    @Override
    public void swim() {
        System.out.println("I can sswwimpennguin");
    } 
    
}
package lecture.ch08.Creature.impl;

import lecture.ch08.Creature.*;

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
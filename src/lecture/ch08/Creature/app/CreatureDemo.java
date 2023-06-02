package lecture.ch08.Creature.app;

import lecture.ch08.Creature.impl.*;
import lecture.ch08.Creature.*;

public class CreatureDemo {
    public static void main(String[] args) {
        Human human = new Human();
        Penguin penguin = new Penguin();
        Eagle eagle = new Eagle();
        Bat bat = new Bat();

        // 다형성 구현
        Creature[] cretures = {human, penguin, eagle, bat};
        Flyable[] flies = { eagle, bat };
        Swimable[] swims = { human, penguin};

        for(Creature c : cretures) { c.sound(); }

        for (Flyable f : flies) { f.fly(); }
        for (Swimable s : swims) { s.swim(); }

        for (Creature c : cretures) { human.talk(c); }
    }
}

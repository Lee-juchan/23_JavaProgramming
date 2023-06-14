package lecture.ch09_EnumAndCollection.Game.App;

import lecture.ch09_EnumAndCollection.Game.GameController;
import lecture.ch09_EnumAndCollection.Game.Unit.*;

public class GameDemo {
    public static void main(String[] args) {
        Unit k1 = new Knight("knight1");
        Unit a1 = new Archer("archer1");
        Unit s1 = new Shuttle("shuttle1");
        Unit g1 = new Griffin("griffin1");

        GameController controller = new GameController();
        controller.addUnit(k1);
        controller.addUnit(a1);
        controller.addUnit(s1);
        controller.addUnit(g1);

        controller.move(2, 3);
        controller.attack();
    }
}

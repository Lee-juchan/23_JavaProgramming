package lecture.ch09_EnumAndCollection.Game.Unit;

public class Shuttle extends Unit {

    public Shuttle(String unitName) {
        super(unitName);
    }

    @Override
    public void attack() {
        System.out.printf("[%s] can't attack\n", getUnitName());
    }

    @Override
    public void move(int x, int y) {
        System.out.printf("[%s] flies to (%d, %d)\n", getUnitName(), x, y);
    }
}

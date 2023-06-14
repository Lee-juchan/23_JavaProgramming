package lecture.ch09_EnumAndCollection.Game.Unit;

public class Knight extends Unit {

    public Knight(String unitName) {
        super(unitName);
    }

    @Override
    public void attack() {
        System.out.printf("[%s] swooshes sword\n", getUnitName());
    }
}

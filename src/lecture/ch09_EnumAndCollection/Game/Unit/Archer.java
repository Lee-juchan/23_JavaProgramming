package lecture.ch09_EnumAndCollection.Game.Unit;

public class Archer extends Unit {
    
    public Archer(String unitName) {
        super(unitName);
    }

    @Override
    public void attack() {
        System.out.printf("[%s] shoots arrow\n", getUnitName());
    }
}

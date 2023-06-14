package lecture.ch09_EnumAndCollection.Game.Unit;

public abstract class Unit {
    protected String unitName;

    public Unit(String name) {
        this.unitName = name;
    }

    public String getUnitName() {
        return this.unitName;
    }
    public void move(int x, int y) {
        System.out.printf("[%s] moves to (%d, %d)\n", getUnitName(), x, y);
    }

    public abstract void attack();
    
}

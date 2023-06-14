package lecture.ch09_EnumAndCollection.Game;

import java.util.ArrayList;

import lecture.ch09_EnumAndCollection.Game.Unit.Unit;

public class GameController {
    private ArrayList<Unit> unitList;

    public GameController() {
        unitList = new ArrayList<>();
    }

    // unit 추가
    public void addUnit(Unit unit) {
        unitList.add(unit); // 중복 가능
    }

    // unit 삭제
    public boolean removeUnit(String unitName) {
        for(Unit unit : unitList) {
            if(unit.getUnitName() == unitName) {
                unitList.remove(unit);
                return true;
            }
        }
        return false;
    }

    // 모든 unit 이동
    public void move(int x, int y) {
        for(Unit unit : unitList) {
            unit.move(x, y);
        }
    }

    // 모든 unit 공격
    public void attack() {
        for(Unit unit : unitList) {
            unit.attack();
        }
    }
}

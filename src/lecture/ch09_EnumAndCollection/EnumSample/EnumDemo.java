package lecture.ch09_EnumAndCollection.EnumSample;

import lecture.ch09_EnumAndCollection.EnumSample.Constants.Company;
import lecture.ch09_EnumAndCollection.EnumSample.Constants.Day;
import lecture.ch09_EnumAndCollection.EnumSample.Constants.Fruit;

public class EnumDemo {
    public static void main(String[] args) {

        // 1. 가독성
        System.out.println(Fruit.APPLE); // APPLE
        System.out.println(Company.APPLE); // APPLE

        // 2. 타입 안정성
        // int type = Fruit.APPLE;

        // if(type == Company.Apple) {}
        // if(Fruit.APPLE == Company.APPLE) {}

        // 3. values(), valueOf()
        for(Day d : Day.values()) {
            System.out.print(d.toString() + " ");
        }
        System.out.println();

        Day monday = Day.valueOf("MONDAY");
        System.out.println(monday);
        System.out.println(monday == Day.MONDAY);

    }
    
}

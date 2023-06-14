package lecture.ch09_EnumAndCollection.EnumSample;

import lecture.ch09_EnumAndCollection.EnumSample.Constants.Day;

public class DayDemo {
    public static void main(String[] args) {
        Day today = Day.FRIDAY;

        switch(today) {
            case MONDAY -> System.out.println("Start of the work!");
            case TUESDAY,WEDNESDAY, THURSDAY -> System.out.println("Midweek!");
            case FRIDAY -> System.out.println("End of the work!");
            case SATURDAY, SUNDAY -> System.out.println("weekends!");

            default -> System.out.println("Unexpected value!!!");
        }
    }
}

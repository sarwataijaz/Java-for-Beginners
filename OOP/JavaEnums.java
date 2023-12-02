package com.example.tictactoe;

enum Days {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    int num;
    Days(int num) {
        this.num = num;
    }
}

public class JavaEnums {

    public static void main(String[] args) {

        // enum -> enumerated, ordered listing of items in a collection, behaviour similar to objects
        Days myDay = Days.SUNDAY;
        isItAWeekend(myDay);

    }
    static void isItAWeekend(Days myDay) {

        switch(myDay) {

            case SATURDAY: {
                System.out.println("Yess, its a weekend :-)");
                System.out.println("Day number: " + myDay.num);
                break;
            }
            case SUNDAY: {
                System.out.println("Yess, its a weekend :-)");
                System.out.println("Day number: " + myDay.num);
                break;
            }

            default:
                System.out.println("Nope, its not counted in a weekend-");
                System.out.println("Day number: " + myDay.num);
        }
    }
}

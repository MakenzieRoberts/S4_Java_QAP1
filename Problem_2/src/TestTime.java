/*
    ❗ NOTE: As per the instructions, I did not include validation for negative or out-of-range
            numbers. Unexpected behavior may occur if negative or out-of-range numbers are passed.
*/

import java.util.Scanner;

/*
    2.	Write a test program called TestTime (in another source file called TestTime.java) which uses the Time class.
*/

public class TestTime {

    public static void main(String[] args) {
        /*
            3.  Create two time objects (t1 and t2). Set their time to 21:10:15 and 10:20:25 using set methods.

            ❗ NOTE: When following the class diagram exactly, the instructions for initialization the
            instance variables (hour, minute, second) does not specify an initial value, and the diagram's
            instructions for the constructor requires 3 parameters.

            Therefore, I cannot create two Time objects without values and then set their values using the
            set methods. I have to either initialize the private instance variables with 0, - or - create a
            non-parameterized constructor, - or - create the time objects with the values (0,0,0) and then
            set their values using the set methods.

            I want to stick to the diagram as closely as possible, so I chose the latter option.
        */

        System.out.println("\n3.  Create two time objects (t1 and t2). Set their time to 21:10:15 and 10:20:25 using set methods.\n");
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0, 0, 0);

        /*  Using setTime() for t1 */
        t1.setTime(21, 10, 15);

        /*  Using setHour()/setMinute()/setSecond() for t2 (Just using this instead of setTime() to
        demonstrate the individual setters) */
        t2.setHour(10);
        t2.setMinute(20);
        t2.setSecond(25);

        System.out.println("\tTimes Set: \n");
        System.out.println("\tt1: " + t1 + "\n" + "\tt2: " + t2 + "\n");
        /*
            4.	Call nextSecond() for t1 and previousSecond() for t2.
        */
        System.out.println("4.  Call nextSecond() for t1 and previousSecond() for t2.\n");
        t1.nextSecond();
        t2.previousSecond();
        System.out.println("""
                \tnextSecond() called for t1.
                \tpreviousSecond() called for t2.
                """);
        /*
            5.	Display the final times for t1 and t2 using toString() method.
        */
        System.out.println("5.  Display the final times for t1 and t2 using toString() method.\n");
        System.out.println("\tt1: " + t1); /* toString() is called automatically */
        System.out.println("\tt2: " + t2); /* toString() is called automatically */
    }

}



package se.lexicon.mark;


import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Dice!");
        System.out.println("roll " + "\n" + Dice.roll(6));
    }

/*
Make an Enum called Dice with values D6, D10, D20 and D100
•Add a field for each value representing the maxValue for each roll.
You also need to create a constructor.
•Make a method called roll that returns a random number between 1 and the maxValue.
 */

    enum Dice {

        //D6 d6 = new D6("D6");

        //int d6,d10,d20,d100;     //Enter any integers as input
        //Scanner objInput = new Scanner(System.in);
        // System.out.println("Select your dice: D6, D10, D20, D100 and roll ");
        //String maxValue = objInput.nextLine();
        // while(true)


        D6(6),

        D10(10),

        D20(20),

        D100(100);


        private int maxValue;

        Dice(int maxValue) {
            this.maxValue = maxValue;
        }

        public static int roll(int dice) {
            switch (dice) {
                case 6:
                    return (int) (Math.random() * D6.maxValue) + 1;
                case 10:
                    return (int) (Math.random() * D10.maxValue) + 1;
                case 20:
                    return (int) (Math.random() * D20.maxValue) + 1;
                case 100:
                    return (int) (Math.random() * D100.maxValue) + 1;
                default:
                    System.out.println("error wrong number in dice");

            }
            return -1;

        }


    }
}



/*enum WeekDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    public static void main(String[] args) {
        System.out.println("Enum!");

        //We can get an array of all enum values
        WeekDay[] weekDays = WeekDay.values();
//We can also iterate through all the enum values with a for loop
        for(WeekDay day:WeekDay.values()) {
            System.out.println(day);

        }
    }
}*/

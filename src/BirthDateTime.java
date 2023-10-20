import java.util.Scanner;
public class BirthDateTime
{
    public static Scanner testScan = new Scanner(System.in);
    public static void main(String[] args)
    {
        int year = 0;
        int day = 0;
        int month = 0;
        int hour = 0;
        int mins = 0;
        boolean done = false;


        year = SafeInput.getRangedInt(testScan, "Enter the year you were born", 1950, 2015);
        System.out.println("You said your year of birth is: " + year);
        month = SafeInput.getRangedInt(testScan, "Enter the month you were born", 1, 12);
        System.out.println("You said your month of birth is: " + month);


            switch(month)
            {
                case 1:
                    day = SafeInput.getRangedInt(testScan, "Enter the day you were born", 1, 31);
                    System.out.println("You said the day you were born is: " + day);
                    break;
                case 2:
                    day = SafeInput.getRangedInt(testScan, "Enter the day you were born", 1, 28);
                    System.out.println("You said the day you were born is: " + day);
                    break;
                case 3:
                    day = SafeInput.getRangedInt(testScan, "Enter the day you were born", 1, 31);
                    System.out.println("You said the day you were born is: " + day);
                    break;
                case 4:
                    day = SafeInput.getRangedInt(testScan, "Enter the day you were born", 1, 30);
                    System.out.println("You said the day you were born is: " + day);
                    break;
                case 5:
                    day = SafeInput.getRangedInt(testScan, "Enter the day you were born", 1, 31);
                    System.out.println("You said the day you were born is: " + day);
                    break;
                case 6:
                    day = SafeInput.getRangedInt(testScan, "Enter the day you were born", 1, 30);
                    System.out.println("You said the day you were born is: " + day);
                    break;
                case 7:
                    day = SafeInput.getRangedInt(testScan, "Enter the day you were born", 1, 31);
                    System.out.println("You said the day you were born is: " + day);
                    break;
                case 8:
                    day = SafeInput.getRangedInt(testScan, "Enter the day you were born", 1, 31);
                    System.out.println("You said the day you were born is: " + day);
                    break;
                case 9:
                    day = SafeInput.getRangedInt(testScan, "Enter the day you were born", 1, 30);
                    System.out.println("You said the day you were born is: " + day);
                    break;
                case 10:
                    day = SafeInput.getRangedInt(testScan, "Enter the day you were born", 1, 31);
                    System.out.println("You said the day you were born is: " + day);
                    break;
                case 11:
                    day = SafeInput.getRangedInt(testScan, "Enter the day you were born", 1, 30);
                    System.out.println("You said the day you were born is: " + day);
                    break;
                case 12:
                    day = SafeInput.getRangedInt(testScan, "Enter the day you were born", 1, 31);
                    System.out.println("You said the day you were born is: " + day);
                    break;
            }

        hour = SafeInput.getRangedInt(testScan, "Enter the hour you were born", 1, 12);
        System.out.println("You said your hour of birth was: " + hour);
        mins = SafeInput.getRangedInt(testScan, "Enter the minute you were born", 1, 60);
        System.out.println("You said your minute of birth was: " + mins);

        System.out.println("You were born on " + month + " / " + day + " / " + year + " at " + hour + ":" + mins);



    }
}

import java.util.Scanner;

public class DevTest
{
    public static Scanner testScan = new Scanner(System.in);

    public static void main(String[] args)
    {
        String firstName = "";
        int age = 0;
        double salary = 0;
        int favNum = 0;

        /*

        firstName = SafeInput.getNonZeroLenString(testScan, "Enter your first name");
        System.out.println("Firstname is " + firstName);

        age = getInt(testScan, "Enter your age");
        System.out.println("You said your age is: " + age);

        salary = getDouble(testScan, "Enter your salary: ");
        System.out.println("You said salary is: " + salary);

        favNum = getRangedInt(testScan, "Enter your favorite number", 1, 10);
        System.out.println("You said your fav num is: " + favNum);

        salary = getRangedDouble(testScan, "Enter your salary", 300, 100000);
        System.out.println("You said your salary is: " + salary);
         */


    }
    // methods go after the main!

    /**
     * Returns a string input by the user that must be at least one character
     * @param pipe The scanner to use for the input
     * @param prompt The message for the user telling them what to input
     * @return A string of at least one character
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        boolean done = false;
        String response = "";
        do
        {
            System.out.print(prompt + ": ");
            response = pipe.nextLine();

            if(response.length() > 0)
                done = true;
            else
                System.out.println("\nYou must enter at least one character!\n");

        }while(!done);

        return response;
    }

    /**
     * Gets an int val from the user with no constraints
     * @param pipe Scanner to use for the input
     * @param prompt Msg to user for what to enter
     * @return any valid int
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        boolean done = false;
        String trash = "";
        int value = 0;
        do
        {
            System.out.print(prompt + ": ");
            if(pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine(); // clear the buffer
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered: " + trash);
            }

        }while(!done);

        return value;
    }

    /**
     * Returns an unconstrained double value (has a wrong output for invalid code)
     * @param pipe scanner
     * @param prompt
     * @return
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        boolean done = false;
        String trash = "";
        double value = 0;
        do
        {
            System.out.print(prompt + ": ");
            if(pipe.hasNextDouble())
            {
                value = pipe.nextDouble();
                pipe.nextLine(); // clear the buffer
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered: " + trash);
            }

        }while(!done);

        return value;
    }

    /**
     * gets int val from the user with a high and low constraint
     * @param pipe scanner to use for input
     * @param prompt msg to user for what to enter
     * @param low Bottom value for inclusive range
     * @param high Top value for inclusive range
     * @return The value
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        boolean done = false;
        String trash = "";
        int value = 0;
        do
        {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if(pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine(); // clear the buffer

                if(value >=low && value <= high)
                    done = true;
                else
                    System.out.println("\nYou must enter a value within the range [" + low + " - " + high + "]: ");
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered: " + trash);
            }

        }while(!done);

        return value;
    }


    /**
     * Gets a double value within an inclusive range
     * @param pipe The scanner to use for input
     * @param prompt The message to user what to enter
     * @param low Low bound of inclusive range
     * @param high High bound of inclusive range
     * @return Returns a double within the inclusive range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        boolean done = false;
        String trash = "";
        double value = 0;
        do
        {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if(pipe.hasNextDouble())
            {
                value = pipe.nextDouble();
                pipe.nextLine(); // clear the buffer

                if(value >=low && value <= high)
                    done = true;
                else
                    System.out.println("\nYou must enter a value within the range [" + low + " - " + high + "]: ");
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered: " + trash);
            }

        }while(!done);

        return value;
    }




}
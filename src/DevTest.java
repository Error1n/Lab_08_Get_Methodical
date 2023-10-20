import java.util.Scanner;

public class DevTest
{
    public static Scanner testScan = new Scanner(System.in);

    public static void main(String[] args)
    {
        String firstName = "";
        String ssn = "";
        String response = "";
        int age = 0;
        double salary = 0;
        int favNum = 0;

        /*

        // test here for getNonZeroLenString
        firstName = SafeInput.getNonZeroLenString(testScan, "Enter your first name");
        System.out.println("Firstname is " + firstName);

        // test here for getInt
        age = getInt(testScan, "Enter your age");
        System.out.println("You said your age is: " + age);

        // test here for getDouble
        salary = getDouble(testScan, "Enter your salary: ");
        System.out.println("You said salary is: " + salary);

        // test here for getRangedInt
        favNum = getRangedInt(testScan, "Enter your favorite number", 1, 10);
        System.out.println("You said your fav num is: " + favNum);

        // test here for getRangedDouble
        salary = getRangedDouble(testScan, "Enter your salary", 300, 100000);
        System.out.println("You said your salary is: " + salary);

        // test here for getYNConfirm
        getYNConfirm(testScan, "Do you want to play again?");
        if (response.equalsIgnoreCase("Y"))
            System.out.println("You chose to play again!");
        else
            System.out.println("You chose not to play again!");

        // test here for getRegExString
        String ssnRegEx = "^\\d{3}-\\d{2}-\\d{4}$"; // the carrot ^ and dollar $ anchors the pattern
        ssn = getRegExString(testScan, "Enter your SSN", ssnRegEx); //testing for a social security number
        System.out.println("You said snn is " + ssn);

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

    /**
     * returns a true false value for yes or no input [y/n]
     * @param pipe scanner to read the input
     * @param prompt message to tell user what to input
     * @return returns a boolean true or false for yes or no
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean done = false;
        boolean retVal = false;
        String response = "";
        do
        {
            System.out.print(prompt + "[YyNn]: ");
            response = pipe.nextLine();

            if(response.toUpperCase().matches("[YN]"))
            {
                done = true;
                if (response.equalsIgnoreCase("Y"))
                    retVal = true;
                else // N
                    retVal = false;
            }
            else
                System.out.println("\nYou must enter a [y/n]! \n");

        }while(!done);

        return retVal;
    }

    /**
     * Takes a regEx string and returns a valid match from the user
     * @param pipe Scanner to use for input
     * @param prompt Message to user telling them what is needed for input
     * @param regEx A string that represents a regular expression to use for the test
     * @return a string value that matches the regular expression
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        boolean done = false;
        String response = "";
        do
        {
            System.out.print(prompt + " " + regEx + ": ");
            response = pipe.nextLine();

            if(response.matches(regEx))
                done = true;
            else
                System.out.println("\nYou must enter a string that matches the pattern " + regEx + "!\n");

        }while(!done);

        return response;
    }


}
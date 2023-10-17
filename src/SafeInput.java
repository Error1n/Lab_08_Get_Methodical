import java.util.Scanner;

public class SafeInput
{

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


    // BROKEN SALARY GOES HERE

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

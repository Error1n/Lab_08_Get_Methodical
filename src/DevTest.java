import java.util.Scanner;

public class DevTest
{
    public static Scanner testScan = new Scanner(System.in);

    public static void main(String[] args)
    {
        String firstName = "";
        int age = 0;

        /*

        firstName = SafeInput.getNonZeroLenString(testScan, "Enter your first name");
        System.out.println("Firstname is " + firstName);
         */

        age = getInt(testScan, "Enter your age");
        System.out.println("You said your age is: " + age);
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


}
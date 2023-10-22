import java.util.Scanner;
public class Reggie
{
    public static void main(String[] args)
    {

        String ssn = "";
        String mNumber = "";
        String menuOptions = "";
        Scanner testScan = new Scanner(System.in);

        //gets social security number

        ssn = SafeInput.getRegExString(testScan, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$"); //testing for a social security number
        System.out.println("You said snn is " + ssn);

        //get a UC Student M number using this pattern ^(M|m)\\d{5}$


        mNumber = SafeInput.getRegExString(testScan, "Enter your M number", "^(M|m)\\d{5}$"); //testing for a social security number
        System.out.println("You said M number is " + mNumber);

        //get a menu choice using this pattern ^[OoSsVvQq]$
        menuOptions = SafeInput.getRegExString(testScan, "Choose from the menu options", "^[OoSsVvQq]$");
        System.out.println("You chose: " + menuOptions);


    }
}

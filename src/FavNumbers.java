import java.util.Scanner;
public class FavNumbers
{

    public static Scanner testScan = new Scanner(System.in);

    public static void main(String[] args)
    {
        int favNum = 0;
        double favDouble = 0.0;

        favNum = SafeInput.getInt(testScan, "Enter your favorite number");
        System.out.println("You said your favorite number is: " + favNum);

        favDouble = SafeInput.getDouble(testScan, "Enter your favorite double");
        System.out.println("You said your favorite double is: " + favDouble);


    }



}

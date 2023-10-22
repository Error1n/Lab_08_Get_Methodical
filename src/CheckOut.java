import java.util.Scanner;
public class CheckOut
{

    public static void main(String[] args)
    {
        Scanner testScan = new Scanner(System.in);
        boolean done = false;
        double totalCost = 0.0;


        do
        {
            totalCost = SafeInput.getRangedDouble(testScan, "Enter the price of your item", .50, 10.00);
            done = SafeInput.getYNConfirm(testScan, "Do you have another item?");
        }while(done);

        System.out.printf("The total cost of your items is: %.2f", totalCost);


    }
}
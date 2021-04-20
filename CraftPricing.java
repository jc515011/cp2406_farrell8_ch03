// This application computes a retail price for product costs
import java.util.Scanner;
public class CraftPricing
{
    public static void main(String args[])
    {
        // Declare variables
        double pricePerHour = 12.00;
        double shipping = 7.00;
        String nameProduct = "";
        double costOfMaterials = 0;
        double numberOfHours = 0.00;
        double retailPrice = 0.00;
        // Get user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name of product ");
        input.next(nameProduct);
        System.out.print("Enter cost of materials ");
        input.nextDouble(costOfMaterials);
        System.out.print("Enter hours of work required ");
        input.nextDouble(numberOfHours);
        // Calculate Retail Price
        retailPrice = priceCalculator(costOfMaterials,shipping,pricePerHour,numberOfHours);
        System.out.print("The retail price for " + nameProduct + "\n is $" + retailPrice );
    }
    public static double priceCalculator(double a, double b, double c, double d)
    {
        // retailPrice = costOfMaterials + shipping + (pricePerHour * numberOfHours);
        return a + b + (c * d);
    }
}
// This application computes a student book store credit based upon grade point average
import java.util.Scanner;
public class BookstoreCredit
{
    public static void main(String args[])
    {
        System.out.print("Welcome to Hermosa High School");
        // call methods
        displayMessage(creditCalculator());
    }
    public static String[] creditCalculator()
    {
        // Declare variables
        double gradePoint = 0.00;
        double creditMultiplier = 10.00;
        // Create to string array to pass
        String[] passThis = {"","",""};
        // Get Information via requests
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name ");
        input.next(passThis[0]);
        System.out.print("Enter your Grade Point Average ");
        input.nextDouble(gradePoint);
        // Convert to strings to pass
        String passThis[1] = Double.toString(gradePoint);
        String passThis[2] = Double.toString(creditMultiplier * gradePoint);
        return passThis;
    }
    public static double displayMessage(String[] studentCredit)
    {
        // Output Resault
        System.out.print("Hermosa High School Book Store Credit");
        System.out.print("for Student " + studentCredit[0]);
        System.out.print("with a GPA of " + studentCredit[1]);
        System.out.print("is $ " + studentCredit[2]);
    }
}
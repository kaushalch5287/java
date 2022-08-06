import java.util.Scanner;

public class PowerOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        double a = input.nextDouble();
        System.out.print("enter the power digit: ");
        double b = input.nextDouble();
        input.close();
        System.out.println(Math.pow(a,b));
    }
    
}
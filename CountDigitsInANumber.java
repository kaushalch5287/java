import java.util.Scanner;
public class CountDigitsInANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = input.nextInt();
        input.close();
        int c = 0 ;
        while(a>0){
            c += 1 ;
            a /= 10 ;
        }
        System.out.println("no. of digits: "  + c);
    }
}

import java.util.Scanner;
public class ReverseOfANumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = input.nextInt();
        input.close();
        int c = 0 ;
        int rem = 0 ;
        while(a>0){
            rem = a%10 ;
            a /= 10 ;
            c = c*10 + rem ;
        }
        System.out.println("reverse number: " + c);
    }
}

import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        input.close();
        int a = 0 ;
        int b = 1 ;
        int c = 0 ;
        System.out.print(a );
        System.out.print(" ");
        System.out.print(b );
        System.out.print( " ");
        for(int i = 0 ; i < n ;i++){
            c = a + b ;
            System.out.print(c);
            System.out.print(" ");
            a = b ;
            b = c ;
            c = 0 ;
        }
    }
}

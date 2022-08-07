import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int ae = input.nextInt();
        input.close();
        int a = ae ;
        int s = 0 ;
        int d = 1 ;
        input.close();
        while(a>0){
            double b = a % 10 ;
            a /= 10 ;
            for(int i = 1 ;i <= b ;i++){
                d *= i ;
            }
            s += d ;
            b = 0 ;
            d = 1 ;
        } 
        if(s == ae){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
    }
}

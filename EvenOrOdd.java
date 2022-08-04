import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.print("enter number: ");
        double b = a.nextDouble();
        a.close();
       if(b % 2 == 0){
        System.out.print("even");
       }
       else{
        System.out.print("odd");
       }
    }
}

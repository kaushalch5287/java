import java.util.Scanner;
public class PointOnACircle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the value of x1: ");
        double x1 = input.nextDouble();
        System.out.print("enter the value of y1: ");
        double y1 = input.nextDouble();
        System.out.print("enter the value of x2: ");
        double x2 = input.nextDouble();
        System.out.print("enter the value of y2: ");
        double y2 = input.nextDouble();
        System.out.print("enter the value radius: ");
        double r = input.nextDouble();
        input.close();
        double z = Math.pow((Math.pow((x2 - x1),2) +  Math.pow((y2 - y1),2)),0.5) ;
        if(z > r){
            System.out.print("outside");
        }
        else if(z < r){
            System.out.print("inside");
        }
        else if(z == r){
            System.out.print("on circle");
        }
        else{
            System.out.print("invalid point");
        }
       }
}
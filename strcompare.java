//String comparison
import java.util.Scanner;
class strcompare
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.print("Enter String First: ");
String s1 = in.nextLine();
System.out.print("Enter String Second: ");
String s2 = in.nextLine();
if((s1.equals(s2)) == true)
System.out.println("both are same");
else
System.out.println("not same");
}
}


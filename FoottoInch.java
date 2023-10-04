import java.util.Scanner;
class FoottoInches{
public static void main(String args[])
{
double foot,result;
Scanner sc = new Scanner(System.in);
System.out.println("enter foot to convert = ");
foot = sc.nextDouble();
result = 12*foot;
System.out.println("foot to inchs conversion ="+result);
}
}

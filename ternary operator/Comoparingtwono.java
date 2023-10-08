import java.util.*;
class Comoparingtwono{
    public static void main(String args[])
    {
        int num1,num2,max;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the value of two  no.");
        num1=sc.nextInt();
        num2=sc.nextInt();
        max=num1>num2?num1:num2;
        System.out.println("max ="+max);

    }
}
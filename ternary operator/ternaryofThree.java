import java.util.*;
class  ternaryofThree{
    public static void main (String args[]){
        double x,y,z,max;
        Scanner sc=new Scanner (System.in);
    System.out.println("enter the value of three no.");
    x=sc.nextDouble();
    y=sc.nextDouble();
    z=sc.nextDouble();
    max=(x>y)?(x>z?x:z):(y>x?y:z);
    System.out.println("max"+max);

    }
}

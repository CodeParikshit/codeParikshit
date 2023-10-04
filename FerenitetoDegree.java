import java.util.*;
class FerenitetoDegree{
public static void main(String args[])
{
double Fer,degreecel,cal;
Scanner sc = new Scanner (System.in);
System.out.println("enter the Fer");
Fer = sc.nextDouble();
cal=Fer-32;

degreecel=cal*0.55;
System.out.println("conversion from ferenite to degree cel = "+degreecel);
}
}
 
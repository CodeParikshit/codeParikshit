import java.util.*;
class MetertoKm{
public static void main(String args[])
{
double meter,cm,kilo,kilometer;
Scanner sc = new Scanner (System.in);
System.out.println("enter the meter");
meter= sc.nextDouble();
System.out.println("enter the cm");
cm= sc.nextDouble();
kilometer=0.001*meter;
kilo=0.00001*cm;
System.out.println("conversion of meter to km  = "+kilometer);
System.out.println("conversion of cm to kilometer ="+kilo);
}
}
 
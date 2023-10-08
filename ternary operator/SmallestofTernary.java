import java.util.*;
class SmallestofTernary {
public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int x,y,min;
    System.out.println("enter the value of two integer");
    x=sc.nextInt();
    y=sc.nextInt();
    min=x<y?x:y;
    System.out.println(min);
    }
}

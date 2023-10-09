import java.util.*;
class patternTest3{
public static void main(String args[]){
Scanner sc = new Scanner (System.in);
System.out.println("enter no. of rows");
int num = sc.nextInt(); 
for (int i =1;i<=num;i++){ //i is for rows 
for (int j =num;j>=i;j--){ //j is for column
System.out.print("*");

}
System.out.println();
}
}
}
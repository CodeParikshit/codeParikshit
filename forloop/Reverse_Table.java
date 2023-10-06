import java.util.*;
class Reverse_Table{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the value of no. to print the table ");
int n=sc.nextInt();
int i,c;
for (i=10;i>=1;i--){

System.out.println(n+"*"+i+"="+(i*n));
}
}
}

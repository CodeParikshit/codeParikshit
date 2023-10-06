import java.util.*;
class Tables{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the value of no. to print the table ");
int n=sc.nextInt();
int i,c;
for (i=1;i<=10;i++){

System.out.println(n+"*"+i+"="+(i*n));
}
}
}

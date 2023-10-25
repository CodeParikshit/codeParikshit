import java.util.*;
class Simplearray3{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the elements in an array");
int n = sc.nextInt();
int[] marks= new int[n];
System.out.println("enter the no. to be enetr in an array");
for(int i=0;i<n;i++){
marks[i]=sc.nextInt();
}
System.out.println("enterd marks are");
for(int i=0;i<marks.length;i++){
System.out.println(marks[i]);
}
}
}


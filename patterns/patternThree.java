import java.util.*;
class patternThree{
public static void main(String args[]){
Scanner sc = new Scanner (System.in);
System.out.println("enter no. of rows");
int num = sc.nextInt(); 
for (int i =1;i<=num;i++){ 
//i is for rows 
for (int j =num-1;j>=i;j--)//j is for column
{ 
System.out.print(" ");

}
for(int k=1;k<=i;k++){
System.out.print("*");
}
System.out.println();
}

}
}
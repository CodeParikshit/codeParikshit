import java.util.Scanner;
class CheckNumbers{
static int Digitcounter(int n){
int count =0;
while(n>0){
n=n/10;
count++;
}
return count;
}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int n = sc.nextInt();
System.out.println(Digitcounter(n));
}
}



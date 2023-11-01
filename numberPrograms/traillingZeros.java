import java.util.Scanner;
class traillingZeros{
static int tralling(int n){
int res=0;
int powerof5=5;
while(n>=powerof5){
res=res+(n/powerof5);
powerof5 = powerof5 * 5;
}
return res;
}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enetr the value of n");
int n = sc.nextInt();
System.out.println(tralling(n));
}
}


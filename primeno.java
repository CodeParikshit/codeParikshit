import java.util.Scanner;
class primeno{
static boolean isprime(int n){
for(int i=2;i<=n/2;i++){
if(n%i==0){
return false;
}
}
return true;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
System.out.println(isprime(n));
}
}

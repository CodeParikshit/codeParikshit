import java.util.Scanner;
class gcdandlcmByEUCLLIDE{
static int Eucllide(int a, int b){
while(a!=b){
if(a>b){
a=a-b;
}
else{
b=b-a;
}
}
return a;//we can return any value because any no. is same at the time....
}



public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println(Eucllide(a,b));
}
}


import java.util.Scanner;
class rotateArray{
static void RotateArray(int a[]){
int temp;
temp=a[0];
for(int i =1;i<a.length;i++){
a[i-1]=a[i];
}
a[a.length-1]=temp;
}

public static void main(String args[]){
Scanner sc = new Scanner (System.in);
System.out.println("enter the size of the array");
int size = sc.nextInt();
System.out.println("enter the elements in an array");
int a[]=new int[size];
for(int i=0;i<size;i++){
a[i]=sc.nextInt();
}
RotateArray(a );
System.out.println("array after the rotation is ");
for(int i=0;i<a.length;i++){
System.out.println(a[i]);
}
}
}


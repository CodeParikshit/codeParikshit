import java.util.Scanner;
class selectionSort{
public static void main (String args[]){
int i;
int j;
int temp =0;
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of an array");
int size = sc.nextInt();
int[] a = new int[size];
System.out.println("enter the elements in an array");
for(i=0;i<a.length;i++){
a[i]=sc.nextInt();
}
for(i= 0; i<a.length;i++){
for(j=i+1;j<a.length;j++){
if(a[i]>a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("Array after sorting is");
for(j=0;j<a.length;j++){
System.out.println(a[j]);
}
}
}


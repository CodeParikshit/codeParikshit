import java.util.Scanner;
class BubbleSort{
public static void main(String args[]){
int i;
int j;
int k;
int temp;
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of an array");
int size=sc.nextInt();
int[] arr= new int[size];
System.out.println("enter the elements of an array");
for(i =0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
for(i=arr.length-1 ;i>0;i--){
for(j=0;j<arr.length;j++){
for(k=j+1;k<arr.length;k++){
if(arr[j]>arr[k]){
temp=arr[j];
arr[j]=arr[k];
arr[k]=temp;
}
}
}
}
System.out.println("array after applying the bubble sort");
for(k=0;k<arr.length;k++){
System.out.println(arr[k]);
}
}
}

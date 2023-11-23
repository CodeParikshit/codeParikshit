import java.util.Scanner;
class test002{
public static void main(String args[]){
Scanner sc = new Scanner (System.in);
int arr[] = new int[10];
int i , l=0, u=9, mid=0, count =0;
System.out.println("enter the value in ascending sorted order");
for(i = 0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
System.out.println("enetr the serching number");
int search = sc.nextInt();
while(l<u){
mid= (l+u)/2;
if(arr[mid]>search){
u=mid-1;
}
else if(arr[mid]<search){
l=mid+1;
}
else{
count++;
break;
}
}
if(count ==1){
System.out.println("search no. "+search +"found in"+(mid+1));
}
else{
System.out.println("not found");
}
}
}








//you are givebn an integer arrayy a of size N now tghe array a of size N should be sorted in non decending order. you are also given an integfer target , now your task is to find the //target inside the array (note you must write an algoirithjm with complexity of 0(n) ;
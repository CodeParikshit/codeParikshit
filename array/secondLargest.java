class secondLargest{
public static void main(String args[]){
int temp;
int a[]={8,25,1,22,48,6};
for(int i=0;i<a.length;i++){
for(int j=i+1;j<a.length;j++){
if(a[i]>a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println();
System.out.println("Assending order of array is");
for(int i=0;i<a.length;i++){
System.out.println(a[i]);
}
System.out.println("largest element in an array is ");
System.out.println(a[a.length-1]);
System.out.println("second largest element is ");
System.out.println(a[a.length-2]);
System.out.println("Smallest element in an array is ");
System.out.println(a[a.length-6]);
System.out.println("Second smallest element");
System.out.println(a[a.length-5]);
}
}

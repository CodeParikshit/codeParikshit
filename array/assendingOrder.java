class assendingOrder{
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
}
}

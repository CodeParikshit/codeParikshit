class LargestElement01{
public static void main(String args[]){
int a[]=new int[]{10,20,30,10,50,100};
int max=a[0];
for(int i=0;i<a.length;i++){
if(a[i]>max){
max=a[i];
}
}
System.out.println(max);
}
}

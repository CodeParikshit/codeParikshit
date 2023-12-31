class descendingOrder{
public static void main(String args[]){
int temp;
int b[]={77,3,4,12,21,34,43};
for(int i=0;i<b.length;i++){
for(int j=i+1;j<b.length;j++){
if(b[i]<b[j]){
temp=b[i];
b[i]=b[j];
b[j]=temp;
}
}
}
System.out.println("elements in decending order are");
for( int i =0;i<b.length;i++){
System.out.println(b[i]);
}
}
}

class RemovedupicateElements {
static int Duplicates(int ar[]){
int rd = 0;
for(int i=1;i<ar.length;i++){
if(ar[rd]!=ar[i]){
rd++;
ar[rd]=ar[i];
}
}
return rd+1;
}
public static void main(String args[]){
int ar[]={1,2,2,3,4,4,5,6,6};
System.out.println("array before removing duplicates is");
for(int i =0;i<ar.length;i++){
System.out.print(ar[i] +" ");
}
System.out.println();
int rd=Duplicates(ar);
System.out.println("array after removing the duplicates");
for(int i=0;i<rd;i++){
System.out.print(ar[i] +" ");
}
}
}
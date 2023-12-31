public class checkArrayisassending{
static boolean isSorted(int ar[]){
for(int i=1;i<ar.length;i++){
if(ar[i]<ar[i-1]){
return false;
}
}
return true;
}
public static void main(String args[]){
int ar[]={0,2,14,5434,8,102,222};
System.out.println(isSorted(ar));
}
}

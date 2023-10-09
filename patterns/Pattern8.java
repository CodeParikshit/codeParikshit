class Pattern8{
public static void main(String args[]){
int k=0;
int num=5;
for(int i=1;i<=num;i++){
char ch =(char)(64+k);
for(int j=num;j>=i;j--){
System.out.print(ch+" ");
ch++;
}
k++;
System.out.println();
}
}
}


import java.util.Scanner;
class SearchingnoInsidearray{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of an array");
int size = sc.nextInt();
int[] mar=new int[size];
System.out.println("enter the value of an array");
for(int i=0;i<size;i++){
mar[i]=sc.nextInt();
}

System.out.println("enter the value for search in array");
int x = sc.nextInt();
for(int i =0; i<mar.length;i++){
if(mar[i]==x){
System.out.println("index /position of that value is"+" " + i);
}
System.out.print(mar[i] +" ");
}
}
}

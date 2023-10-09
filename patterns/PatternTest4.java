import java.util.Scanner;
class PatternTest4{
public static void main(String args[]){
int num=4;


char ch = 'a';
for(int i=1;i<=num;i++){
for(int j=num-1;j>=i;j--){
System.out.print(" ");
}
for (int k =1;k<=i;k++){
System.out.print((char)(ch+i*2-2));
}
System.out.println();
}
}
}



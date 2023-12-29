import java.util.Scanner;
class reverse_word_two{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
String[] str_arr= str.split(" ");
String reverse_String = "";
for(int i =0;i<str_arr.length;i++){
String word = str_arr[i];
String Reverse_word="";
for(int j =word.length()-1;j>=0;j--){
Reverse_word = Reverse_word + word.charAt(j);
}
reverse_String = reverse_String + Reverse_word +" ";
}
System.out.println(reverse_String);
}
}

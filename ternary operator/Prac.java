import java.util.*;
class Prac{
public static void main(String args[]){
String grade;
Char a,b,c;
Scanner sc = new Scanner(System.in);
System.out.println("enter the mark");
grade=sc.nextString();
String grade = (grade >= 90) ? "a" : (grade >= 80) ? "b" : "c";
System.out.println("result="+grade);
}
}

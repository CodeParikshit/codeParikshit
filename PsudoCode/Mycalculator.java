import java.util.*;
interface calculator{
void add();
void sub();
}

class calculator1 implements calculator{
public void add(){
int a = 20;
int b = 10;
int c = a+b;
System.out.println("addition is "+c);
}
public void sub(){
int a = 20;
int b = 10;
int c = a-b;
System.out.println("Substraction is "+c);
}
}

class calculator2 implements calculator{
public void add(){
Scanner sc = new Scanner (System.in);
System.out.println("enter the first element");
int a = sc.nextInt();
System.out.println("enter the second element");
int b = sc.nextInt();
int c = a+b;
System.out.println("addition is "+c);
}
public void sub(){
Scanner sc = new Scanner(System.in);
System.out.println("enter the first element");
int a = sc.nextInt();
System.out.println("enete the second element");
int b = sc.nextInt();
int c = a+b;
System.out.println("sub" +c);
}
}

class calculator3 implements calculator{
public void add(){
Scanner sc = new Scanner (System.in);
System.out.println("enter the first element");
int a = sc.nextInt();
System.out.println("enter the second element");
int b = sc.nextInt();
if(b==0){
System.out.println("B element is zero");
}
else{
int c = a+b;
System.out.println("addition is "+c);
}
}
public void sub(){
Scanner sc = new Scanner (System.in);
System.out.println("enter the first element");
int a = sc.nextInt();
System.out.println("enter the second element");
int b = sc.nextInt();
if(b==0){
System.out.println("b value is zero");
}
else{
int c = a-b;
System.out.println("substraction"+c);
}
}
} 
class Mycalculator{
public static void main(String args[]){
calculator1 c1 = new calculator1();
calculator2 c2 = new calculator2();
calculator3 c3 = new calculator3();

c1.add();
c1.sub();

c2.add();
c2.sub();

c3.add();
}
}







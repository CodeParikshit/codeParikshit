import java.io.*;
class test01{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String stu [] = new String[5];
int s1 [] = new int[5];
int s2 [] = new int[5]; //takingb the input of marks
int s3 [] = new int[5];
int s4 [] = new int[5];
int s5 [] = new int[5];
//for taking input
for (int i = 0; i<stu.length;i++){
System.out.println("enter the  name of student");
stu[i] = br.readLine(); //taking the input of name
System.out.println("enetr the marks of the students");
s1[i] = Integer.parseInt(br.readLine()); //here we are converting the string value to the integer value.and displaying the marks
s2[i] = Integer.parseInt(br.readLine());
s3[i] = Integer.parseInt(br.readLine()); 
s4[i] = Integer.parseInt(br.readLine());
s5[i] = Integer.parseInt(br.readLine());
}
//executing output
for(int i = 0 ; i<stu.length;i++){
int total = 0;
double percentage= 0.0;
total = s1[i]+s2[i]+s3[i]+s4[i]+s5[i];
percentage = total/5;
System.out.println("student = "+stu[i]);
System.out.println("percentage = " +percentage); 
}
}
}



class NumberPattern4{
public static void main(String args[])
{
int c;
for(int i=1;i<=5; i++)
{
for(int j =1; j<=5; j++)
{
c=i*j;
if(c<10)
{
System.out.print("0");
}
System.out.print(c +" ");
}
System.out.println();
}
}
}

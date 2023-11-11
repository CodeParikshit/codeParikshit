package firstexample;

class demo{
public static void main(String args[]){
int deno[]= {500,200,100,50,20,10,5,2,1}; //array to store denomatation.
int rup = 3546;
int div,i;
for(i=0;rup>0;i++){
if(rup/deno[i]>0)
{
div = rup/deno[i];
System.out.println(deno[i]+"*"+div+"="+div*deno[i]);
rup = rup-(div*deno[i]);
}
}
}
}

class CallbyReference{
String name;
float milage;
int cost ;
public static void main(String args[]){

CallbyReference obj = new CallbyReference();
obj.name= "bmw";
obj.milage =25.2f;
obj.cost = 75;

System.out.println(obj.name);
System.out.println(obj.milage);
System.out.println(obj.cost);

CallbyReference b=obj;

System.out.println(b.name);
System.out.println(b.milage);
System.out.println(b.cost);

b.name = "tata";
b.milage= 28.23f;
b.cost = 13;

System.out.println(b.name);
System.out.println(b.milage);
System.out.println(b.cost);
 
System.out.println(obj.name);
System.out.println(obj.milage);
System.out.println(obj.cost);
}
}

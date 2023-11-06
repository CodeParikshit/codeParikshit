class animal { 
 static void doStuff() { 
 System.out.print("a "); 
 } 
}
class Dog extends animal {
 static void doStuff() { // it's a redefinition,
 // not an override
 System.out.print("d "); 
 }
 public static void main(String [] args) {
 animal [] a = {new animal(), new Dog(), new animal()};
 for(int x = 0; x < a.length; x++)
 a[x].doStuff(); // invoke the static method
 }
}
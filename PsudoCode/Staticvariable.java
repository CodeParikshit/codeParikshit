class Staticvariable{
 int frogCount = 0; // Declare and initialize 
 // instance variable
 public Staticvariable() {
 frogCount += 1; // Modify the value in the constructor
 }
 public static void main (String [] args) {
 new Staticvariable();
 new Staticvariable();
 new Staticvariable();
 System.out.println("Frog count is now " + frogCount);
 }
}

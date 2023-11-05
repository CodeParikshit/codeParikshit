class StaticProblems1 {
 static int frogCount = 0; // Declare and initialize 
 // static variable
 public StaticProblems1() {
 frogCount += 1; // Modify the value in the constructor
 }
 public static void main (String [] args) {
 new StaticProblems1();
 new StaticProblems1();
 new StaticProblems1();
 System.out.println("Frog count is now " + frogCount);
 }
}
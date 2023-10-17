
            private void privateMethod() {
                System.out.println("Hi, this is privateMethod");
            }
        
            private static void staticPrivateMethod() {
                System.out.println("Hi, this is staticPrivateMethod");
            }
        
            static void staticMethod() {
                //privateMethod();    
               // Non-static method cannot be referenced from a static contex
                System.out.println("Hi, this is staticMethod");
                staticPrivateMethod();
            }
        
            default void defaultMethod() {
                System.out.println("Hi, this is defaultMethod");
            }
        }
        
    
    public class difference2 implements MyInterface{
        public static void main(String[] args) {
    
            MyInterface.staticMethod();
            // myInterface.staticMethod(); // Not allowed
    
            MyInterface myInterface = new MyInterfaceImpl();
            myInterface.defaultMethod();
            // MyInterface.defaultMethod(); // Not allowed
    
        }
    }
}

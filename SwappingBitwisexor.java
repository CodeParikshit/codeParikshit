import java.util.*;

class Swapping {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = 10, b = 20;
        System.out.println("the value a= " + a);
        System.out.println("the value of b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("after swapping a = " + a);
        System.out.println("after swapping b = " + b);
    }
}

import java.util.*;

class Swapping {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = 10, b = 20;
        System.out.println("before swapping =" + a);
        System.out.println("before swapping = " + b);
        a = a + b - (b = a);
        System.out.println("after swapping a " + a);
        System.out.println("after swapping = " + b);
    }
}

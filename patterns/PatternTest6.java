import java.util.Scanner;

class PatternTest6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int n = sc.nextInt();
        for (int i = 1; i <= n - 1; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }

            System.out.print();
        }
        for (int i = 2; i <= 0; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

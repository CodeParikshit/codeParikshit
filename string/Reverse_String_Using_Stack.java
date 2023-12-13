import java.util.Scanner;
import java.util.Stack;
public class Reverse_String_Using_Stack{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any string");
		String str = sc.nextLine();
		Stack<Character> stack = new Stack<>();
		for(int i =0;i<str.length();i++) {
			stack.push(str.charAt(i));
		}
		System.out.println("reverse string is");
		while(!stack.empty()) {
			System.out.print(stack.pop());
		}
		
	}
}
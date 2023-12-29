import java.util.Scanner;
public class reverse_each_word_inside_sentence {
	public static void main(String args[]) {
		int i,j;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter any sentence");
		String str = sc.nextLine();
		
		for(i=0;i<str.length();i=j+1) {
			String world =" ";
			for( j=0;j<str.length() && str.charAt(j)!=' ';j++) {
				world=world+str.charAt(j);
			}
			StringBuffer str1 = new StringBuffer(str);
			str1.reverse();
			String Str01=str1.toString();
			System.out.print(Str01);
		}
	}
}
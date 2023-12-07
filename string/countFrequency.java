
import java.util.Scanner;

public class countFrequency {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		String sentence = sc.nextLine();
		int i, j , an = 0 , and = 0;
		int len = sentence.length();
		for(i = 0 ;i < len; i=j+1) {
			String word = "";
			for(j =i;j<len &&sentence.charAt(j)!=' ';j++) {
				word = word +sentence.charAt(j);
				}
			if(word.equalsIgnoreCase("an")) {
				an++;
			}
			if(word.equalsIgnoreCase("and")) {
				and++;
			}
		}
		System.out.println("an = "+an);
		System.out.println("and = "+and);
	}

}

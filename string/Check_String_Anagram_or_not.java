
import java.util.Arrays;
public class Check_String_Anagram_or_not {
	public static void main(String args[]) {
		String s1 = "listen";
		String s2 = "silenz";
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		if(c1.length!=c2.length) {
			System.out.println("length of two string is not equal, so ity is not anagram");
		}
		Arrays.sort(c1);
		Arrays.sort(c2);
		for(int i=0;i<c1.length;i++) {
			for(int j=0;j<c2.length;j++) {
				if(c1[i]==c2[j]) {
					System.out.println("strings are anagram string");
					System.exit(0);
				}
				else {
					System.out.println("string are not anagram string");
					System.exit(0);
				}
		}
	}
	}

}

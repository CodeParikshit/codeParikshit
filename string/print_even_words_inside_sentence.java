
public class print_even_words_inside_sentence {
	public static void main(String args[]) {
		String s= " where are your living";
		String[] str=s.split(" ");
		for(String x:str) {
			if(x.length()%2==0) {
				System.out.println(x);
			}
		}
	}

}

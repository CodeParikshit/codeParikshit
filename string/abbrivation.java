import java.util.Scanner;
public class abbrivation {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter your name");
		String name = sc.nextLine();
		int i;
		String abbr = name.charAt(0)+".";
		int first = name.indexOf(' '); //we are taking space after the first value of space
		int last = name.lastIndexOf(' '); // we are taking  the space before the last index
		for(i = first+1;i<last;) {
			abbr = abbr +name.charAt(i)+". ";
			int d = name.indexOf(' ',i);//meaning of " ", i is i se aapko aage badna hai jab tak space na mile.
			i = d+1;
			
		}
		abbr = abbr +name.substring(last+1);//now we have got all the abrivation and we only want kalam.
		System.out.println("mr. "+abbr); 
		
		
		
	}

}
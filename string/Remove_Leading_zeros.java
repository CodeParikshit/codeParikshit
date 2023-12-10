public class Remove_Leading_zeros {
		public static void main(String args[]) {
			String s = new String("000123043");
		
			int i=0;
			while(i<s.length()&&s.charAt(i)=='0')
				i++;
			StringBuffer s1 = new StringBuffer(s);
			s1.replace(0,i,"");
			s1.toString();
			System.out.println(s1);
		}

	}



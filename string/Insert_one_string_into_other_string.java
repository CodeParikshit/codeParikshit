class Insert_one_string_into_other_string {
	public static void main(String args[]) {
		String s = "computer and engineering";
		String s2="science";
		int index=8;
		System.out.println("your first string is"+s);
		System.out.println("your second string is"+s2);
		System.out.println("your index is"+index);
		String result = new String();
		for(int i =0;i<s.length();i++) {
			result = result+s.charAt(i);
			if(i==index) {
				result =result+s2+" ";
				}
			}
		System.out.println(result);
	}

}

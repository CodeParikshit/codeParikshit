class Replace_char_at_Specific_index {
	public static void main(String args[]) {
		String s = "geeks gor geeks";
		int index =6;
		char ch = 'f';
		StringBuffer String = new StringBuffer(s);
		String.setCharAt(index, ch);
		System.out.println("modified string is "+String);
		
	}

}

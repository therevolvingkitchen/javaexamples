package com.mytest;


public class FindSubString {

	public static void main(String[] args) {
		String input="adfasdf afadf adfadf";
		String key="asdf";
		
		int index=new FindSubString().findSubString(input.toCharArray(), key.toCharArray());
		System.out.println("index 1="+index);
		
		 index=new FindSubString().findSubString2(input, key);
		System.out.println("index 2="+index);
	}
	
	int findSubString(char[] input, char[] key) {
		if (input.length<key.length)
			return -1;
		
		for (int i = 0; i < (input.length-key.length+1); i++) {
			
			for (int j = 0; j < key.length; j++) {
				if (input[i+j]!=key[j]) {
					break;
				}
				if (j==key.length-1)
					return i;
			}
		}
		
		return -1;
	}

	int findSubString2(String input, String key) {
		if (input.length()<key.length())
			return -1;
		
		for (int i = 0; i <= (input.length()-key.length()); i++) {
			
			for (int j = 0; j < key.length(); j++) {
				if (input.charAt(i+j)!=key.charAt(j)) {
					break;
				}
				if (j==key.length()-1)
					return i;
			}
		}
		
		return -1;
	}
}

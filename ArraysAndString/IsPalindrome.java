package ArraysAndStrings;

import java.util.HashMap;

public class IsPalindrome {

	public static void main(String[] args) {
		String str = "aaabbbaaa";
		IsPalindrome iP = new IsPalindrome();
		System.out.println(iP.IsPalindrome(str));
	}
	
	boolean IsPalindrome(String str){

		HashMap<Character, Integer> hash = new HashMap<>();
		int counter = str.length();
		for(int i = 0 ; i < counter ; i++){
	 		if(hash.containsKey(str.charAt(i))){
				hash.put(str.charAt(i), hash.get(str.charAt(i)) + 1);
			}
			else{
				hash.put(str.charAt(i), 1);
			}
		}
		
		int count = 0;
		for(Character c: hash.keySet()){
			if(hash.get(c) % 2 == 1) count++;
		}

		if(counter % 2 == 0 && count == 0) return true;
		if(count == 1) return true;
		return false;
	}
	
}


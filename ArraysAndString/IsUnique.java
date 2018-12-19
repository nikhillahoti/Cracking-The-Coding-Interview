package ArraysAndStrings;

import java.util.HashSet;

public class IsUnique {

	public static void main(String[] args) {
		IsUnique iUQ = new IsUnique();
		System.out.println(iUQ.IsUniqueWithSpace("abcd"));
		System.out.println(iUQ.IsUniqueWithOutSpace("abcd"));
	}
	
	public boolean IsUniqueWithSpace(String str) {
		HashSet<Character> unique = new HashSet<>();
		int counter = str.length();
		for (int i = 0 ; i < counter ; i++) {
			if(unique.contains(str.charAt(i))) return false;
			unique.add(str.charAt(i));
		}
		return true;
	}
	
	public boolean IsUniqueWithOutSpace(String str) {
		int counter = str.length();
		for (int i = 1 ; i < counter ; i++) {
			for(int j = 0 ; j < i ; j++) {
				if (str.charAt(i) == str.charAt(j)) return false;
			}
		}
		return true;
	}
	
}


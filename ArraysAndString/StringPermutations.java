package ArraysAndStrings;

public class StringPermutations {

	public static void main(String[] args) {
		
		String str1 = "abcd";
		String str2 = "abdcc";
		
		StringPermutations sP = new StringPermutations();
		System.out.println(sP.IsPermutation(str1, str2));
	}
	
	public boolean IsPermutation(String str1, String str2) {
	
		if(str1.length() != str2.length()) return false;
		
		int freq [] = new int[26];
		
		for(int i = 0 ; i < str1.length() ; i++) {
			freq[str1.charAt(i) - 97]++;
		}
		
		for(int i = 0 ; i < str1.length() ; i++) {
			freq[str1.charAt(i) - 97]--;
		}
		
		for(int i = 0 ; i < 26 ; i++) 
			if (freq[i] != 0) return false;
		
		return true;
	}
	
}


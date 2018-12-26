package ArraysAndStrings;

public class URLify {

	public static void main(String[] args) {
		String str = "MR John Smith    ";
		URLify URL = new URLify();
		System.out.println(URL.URLifyy(str));
	}
	
	String URLifyy(String str){
		String replacedString = "020";
		char []str1 = str.toCharArray();
		int k = 0;
		for(int i = 0 ; i < str.length() ; i++){
			if(str.charAt(i) == ' '){
				for(int j = 0 ; j < replacedString.length() ; j++){
					str1[k++] = replacedString.charAt(j);
				}	
			}
			else {
				str1[k++] = str.charAt(i);	
			}
			if (k == str.length()) break;
		}
		return String.valueOf(str1);
	}
	
}


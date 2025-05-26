package PracticeQuestions;

public class Palindrom {

	public static void main(String[] args) {
		
		String str = "Anna";
		
		System.out.println(checkPalindrom(str));
		
	}

	private static String checkPalindrom(String str) {
		
		String lower =str.toLowerCase();
		char[] arr = lower.toCharArray();
		
		int start=0;
		int end=str.length()-1;
		
		while(start<end) {
			if(arr[start]==arr[end]) {
				start++;
				end--;
			}else {return "Not Palindrom";}
		}
		
		return "Its Palindrom";
	}

}

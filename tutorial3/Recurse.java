public class Recurse {
	public static void main(String args[]) {
		printBackward("Sameer");		
		System.out.println(reverseString("Jagdale"));		
	}
	
	public static void printBackward(String str) {
		for(int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}

	public static String reverseString(String str) {
		String revStr = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}
		return revStr;
	}
		
}

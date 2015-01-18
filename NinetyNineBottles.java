public class NinetyNineBottles {
	public static void main(String args[]) {
		for(int i = 99; i >=1; i--) {
			System.out.println(i + " Bottles of Beer of on the wall." +
			i + " Bottles of Beer." + "ya’ take one "
			+ "down, ya’ pass it around,"+ (i-1)  + 
			" bottles of beer on the wall.");
		}
		
		System.out.println("No bottles of beer on the wall, no bottles of beer, ya’ can’t take" +
			" one down, ya’ can’t pass it around, ’cause there are no more" +
			" bottles of beer on the wall!");
	}
}

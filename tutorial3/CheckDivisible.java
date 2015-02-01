class CheckDivisible {
	public static void main(String args[]) {
		if (checkDivisible(9,3)) {
			System.out.println("Divisible");	
		} else {
			System.out.println("Not divisible");
		}
	}

	public static boolean checkDivisible(int a, int b) {
		if (a % b == 0) {
			return true;
		}
		return false;
	}
}

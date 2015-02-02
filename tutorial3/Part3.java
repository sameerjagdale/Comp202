public class Part3 {
	public static void main(String args[]) {
		int[] arr = {2,6,8,12,10};
		System.out.println(areFactor(arr,3));
	}
	
	public static boolean areFactor(int[] arr, int n) {
		for(int i = 0; i < arr.length;i++) {
			if(arr[i] % n != 0) {
				return false;
			}
		}
		return true;
	}	

}

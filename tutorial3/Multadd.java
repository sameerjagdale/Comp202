public class Multadd{

	public static double multadd(double a, double b, double c) {
		return a*b+c;
	}
	
	public static void main(String args[]) {
		double a = 3.3, b = 3.0, c = 4.0;
		double d = multadd(a,b,c);
		System.out.println(d);
	}
}

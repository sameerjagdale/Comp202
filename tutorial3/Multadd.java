public class Multadd{

	public static double multadd(double a, double b, double c) {
		return a*b+c;
	}
	
	public static void main(String args[]) {
		double a = 3.3, b = 3.0, c = 4.0;
		double d = multadd(a,b,c);
		System.out.println(d);
		System.out.println(multadd((double)1,Math.sin(Math.PI/4), 
			(Math.cos(Math.PI/4))/2));
		System.out.println(multadd((double)1,Math.log10(10), Math.log10(20)));
		System.out.println(yikes(10));
	}
	
	public static double yikes(double x) {
		return multadd(x,Math.exp(-x),
			Math.sqrt(1-Math.exp(-x)));
	}
}

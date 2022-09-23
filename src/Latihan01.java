
public class Latihan01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			float r;
			int c, f, k;
			c = 90;
			
			CelciusToFahrenheit();
			r = CelciusToReanmur();
			k = CelciusToKelvin(c);
			System.out.println("convert celcius to reanmur");
			System.out.println("r = " + r);
			
			System.out.println("convert celcius to kelvin");
			System.out.println("k = " + k);
	}

	static void CelciusToFahrenheit() {
		int c = 90;
		int f = (9/5 * c) + 32;
		System.out.println("Convert Celcius To Fahrenheit");
		System.out.println("c = " + c);
		System.out.println("f = " + f);
	}
	
	static float CelciusToReanmur() {
		int c = 90;
		int r = (5/4 * c);
		return r;
	}
	
	static int CelciusToKelvin(int c) {
		int k = (c + 273);
		return k;
	}
}

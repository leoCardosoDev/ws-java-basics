import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String produtc1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		
		System.out.printf("Products:%n%s wich price is $ %.2f %n%s, wich price is $ %.2f%n%n", produtc1, price1, product2, price2 );
		System.out.println("Record " + age + " years old, code " + code +  " and gender: " + gender);
		
		System.out.printf("Measure with eigth decimal places: %f", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f %n", measure);
		
		int x, y;
		double z;
		x = 5;
		z = 2 * x;
		
		System.out.println(x);
		System.out.println(z);
		
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		
		int a, c;
		double resultado;
		a = 5;
		c = 2;
		
		resultado = (double) a / c;
		
		System.out.println(resultado);
		
		
		double ac;
		int b4;
		
		ac = 5.0;
		b4 = (int)ac;
		
		System.out.println(b4);
		

	}

}

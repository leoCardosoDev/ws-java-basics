package entada_de_dados;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/**
		String x;
		x = sc.next();
		System.out.println("Você digitou " + x);
		**/
		
		/**
		int x;
		x = sc.nextInt();
		System.out.println(x * 2);
		sc.close();
		**/
		/**
		double x;
		x = sc.nextDouble();
		System.out.printf("Voce digitou: %.2f%n", x);
		**/
		
		/**
		char x;
		x = sc.next().charAt(0);
		System.out.println("Você digitou " + x);
		**/
		
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Você digitou: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}

}

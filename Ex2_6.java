import java.util.Locale;
import java.util.Scanner;
public class Ex2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a,b,c;
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		System.out.printf("Area do triangulo base A e altura C %.3f%n", (a * c)/2);
		System.out.printf("Area do circulo de raio C %.3f%n",3.14159 * Math.pow(c,2));
		System.out.printf("Area do trapezio de bases A e B e altura C %.3f%n",((a+b)*c)/2);
		System.out.printf("Area quadrado de lado B %.3f%n", Math.pow(b,2));
		System.out.printf("Area do retangulo de lado A e B %.3f%n", a * b);
		
	
		sc.close();
		}

}

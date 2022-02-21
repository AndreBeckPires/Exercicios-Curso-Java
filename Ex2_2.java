import java.util.Scanner;
import java.util.Locale;
public class Ex2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159, area,raio;
		System.out.println("Digite o raio do circulo: ");
		raio = sc.nextDouble();
		area = pi * (Math.pow(raio, 2));
		System.out.printf("Area = %.4f",area);
		sc.close();

	}

}

import java.util.Locale;
import java.util.Scanner;
public class Ex3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double entrada;
		entrada = sc.nextDouble();
		
		if(entrada >= 0 && entrada <= 25)
		{
			System.out.printf("Intervalo [0,25]");
		}
		else if(entrada > 25 && entrada <= 50)
		{
			System.out.printf("Intervalo (25,50]");
		}
		else if(entrada > 50 && entrada <= 75)
		{
			System.out.printf("Intervalo (50,75]");
		}
		else if(entrada > 75 && entrada <= 100)
		{
			System.out.printf("Intervalo (75,100]");
		}
		else
		{
			System.out.printf("Fora do intervalo");
		}
		sc.close();
	}

}

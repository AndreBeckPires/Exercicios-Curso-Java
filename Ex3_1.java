
import java.util.Scanner;
public class Ex3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int entrada;
		entrada = sc.nextInt();
		if(entrada >= 0)
		{
			System.out.printf("Não negativo");
		}
		else {
			System.out.printf("Negativo");
		}
		
		sc.close();
	}

}

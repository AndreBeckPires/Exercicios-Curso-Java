import java.util.Scanner;
public class Ex3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int entrada;
		entrada = sc.nextInt();
		if(entrada%2 != 0)
		{
			System.out.printf("impar");
		}
		else {
			System.out.printf("par");
		}
		
		sc.close();
	}

}

import java.util.Scanner;

public class Ex4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int password = 2002,tentativa = 0;
		while(password != tentativa)
		{
			tentativa = sc.nextInt();
			if(password != tentativa)
			System.out.println("Senha Invalida");
		}
		System.out.println("Acesso Permitido");
		sc.close();
		

	}

}

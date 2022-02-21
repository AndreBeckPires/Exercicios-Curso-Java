import java.util.Scanner;

public class Ex2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		System.out.println("Digite 2 valores para serem somados: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.printf("Soma: %d", a + b);
		sc.close();
		

	}

}

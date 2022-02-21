import java.util.Scanner;

public class Ex2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int A,B,C,D;
		System.out.println("Digite 4 valores: ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		System.out.printf("Diferença dos produtos: %d%n", A*B - C*D);
		sc.close();
		
	}

}

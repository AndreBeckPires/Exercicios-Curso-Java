import java.util.Locale;
import java.util.Scanner;
public class Ex2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		int codigo1,codigo2, quantidade;
		double valor, total;
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Digite o codigo da peça, o numero de peças e o valor unitario");
		codigo1 = sc.nextInt();
		quantidade = sc.nextInt();
		valor = sc.nextDouble();
		total = quantidade * valor;
		System.out.println("Digite o codigo da peça, o numero de peças e o valor unitario");
		codigo2 = sc.nextInt();
		quantidade = sc.nextInt();
		valor = sc.nextDouble();
		total = total+quantidade*valor;
		System.out.printf("Valor a ser pago R$%.2f", total);
		sc.close();
	}

}

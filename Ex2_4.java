import java.util.Scanner;
import java.util.Locale;
public class Ex2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int nFuncionario, nHoras;
		double vHoras, salario;
		System.out.println("Digite o numero do funcionario: ");
		nFuncionario = sc.nextInt();
		System.out.println("Digite o numero de horas trabalhadas: ");
		nHoras = sc.nextInt();
		System.out.println("Digite o valor da hora trabalhada: ");
		vHoras = sc.nextFloat();
		salario = vHoras * nHoras;
		System.out.printf("Numero: %d%nSalario: U$%.2f", nFuncionario, salario);
		sc.close();
	}

}

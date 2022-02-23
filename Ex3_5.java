import java.util.Scanner;
public class Ex3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigo, quantidade;
		double total;
		Scanner sc = new Scanner(System.in);
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		if(codigo == 1)
		{
			total = quantidade * 4.0;
			System.out.printf("Total: %.2f", total);
		}
		if(codigo == 2)
		{
			total = quantidade * 4.5;
			System.out.printf("Total: %.2f", total);
		}
		if(codigo == 3)
		{
			total = quantidade * 5.0;
			System.out.printf("Total: %.2f", total);
		}
		if(codigo == 4)
		{
			total = quantidade * 2.0;
			System.out.printf("Total: %.2f", total);
		}
		if(codigo == 5)
		{
			total = quantidade * 1.5;
			System.out.printf("Total: %.2f", total);
		}
			
		sc.close();
		
	}

}

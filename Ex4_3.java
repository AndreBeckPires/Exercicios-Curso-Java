import java.util.Scanner;

public class Ex4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int alcool = 0, gasolina = 0, diesel = 0, codigo;
		codigo = sc.nextInt();
		while(codigo != 4)
		{
			switch(codigo)
			{
				case 1:
					alcool += 1;
					break;
				case 2:
					gasolina += 1;
					break;
				case 3:
					diesel += 1;
					break;
				default:
					System.out.println("Codigo invalido");
					break;
			}
			codigo = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
	}

}

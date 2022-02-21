import java.util.Scanner;
public class Ex3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,divisor,dividendo;
		a = sc.nextInt();
		b = sc.nextInt();
		if(a>b)
		{
			divisor = a;
			dividendo = b;
		}
		else {
			divisor = b;
			dividendo = a;
		}
		if(divisor%dividendo == 0 )
		{
			System.out.printf("Multiplos");
		}
		else {
			System.out.printf("Nao sao multiplos");
		}
		sc.close();
	}

}

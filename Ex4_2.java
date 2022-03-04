import java.util.Scanner;

public class Ex4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x,y;
		x = sc.nextInt();
		y = sc.nextInt();
		while(x != 0 && y != 0)
		{
			if(x > 0 && y > 0)
				System.out.printf("Primeiro quadrante \n");
			else if(x > 0 && y < 0)
				System.out.printf("Segundo quadrante \n");
			else if(x < 0 && y < 0)
				System.out.printf("Terceiro quadrante \n");
			else if(x < 0 && y > 0)
				System.out.printf("Quarto quadrante\n");
			x = sc.nextInt();
			y = sc.nextInt();
			
		}
	
	}

}

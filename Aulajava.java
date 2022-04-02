package Gen;

import java.util.Scanner;

public class Aulajava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		int a,m,d,somaD;
		
		System.out.println("\nQual sua idade: ");
		a=ler.nextInt();
		
		System.out.println("\n Meses: ");
		m=ler.nextInt();
		
		
		System.out.println("\nE dias: ");
		d=ler.nextInt();
		
		somaD= a*365 + m*30 + d;
		System.out.println("\t\t Sua idade em dias é:"+somaD);
		
				
		
	}

}

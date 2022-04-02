package Gen;

import java.util.Scanner;

public class questao2_2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		int dias,anos,meses,resto;
		
		System.out.println("\nExpresse em dias sua idade: ");
		dias=ler.nextInt();
		
		anos= dias/365;
		resto= dias%365;
		meses= resto/30;
		dias=resto%30;
		
		System.out.println("\n Minha idade em anos é "+anos+", "+meses+" meses, e "+dias+" dias ");
		
		
		
		
		
		
	}

}

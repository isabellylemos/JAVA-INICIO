package Gen;

import java.util.Scanner;

public class questao2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		int N1,N2,N3,NMaior;
		
		System.out.println("\nDigite o primeiro número: ");
		N1=ler.nextInt();
		System.out.println("\nDigite o segundo número: ");
		N2=ler.nextInt();
		System.out.println("\nDigite o terceiro número: ");
		N3=ler.nextInt();
		
		 if (N1>N2 && N1>N3)
		 { System.out.println("Número "+N1+"é o maior");}
		 
		 else if (N2>N1 && N2>N3)
		 { System.out.println("Número "+N2+"é o maior");}
		 
		 else 
		 { System.out.println("Número "+N3+" é o maior");}
		
			 
		

}
}

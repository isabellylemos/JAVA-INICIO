package Gen;

import java.util.Scanner;

public class questao2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		int N1,N2,N3,NMaior;
		
		System.out.println("\nDigite o primeiro n�mero: ");
		N1=ler.nextInt();
		System.out.println("\nDigite o segundo n�mero: ");
		N2=ler.nextInt();
		System.out.println("\nDigite o terceiro n�mero: ");
		N3=ler.nextInt();
		
		 if (N1>N2 && N1>N3)
		 { System.out.println("N�mero "+N1+"� o maior");}
		 
		 else if (N2>N1 && N2>N3)
		 { System.out.println("N�mero "+N2+"� o maior");}
		 
		 else 
		 { System.out.println("N�mero "+N3+" � o maior");}
		
			 
		

}
}

package Gen;

import java.util.Scanner;

public class quest3 {
	
	public static void main(String[] args) {
		
		//3-	Faça um programa que receba a idade de uma pessoa e mostre na saída em qual 
		//categoria ela se encontra://	10-14 infantil / 15-17 juvenil  / 18-25 adulto

		
		int idade;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nEntre com a sua Idade: ");
		idade=leia.nextInt();
		
		if (idade>=10 && idade<=14)
		{System.out.println("\nVocê faz parte do Infantil! ");}
	
		else if (idade>=15 && idade<=17)
		{System.out.println("\nVocê faz parte do Juvenil! ");}
		
		else if (idade>=18 && idade<=25)
		{System.out.println("\nVocê faz parte do Adulto! ");}
		
		else 
		{System.out.println("\nVocê não pode fazer parte! "); }
		
		
	}

}

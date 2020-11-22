package Application;


import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exeptions.MinhaExeption;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
 		
		System.out.println("Entre com o numero da conta: ");
		int number = sc.nextInt();
		System.out.println("Digite o titular da conta: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Digite o saldo atual: ");
		Double balance = sc.nextDouble();
		System.out.println("Digite o limite de saque: ");
		Double limiteSaque = sc.nextDouble();
		
		Account acc = new Account (number, holder,balance, limiteSaque);
		
		System.out.println();
		System.out.println("Entre com o valor do saque: ");
		Double valorSaque = sc.nextDouble();
		
		try {
		acc.saque(valorSaque);
		System.out.println("Novo saldo " + acc.getBalance());
		
	}
		
	catch(MinhaExeption e) {
		System.out.println("Erro de saque " + e.getMessage());
		
	}
		
		
		
		
		
		
		
		sc.close();
	}

}

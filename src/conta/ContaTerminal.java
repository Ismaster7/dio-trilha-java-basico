package conta;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, digite o número da conta: ");
		int numero = sc.nextInt();
		System.out.println("Agora, digite o número da agência: ");
		String agencia = sc.next();
		System.out.println("Agora, o nome do cliente: ");
		String nome = sc.next();
		System.out.println("Por fim, o saldo: ");
		double saldo = sc.nextDouble();
		System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +  " já está disponível para saque.");
		// TODO Auto-generated method stub
		sc.close();
	}

}

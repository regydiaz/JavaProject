package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

public class Principal {
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("============ CONTA 1 ============");
		Conta c1 = new Conta("Jhonata Santos", "3822", "01089624-9", 500);
		c1.sacar(100);
		c1.depositar(10);
		System.out.println(c1.toString());
		System.out.println("Rendimento: R$" + c1.getRendimentos());

		System.out.println("");
		System.out.println("============ CONTA 2 ============");
		Conta c2 = new Conta("2238", "6589478-2");
		c2.depositar(10);
		c2.sacar(5);
		System.out.println(c2.toString());
		System.out.println("Rendimento: R$" + c2.getRendimentos());

		System.out.println("");
		System.out.println("============ CONTA 3 ============");
		Conta c3 = new Conta();
		c3.depositar(50);
		c3.sacar(5);
		System.out.println(c3.toString());
		System.out.println("Rendimento: R$" + c3.getRendimentos());

		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("Quantidade de contas criadas :" + Conta.getContador());
		System.out.println("--------------------------------");
	}
}

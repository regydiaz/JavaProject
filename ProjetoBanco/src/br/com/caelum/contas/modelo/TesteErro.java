package br.com.caelum.contas.modelo;

public class TesteErro {

	public static void main(String[] args) {
		
		System.out.println("inicio do main");
		metodo1();
		System.out.println("fim do main");
		
		// TODO Auto-generated method stub

	}

	static void metodo1() {
		System.out.println("inicio do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
		// TODO Auto-generated method stub
		
	}

	static void metodo2() {
		System.out.println("inicio do metodo2");
		ContaCorrente cc = new ContaCorrente();
		for (int i = 0; i <=15;i++);
		int i = 0;
		cc.depositar(i  + 1000);
		System.out.println(cc.getSaldo());
		if (i == 5){
			cc = null;
		}
		System.out.println("fim do metodo2");
		// TODO Auto-generated method stub
		
	}
}

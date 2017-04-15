package br.com.caelum.contas.modelo;

public class TestaArray {

	public static void main(String[] args) {
		Conta[] contas = new Conta[10];
		
		for (Conta conta: contas){
			Conta conta1 = new ContaCorrente();
			double i = 0;
			conta1.depositar(i *100.0);
			
		}
		
		// TODO Auto-generated method stub

	}

}

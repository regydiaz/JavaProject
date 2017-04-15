package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta {
	public void saca(double valor){
		this.getSaldo();// deveria colocar um this.saldo -= (valor + 0.10)
	}
	}



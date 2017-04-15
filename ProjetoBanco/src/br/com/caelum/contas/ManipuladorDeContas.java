package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	
	private Conta conta;


	public void criaConta(Evento evento){
		String tipo= evento.getSelecionadoNoRadio("tipo");
		if(tipo.equals("Conta Corrente")){
			this.conta =new ContaCorrente();
		}else if (tipo.equals("Conta Poupança")){
			this.conta= new ContaPoupanca();
		}
		this.conta.setAgencia(evento.getString("agencia"));
		this.conta.setNumero(evento.getInt("numero"));
		this.conta.setTitular(evento.getString("titular"));
		conta.depositar(1500);

	}

	public void saca (Evento evento){
		double valor = evento.getDouble("valorOperacao");
			this.conta.sacar(valor);

	}
	public void deposita(Evento evento){
		double valor = evento.getDouble("valorOperacao");
			this.conta.depositar(valor);
	}}


	
	

package br.com.caelum.contas.modelo;

import br.com.caelum.contas.utils.Data;

/**
 * @description Classe responsável por realizar as ações de uma conta, contendo
 *              suas devidas regras de negócio
 * @author Jhonata Santos
 * @version 1.0
 */
public class Conta {
	/**
	 * Atributos da classe
	 */
	private String titular;
	private String agencia;
	private int numero;
	private double saldo;
	private int indentificador = 1;
	private static int contador;
	Data dataAbertura;

	/**
	 * Construtor Principal Completo
	 * 
	 * @param titular
	 * @param agencia
	 * @param numero
	 * @param saldo
	 */
	public Conta(String titular, String agencia, int numero, double saldo) {
		this.titular = titular;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;

		// Realiza a contagem de quantas contas foram instânciadas pela classe
		indentificador += contador++;
	}

	/**
	 * Construtor Secundário Resumido
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(String agencia, int numero) {
		this("", agencia, numero, 0);
	}

	/**
	 * Construtor Vazio
	 */
	public Conta() {
		indentificador += contador++;
	}

	public Conta(String titular2, String agencia2, String string, int saldo2) {
		// TODO Auto-generated constructor stub
	}

	public Conta(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Get titular
	 * 
	 * @return o titular do titular
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * Get Agencia
	 * 
	 * @return a agência
	 */
	public String getAgencia() {
		return agencia;
	}

	/**
	 * Get Numero
	 * 
	 * @return o número da conta
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Get Saldo
	 * 
	 * @return o saldo bancário
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Get Indentificador
	 * 
	 * @return o indentificador da conta
	 */
	public int getIndentificador() {
		return indentificador;
	}

	/**
	 * Get Contador
	 * 
	 * @return o contador de instâncias
	 */
	public static int getContador() {
		return contador;
	}

	/**
	 * Get Rendimentos
	 * 
	 * @return o valor de rendimentos
	 */
	public double getRendimentos() {
		return this.saldo *= 0.1;
	}

	/**
	 * Set titular
	 * 
	 * @param titular
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * Set Agência (Private porque foi definido na regra de negócio, somente a
	 * classe pode alterar)
	 * 
	 * @param agencia
	 */
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	/**
	 * Set Numero
	 * 
	 * @param i
	 */
	public void setNumero(int i) {
		this.numero = i;
	}

	/**
	 * Obtém os dados do estado atual da conta
	 */
	@Override
	public String toString() {
		return "titular: " + titular + "\nAgência: " + agencia + "\nNumero: " + numero + "\nSaldo: " + saldo
				+ "\nIndentificador: " + indentificador;
	}

	/**
	 * Realiza uma operação de saque do saldo da conta
	 * 
	 * @param valor a ser sacado
	 * @return se a operação foi realizada com sucesso
	 * @author Jhonata Santos
	 */
	public boolean sacar(double valor) {
		if (this.saldo > 0 && valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Saldo insuficiente para saque!");
			return false;
		}
	}

	/**
	 * Realiza um deposito incluindo um valor no saldo da conta
	 * 
	 * @param valor
	 * @return se a operação foi realizada com sucesso
	 */
	public boolean depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		} else {
			System.out.println("Valor insuficiente para deposito!");
			return false;
		}
	}

	/**
	 * Realiza uma transferencia bancária
	 * 
	 * @param destino
	 * @param valor
	 * @return se a operação foi realizada com sucesso
	 */
	public boolean transferir(Conta destino, double valor) {
		if (destino != null && valor != 0) {
			boolean retirada = this.sacar(valor);
			if (retirada) {
				destino.depositar(valor);
			}
			return true;
		} else {
			System.out.println("Impossivel realizar a transferencia!");
			return false;
		}
	}

}

package org.digital;

public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDestino);
	
	void verificarIdade(int idade);
	
	void imprimirExtrato();

}

package Interfaces;

import Entities.Agencia;
import Entities.Banco;
import Entities.Conta;

public interface ContaInterface {
	
	void depositar(Double valor);
	void sacar(Double valor);
	void transferir(Banco banco, Agencia agencia, Conta conta, Double Valor);
	
}

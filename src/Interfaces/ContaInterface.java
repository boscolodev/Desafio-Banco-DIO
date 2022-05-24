package Interfaces;

import Entities.Agencia;
import Entities.Cliente;
import Entities.Conta;

public interface ContaInterface {
	
	void depositar(Double valor);
	void sacar(Double valor);
	void transferir(Cliente cliente, Agencia agencia, Conta conta, Double valor);
	
}

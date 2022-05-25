package Interfaces;

import Entities.Agencia;
import Entities.Banco;
import Entities.Cliente;
import Entities.Conta;

public interface ContaInterface {
	
	void depositar(Double valor);
	void sacar(Double valor);
	void transferir(Cliente clienteOrigem, Banco bancoDestino, Agencia agenciaDestino, Conta contaDestino, Double valor);
	
}

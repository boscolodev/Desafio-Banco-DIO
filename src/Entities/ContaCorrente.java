package Entities;

import java.util.HashMap;
import java.util.Map;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaCorrente extends Conta {

	@Builder
	public ContaCorrente(Integer numero, Double saldo, Character tipo) {
		super.numero = numero;
		super.saldo = saldo;
		super.tipo = Character.toUpperCase(tipo);

	}

	@Override
	public void depositar(Double valor) {
		if (!(valor > 0)) {
			System.out.println("Valor inválio para depósito");
		} else {
			super.setSaldo(super.getSaldo() + valor);
			System.out.println("Saldo em conta: " + super.getSaldo());
		}

	}

	@Override
	public void sacar(Double valor) {
		if (!(valor > 0)) {
			System.out.println("Valor inválio para depósito");
		}
		if ((super.getSaldo() - valor) <= 0) {
			System.out.println("Saldo insuficiente para saque !");
		} else {
			super.setSaldo(super.getSaldo() - valor);
			System.out.println("Saldo em conta: " + super.getSaldo());
		}
	}

	
	public void transferir(Banco bancoOrigem, Banco bancoDestino, Agencia agenciaOrigem, Agencia agenciaDestino,
			Conta contaDestino, Double Valor) {
		
		/*
		 * if (!(agencia != null)) { System.out.println("Agencia inválida !"); } else if
		 * (!(conta != null)) { System.out.println("Conta inválida"); } else if (!(valor
		 * >= 0)) { System.out.println("Valor inválido."); } else if( ) {
		 * 
		 * } else {
		 * 
		 * System.out.println("Origem Conta: " + this.getNumero() + " Saldo: " +
		 * this.getSaldo()); System.out.println("Destino Conta: " + conta.getNumero() +
		 * " Saldo: " + conta.getSaldo()); this.setSaldo(getSaldo() - valor);
		 * conta.setSaldo(conta.getSaldo() + valor);
		 * System.out.println("Transação Efetuada com sucesso !");
		 * System.out.println("Origem Conta: " + this.getNumero() + " Saldo: " +
		 * this.getSaldo()); System.out.println("Destino Conta: " + conta.getNumero() +
		 * " Saldo: " + conta.getSaldo());
		 * 
		 * this.setSaldo(getSaldo() - valor); conta.setSaldo(conta.getSaldo() + valor);
		 */
	}
}

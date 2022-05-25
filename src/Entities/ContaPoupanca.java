package Entities;

import lombok.Builder;

public class ContaPoupanca extends Conta {

	@Builder
	public ContaPoupanca(Integer numero, Double saldo, Character tipo) {
		super.numero = numero;
		super.saldo = saldo;
		super.tipo = Character.toUpperCase(tipo);

	}

	@Override
	public void depositar(Double valor) {
		if (!(valor > 0)) {
			System.out.println("Valor inv�lio para dep�sito");
		} else {
			super.setSaldo(super.getSaldo() + valor);
		}

	}

	@Override
	public void sacar(Double valor) {
		if (!(valor > 0)) {
			System.out.println("Valor inv�lio para dep�sito");
		} else {
			super.setSaldo(super.getSaldo() - valor);
		}
	}

	@Override
	public void transferir(Cliente clienteOrigem, Banco bancoDestino, Agencia agenciaDestino, Conta contaDestino,
			Double valor) {

		if (!clienteOrigem.getBanco().stream().anyMatch(b -> b.getNumero().equals(bancoDestino.getNumero()))) {
			System.out.println("Banco inv�lido !");
		} else if (!(agenciaDestino.getNumero() != null)) {
			System.out.println("Ag�ncia inv�lida !");
		} else if (!((contaDestino.getNumero()) != null)) {
			System.out.println("Conta inv�lida");
		} else if (!(valor >= 0)) {
			System.out.println("Valor inv�lido !");
		} else if (!(this.saldo >= valor)) {
			System.out.println("Saldo insuficiente !");
		} else {
			this.saldo -= valor;
			contaDestino.setSaldo(contaDestino.getSaldo() + valor);
			System.out.println("Transferencia realizada com sucesso !");
		}
	}
}
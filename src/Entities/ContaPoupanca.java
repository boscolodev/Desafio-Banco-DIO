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
			System.out.println("Valor inválio para depósito");
		} else {
			super.setSaldo(super.getSaldo() + valor);
		}

	}

	@Override
	public void sacar(Double valor) {
		if (!(valor > 0)) {
			System.out.println("Valor inválio para depósito");
		} else {
			super.setSaldo(super.getSaldo() - valor);
		}
	}


}

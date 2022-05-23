package Entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaCorrente extends Conta {

	@Builder
	public ContaCorrente(Integer numero, Double saldo, Character tipo) {
		super.numero  = numero;
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

	@Override
	public void transferir(Banco banco, Agencia agencia, Conta conta, Double valor) {
		
		if(!(banco.getNumero() != null)){
			System.out.println("Banco inválido !");
			if(!(agencia.getNumero() != null)) {
				System.out.println("Agencia inválida !");
				if(!(conta.getNumero() != null)) {
					System.out.println("Conta inválida");
					if(!(valor >=0)) {
						System.out.println("Valor inválido.");
					}
				}
			}
		}

		this.setSaldo(getSaldo()-valor);
		conta.setSaldo(conta.getSaldo()+valor);
		
	}

}

package Entities;

import Interfaces.FinanciamentoInterface;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Financiamento implements FinanciamentoInterface{

	protected Banco banco;
	protected Agencia agencia;
	protected Conta conta;
	protected Cliente cliente;

	
}

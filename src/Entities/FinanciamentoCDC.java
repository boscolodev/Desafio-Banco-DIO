package Entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FinanciamentoCDC extends Financiamento {

	public static Double txJuros = 0.15;
	
	Double totalContratado = 0d;
	Double totalJuros = 0d;
	Double valorParcela = 0d;
	Double valorFinanciado = 0d;
	Double parcelas = 0d;
	Double valorRestante =0d;
	Integer mesesContratados = 0;
	
	@Builder
	public FinanciamentoCDC(Banco banco, Agencia agencia, Conta conta, Cliente cliente) {
		super.banco = banco;
		super.agencia = agencia;
		super.conta = conta;
		super.cliente = cliente;
	}

	@Override
	public void financiar(Double valor, Integer prazo) {
		if (!(valor > 0)) {
			System.out.println("Valor inválido !");
		} else if (!(prazo > 0)) {
			System.out.println("Prazo inválido !");
		} else {
			
			valorFinanciado = valor;
			totalJuros = (txJuros * prazo);
			totalContratado = ((valorFinanciado * totalJuros)/10 + valorFinanciado);
			valorParcela = (totalContratado / prazo);
			
			System.out.println("========== Financiamento CDC ==========");
			System.out.println(String.format("Valor Financiado  : $%.2f ", valor));
			System.out.println(String.format("Taxa de Juros     : %.2f%s mês", txJuros*10,"%"));
			System.out.println(String.format("Meses Contradados : %d ", prazo));
			System.out.println("=======================================");
			System.out.println(String.format("Valor Total Financiado: $%.2f ", totalContratado));
			System.out.println(String.format("Juros: %.2f%s", totalJuros*10,"%"));
			System.out.println(String.format("Valor da Parcela: $%.2f ", valorParcela));
			
			mesesContratados = prazo;
			
		}

	}

	@Override
	public void pagarParcela(Integer quantidadeParcelas) {
		
		Double valoraPagar = (valorParcela * quantidadeParcelas);
		
		mesesContratados-=quantidadeParcelas;
		System.out.println("Parcelas: "+parcelas);
		System.out.println("Meses Restantes: " + mesesContratados);
		System.out.println("Valor restante: " +valorRestante);

	}

	@Override
	public void imprimeFinanciamento(Cliente cliente) {
		// TODO Auto-generated method stub

	}

}

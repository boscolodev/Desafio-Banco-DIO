package Entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FinanciamentoLeasing extends Financiamento {

	private static Double txFinanciamento = 1.08;

	private Double valor;
	private Integer prazoContratado;

	Double valorJuros = 0d;
	Double taxaJuros = 0d;
	Double totalFinanciado = 0d;
	Double valorParcela = 0d;
	Integer parcelasPagas = 0;

	@Builder
	public FinanciamentoLeasing(Banco banco, Agencia agencia, Conta conta, Cliente cliente) {
		super.banco = banco;
		super.agencia = agencia;
		super.cliente = cliente;
	}

	@Override
	public void financiar(Double valor, Integer prazo) {

		this.valor = valor;
		this.prazoContratado = prazo;

		if (!(valor > 0)) {
			System.out.println("Valor inválido !");
		}
		if (!(prazo > 0)) {
			System.out.println("Prazo inválido !");
		}

		this.taxaJuros = (txFinanciamento * prazo);
		this.valorJuros = ((valor * taxaJuros) / 100);
		this.totalFinanciado = (valor + valorJuros);
		this.valor = valor;
		this.prazoContratado = prazo;
		this.parcelasPagas = 0;
		this.valorParcela = (totalFinanciado / prazo);
	}

	@Override
	public void pagarParcela(Integer quantidadeParcelas) {

		if (!(quantidadeParcelas > 0)) {
			System.out.println("Quantidade de parcelas inválida !");
		} else {

			System.out.println("\nValor a pagar: " + (quantidadeParcelas * valorParcela));
			parcelasPagas += quantidadeParcelas;
			
			System.out.println("Parcelas Restantes: " + (getPrazoContratado() - parcelasPagas));
			System.out.println("Saldo Devedor: " + ( valor *(getPrazoContratado() - parcelasPagas)));
			
		}

	}

	@Override
	public void imprimeFinanciamento() {
		System.out.println(String.format("Valor Financiado : %.2f", getValor()));
		System.out.println(String.format("Taxa de Juros: %.2f%s", taxaJuros, "%"));
		System.out.println(String.format("Juros : %.2f%s", valorJuros, "%"));
		System.out.println(String.format("Total Financiado : %.2f%s", totalFinanciado, "%"));
		System.out.println(String.format("Valor da Parcela : %.2f", valorParcela));
		System.out.println(String.format("Prazo Contratdao : %d", getPrazoContratado()));
		System.out.println("Parcelas Restantes: " + (getPrazoContratado() - parcelasPagas));
		System.out.println("Saldo Devedor: " + ( valor *(getPrazoContratado() - parcelasPagas)));
		
	}

}

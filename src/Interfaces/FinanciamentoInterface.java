package Interfaces;

import Entities.Cliente;

public interface FinanciamentoInterface {

	void financiar(Double valor, Integer prazo);
	void pagarParcela(Integer quantidadeParcelas);
	void imprimeFinanciamento();
	
}

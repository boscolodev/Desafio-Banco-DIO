package Interfaces;

public interface ClienteInterface {

	void imprimeExtrato(Integer agencia, Integer conta);
	void financiar(Double valor, Integer prazo);
	
}

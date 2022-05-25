package Entities;


import java.util.List;

import Interfaces.ClienteInterface;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente implements ClienteInterface {

	private Long codigo;
	private String nome;
	private List<Banco> banco;

	public void imprimeExtrato(Agencia agencia, Conta conta) {
				
		System.out.println("Banco: "+ banco.stream().findAny().get().getNome() );
		System.out.println("Cliente: "+this.getNome());
		System.out.println("Nome da Agencia: " + agencia.getNome());
		System.out.println("Agencia: " + agencia.getNumero());
		System.out.println("Conta :"+conta.getNumero());
		System.out.println("Saldo: "+conta.getSaldo());
	};


}

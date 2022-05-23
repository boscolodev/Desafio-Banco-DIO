package Entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Banco {

	private Integer numero;
	private String nome;
	private List<Agencia> agencia;
	
	
}

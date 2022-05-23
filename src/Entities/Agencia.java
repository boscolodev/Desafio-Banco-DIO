package Entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agencia {
	
	private Integer numero;
	private String nome;
	private List<Conta> conta;

}

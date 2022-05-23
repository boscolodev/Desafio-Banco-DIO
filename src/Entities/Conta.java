package Entities;

import Interfaces.ContaInterface;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Conta implements ContaInterface{

	protected Integer numero;
	protected Double saldo;
	protected Character tipo;
	
	
}

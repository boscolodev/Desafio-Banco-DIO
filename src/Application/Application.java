package Application;

import java.util.ArrayList;
import java.util.List;

import Entities.Agencia;
import Entities.Banco;
import Entities.Cliente;
import Entities.Conta;
import Entities.ContaCorrente;

public class Application {

	public static void main(String[] args) {

		// Contas
		Conta contaCorrente1 = new ContaCorrente(123, 5d, 'f');
		Conta contaCorrente2 = new ContaCorrente(456, 1.99, 'j');
		Conta contaCorrente3 = new ContaCorrente(789, 780.41, 'j');
		Conta contaCorrente4 = new ContaCorrente(134, 6.32, 'f');
		Conta contaCorrente5 = new ContaCorrente(246, 0.04, 'f');

		List<Conta> listConta = new ArrayList<Conta>() {
			{
				add(contaCorrente1);
				add(contaCorrente2);
			}
		};

		List<Conta> listConta2 = new ArrayList<Conta>() {
			{
				add(contaCorrente3);
				add(contaCorrente4);
			}
		};

		List<Conta> listConta3 = new ArrayList<Conta>() {
			{
				add(contaCorrente5);
			}
		};

		List<Conta> listTodasContas = new ArrayList<Conta>() {
			{
				add(contaCorrente1);
				add(contaCorrente2);
				add(contaCorrente3);
				add(contaCorrente4);
				add(contaCorrente5);
			}
		};

		// Agencia
		Agencia agencia1 = new Agencia(11, "Centro", listConta);
		Agencia agencia2 = new Agencia(12, "Zanaga", listConta3);

		List<Agencia> listAgencia = new ArrayList<Agencia>() {
			{
				add(agencia1);
			}
		};

		List<Agencia> listAgencia2 = new ArrayList<Agencia>() {
			{
				add(agencia2);
			}
		};

		List<Agencia> listTodasAgencias = new ArrayList<Agencia>() {
			{
				add(agencia1);
				add(agencia2);
			}
		};

		// Bancos

		Banco banco = new Banco(237, "Nubank", listAgencia);
		Banco banco2 = new Banco(341, "Itau", listAgencia2);

		List<Banco> listBanco = new ArrayList<Banco>() {
			{
				add(banco);
			}
		};

		List<Banco> listBanco2 = new ArrayList<Banco>() {
			{
				add(banco2);
			}
		};

		List<Banco> listTodosBancos = new ArrayList<Banco>() {
			{
				add(banco);
				add(banco2);
			}
		};
		// Clientes

		Cliente cliente = new Cliente(1L, "Guilherme", listBanco);
		Cliente cliente2 = new Cliente(2L, "João", listBanco2);

		// Operações

		// Exibir Contas Cadastradas
		System.out.println("Contas Cadastradas");
		listTodasContas.stream().forEach(x -> System.out.println(x));

		// Exibir Agencias Cadastradas
		System.out.println("Agencias Cadastradas");
		listTodasAgencias.stream().forEach(x -> System.out.println(x));

		// Exibir Contas Cadastradas
		System.out.println("Bancos Cadastrados");
		listTodosBancos.stream().forEach(x -> System.out.println(x));
		
		
		//Realizar um Depósito na Conta 1
		contaCorrente1.depositar(147.25);
		//Realizar Saque Depósito na Conta 1
		contaCorrente1.sacar(65.33);
		
		//contaCorrente1.transferir(banco,agencia1, contaCorrente2, 80.92);
		
		//Realizar uma Transferencia da conta 1 para 2 (Mesmo Banco)
		
		//Realizar uma Transferencia da conta 1 para 2 (Outro Banco)
		
		/*
		 * contaCorrente1.depositar(100d); System.out.println(contaCorrente1);
		 * contaCorrente1.sacar(99.98); System.out.println(contaCorrente1);
		 * 
		 * System.out.println("Conta Corrente 2:" + contaCorrente2);
		 * contaCorrente1.transferir(agencia1, contaCorrente2, 5d);
		 * System.out.println(contaCorrente1); System.out.println(contaCorrente2);
		 */
	}

}

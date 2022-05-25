package Application;

import java.util.ArrayList;
import java.util.List;

import Entities.Agencia;
import Entities.Banco;
import Entities.Cliente;
import Entities.Conta;
import Entities.ContaCorrente;
import Entities.Financiamento;
import Entities.FinanciamentoCDC;

public class Application {

	public static void main(String[] args) {

		// Contas
		Conta contaCorrente1 = new ContaCorrente(123, 5d, 'f');
		Conta contaCorrente2 = new ContaCorrente(456, 1.99, 'j');
		Conta contaCorrente3 = new ContaCorrente(789, 780.41, 'j');
		Conta contaCorrente4 = new ContaCorrente(134, 6.32, 'f');
		Conta contaCorrente5 = new ContaCorrente(246, 0.04, 'f');

		List<Conta> listConta = new ArrayList<Conta>() {
			private static final long serialVersionUID = 1L;

			{
				add(contaCorrente1);
				add(contaCorrente2);
			}
		};

		List<Conta> listConta2 = new ArrayList<Conta>() {
			private static final long serialVersionUID = 1L;

			{
				add(contaCorrente3);
				add(contaCorrente4);
			}
		};

		List<Conta> listConta3 = new ArrayList<Conta>() {
			private static final long serialVersionUID = 1L;

			{
				add(contaCorrente5);
			}
		};

		List<Conta> listTodasContas = new ArrayList<Conta>() {
			private static final long serialVersionUID = 1L;

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
			private static final long serialVersionUID = 1L;

			{
				add(agencia1);
			}
		};

		List<Agencia> listAgencia2 = new ArrayList<Agencia>() {
			private static final long serialVersionUID = 1L;

			{
				add(agencia2);
			}
		};

		List<Agencia> listTodasAgencias = new ArrayList<Agencia>() {
			private static final long serialVersionUID = 1L;

			{
				add(agencia1);
				add(agencia2);
			}
		};

		// Bancos

		Banco banco = new Banco(237, "Nubank", listAgencia);
		Banco banco2 = new Banco(341, "Itau", listAgencia2);

		List<Banco> listBanco = new ArrayList<Banco>() {
			private static final long serialVersionUID = 1L;

			{
				add(banco);
			}
		};

		List<Banco> listBanco2 = new ArrayList<Banco>() {
			private static final long serialVersionUID = 1L;

			{
				add(banco2);
			}
		};

		List<Banco> listTodosBancos = new ArrayList<Banco>() {
			private static final long serialVersionUID = 1L;

			{
				add(banco);
				add(banco2);
			}
		};
		// Clientes

		Cliente cliente = new Cliente(1L, "Guilherme", listBanco);
		Cliente cliente2 = new Cliente(2L, "João", listBanco2);
		Cliente cliente3 = new Cliente(3L, "Hevelyn", listBanco2);
		Cliente cliente4 = new Cliente(4L, "Anita",listBanco);

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

		// Realizar um Depósito na Conta 1
		contaCorrente1.depositar(147.25);
		// Realizar Saque Depósito na Conta 1
		contaCorrente1.sacar(65.33);

		//Realizando transferencia entre conta do mesmo banco
		contaCorrente1.transferir(cliente, banco, agencia1, contaCorrente2, 86.92);
		
		//Exibindo as contas após Operaçãp
		System.out.println("\nConta 1: "+ contaCorrente1);
		System.out.println("Conta 2: "+ contaCorrente2);
		
		//Realizando transferencia entre conta de mesmo banco
		contaCorrente1.transferir(cliente, banco2, agencia1, contaCorrente1, 86.92);
		
		//Realizando um extrato de cliente
		System.out.println("Método imprimeExtrato()");
		cliente.imprimeExtrato(agencia1, contaCorrente1);

		//Realizando um financiado
		Financiamento cdc = new FinanciamentoCDC(banco, agencia1, contaCorrente1, cliente);

		cdc.financiar(10000d, 24);
		cdc.pagarParcela(3);
	}

}

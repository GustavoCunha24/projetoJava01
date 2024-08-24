package principal;

import java.util.UUID;

import javax.swing.JOptionPane;

import entities.Cliente;
import repositories.ClienteRepository;

public class Main {

	/*
	 * Método / função padrão do Java utilizando para executarmos a classe principal
	 * do projeto.
	 */
	public static void main(String[] args) {

		System.out.println("Sistema para cadastro de Cliente");
		System.out.println("Turma de Java WebDeveloper - Sábado.");

		// Criando um ojeto para a classe Cliente
		var cliente = new Cliente();

		// preenchendo os dados do cliente
		cliente.setId(UUID.randomUUID());
		cliente.setNome(JOptionPane.showInputDialog("Informe o nome do cliente:"));
		cliente.setCpf(JOptionPane.showInputDialog("Informe o Cpf do cliente:"));
		cliente.setTelefone(JOptionPane.showInputDialog("Informe o telefone do cliente:"));
		cliente.setEmail(JOptionPane.showInputDialog("Informe o email do cliente:"));

		// Imprimir os dados do cliente
		System.out.println("\nDados do cliente:");
		System.out.println("\tID........:" + cliente.getId());
		System.out.println("\tNome......:" + cliente.getNome());
		System.out.println("\tCpf.......:" + cliente.getCpf());
		System.out.println("\tTelefone..:" + cliente.getTelefone());
		System.out.println("\tEmail.....:" + cliente.getEmail());
		
		//Criando um objeto para a classe Cliente Repository
		var clienteRepository = new ClienteRepository();
		
		//executando a exportação dos dados para arquivo
		clienteRepository.exportarDados(cliente);
	}

}

package repositories;

import java.io.PrintWriter;

import entities.Cliente;

/*
 * Classe de Repositório de dados para gravar,
 * editar, consultar ou excluir informações em 
 * arquivos de banco de dados.
 */
public class ClienteRepository {

	/*
	 * Método para gravar os dados do cliente em arquivo de extensão TXT
	 */
	public void exportarDados(Cliente cliente) {
		
		try {
			
			//criando o arquivo TXT para gravar os dados do cliente
			var printWriter = new PrintWriter("c:\\temp\\cliente_" + cliente.getId() + ".txt");
			
			
			//escrever o conteúdo do arquivo
			printWriter.write("\nID do Cliente....: " + cliente.getId());
			printWriter.write("\nNome.............: " + cliente.getNome());
			printWriter.write("\nCPF..............: " + cliente.getCpf());
			printWriter.write("\nTelefone.........: " + cliente.getTelefone());
			printWriter.write("\nEmail............: " + cliente.getEmail());
			
			//fechar o arquivo
			printWriter.close();
			
			System.out.println("\nDados gravados com sucesso!");
			
		}
		catch(Exception e) {
			System.out.println("\nFalha ao gravar arquivo: " + e.getMessage());
		
		}			
		
	}
}

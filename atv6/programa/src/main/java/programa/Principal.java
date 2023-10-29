package programa;

import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.boot.SpringApplication;

import programa.dao.ProdutoDAO;
import programa.dao.ProdutoJDBCDAO;
import programa.entity.Produto;

public class Principal {

	public static void main(String[] args) {
		
		SpringApplication.run(Principal.class, args);

		
		// ProdutoDAO baseProdutos = new ProdutoJDBCDAO();
		// String menu = "Escolha uma opção:\n1 - Inserir\n2 - Atualizar por CPF\n3 - Remover por CPF\n4 - Exibir por CPF\n5 - Exibir por id\n6 - Exibir todos\n7 - Exibir todos que contem determinado nome\n8 - Sair";
		// char opcao = '0';
		// do {
		// try {
		// Produto cl;
		// String cpf;
		// opcao = JOptionPane.showInputDialog(menu).charAt(0);
		// switch (opcao) {
		// case '1': // Inserir
		// cl = new Produto();
		// obterProduto(cl);
		// baseProdutos.save(cl);
		// break;
		// case '2': // Atualizar por CPF
		// cpf = JOptionPane.showInputDialog("Digite o CPF do cliente a ser alterado");
		// cl = baseProdutos.findByCpf(cpf);
		// obterProduto(cl);
		// baseProdutos.save(cl);
		// break;
		// case '3': // Remover por CPF
		// cpf = JOptionPane.showInputDialog("CPF");
		// cl = baseProdutos.findByCpf(cpf);
		// if (cl != null) {
		// baseProdutos.delete(cl.getId());
		// } else {
		// JOptionPane.showMessageDialog(null, "Não foi possível remover, pois o cliente
		// não encontrado.");
		// }
		// break;
		// case '4': // Exibir por CPF
		// cpf = JOptionPane.showInputDialog("CPF");
		// cl = baseProdutos.findByCpf(cpf);
		// listaProduto(cl);
		// break;
		// case '5': // Exibir por id
		// int id = Integer.parseInt(JOptionPane.showInputDialog("Id"));
		// cl = baseProdutos.find(id);
		// listaProduto(cl);
		// break;
		// case '6': // Exibir todos
		// listaProdutos(baseProdutos.find());
		// break;
		// case '7': // Exibir todos que contem determinado nome
		// String nome = JOptionPane.showInputDialog("Nome");
		// listaProdutos(baseProdutos.findByNome(nome));
		// break;
		// case '8': // Sair
		// break;
		// default:
		// JOptionPane.showMessageDialog(null, "Opção Inválida");
		// break;
		// }
		// } catch (Exception e) {
		// e.printStackTrace();
		// JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
		// }
		// } while(opcao != '8');
		// }

		// public static void obterProduto(Produto cl) {
		// String nome = JOptionPane.showInputDialog("Nome", cl.getNome());
		// String cpf = JOptionPane.showInputDialog("CPF", cl.getCpf());
		// String fone = JOptionPane.showInputDialog("Fone", cl.getFone());
		// double renda = Double.parseDouble(JOptionPane.showInputDialog("Renda",
		// cl.getRenda()));
		// cl.setNome(nome);
		// cl.setCpf(cpf);
		// cl.setFone(fone);
		// cl.setRenda(renda);
		// }

		// public static void listaProdutos(List<Produto> clientes) {
		// StringBuilder listagem = new StringBuilder();
		// for(Produto cl : clientes) {
		// listagem.append(cl).append("\n");
		// }
		// JOptionPane.showMessageDialog(null, listagem.length() == 0 ? "Nenhum cliente
		// encontrado" : listagem);
		// }

		// public static void listaProduto(Produto cl) {
		// JOptionPane.showMessageDialog(null, cl == null ? "Nenhum cliente encontrado"
		// : cl);
		// }

	}
}
package Sisteminha ;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CadastroCliente extends Pessoa{

	private int codCliente;
	private String endereco;
	Scanner sc = new Scanner(System.in);
	int cont;
	
	
	public CadastroCliente(String nome, String cpf, String idade, double saldo, int codCliente, String endereco) {
		super(nome, cpf, idade, saldo);
		this.codCliente = codCliente;
		this.endereco = endereco;
	}


	public int getCodCliente() {
		return codCliente;
	}


	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void CadastrarCliente() {
		cont++;
		setNome(JOptionPane.showInputDialog("Digite o nome:"));
		setCpf(JOptionPane.showInputDialog("Digite o CPF:"));
		setIdade(JOptionPane.showInputDialog("Digite a idade"));
		setEndereco(JOptionPane.showInputDialog("Digite o endereço"));
		setCodCliente(cont);
		JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso. seu codigo é:" + getCodCliente());
		
		
	}

	public void MostrarCliente(){
		JOptionPane.showMessageDialog(null, "INFORMAÇÕES CLIENTES \n\nNome do cliente :" + getNome() + "\nCPF :" + getCpf() + "\nIdade :" + getIdade() + "\nEndereço :" + getEndereco());
	}
}

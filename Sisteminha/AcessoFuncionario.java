package Sisteminha;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AcessoFuncionario extends Pessoa {

	private String cargo;
	private int codVendedor;
	Scanner sc = new Scanner(System.in);
	
	public AcessoFuncionario(String nome, String cpf, String idade, double saldo) {
		super(nome, cpf, idade, saldo);
		this.cargo = cargo;
		this.codVendedor = codVendedor;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getCodVendedor() {
		return codVendedor;
	}

	public void setCodVendedor(int codVendedor) {
		this.codVendedor = codVendedor;
	}
	
	public void AcessarSistema() {
		System.out.println("Nome do Funcionario:");
		setNome(JOptionPane.showInputDialog(null, "Nome do Funcionario"));
		System.out.println("Cargo:");
		setCargo(JOptionPane.showInputDialog(null, "Cargo"));
		System.out.println("Seu codigo de vendedor:");
		setCodVendedor(Integer.parseInt(JOptionPane.showInputDialog("DIgite o codigo")));
	}
}

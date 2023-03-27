package Sisteminha;

public class Pessoa {

	private String nome;
	private String cpf;
	private String idade;
	private double saldo;
	
	public Pessoa(String nome, String cpf, String idade, double saldo) {
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}

package Sisteminha;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Venda {

	Scanner sc = new Scanner(System.in);
	boolean Boolean = true;
	private double soma;
	private int codVenda;
	private double caixa;
	private AcessoFuncionario acessoFuncionario;
	private CadastroCliente[] cadastroCliente = new CadastroCliente[5];
	private Produto[] produto = new Produto[5];
	private String aux;
	
	public Venda(double soma, int codVenda, CadastroCliente[] cadastroCliente, Produto[] produto, AcessoFuncionario acessoFuncionario, String aux, double caixa) {
		this.soma = soma;
		this.codVenda = codVenda;
		this.cadastroCliente = cadastroCliente;
		this.produto = produto;
		this.acessoFuncionario = acessoFuncionario;
		this.aux = aux;
		this.caixa = caixa;
	}

	public double getSoma() {
		return soma;
	}

	public void setSoma(double soma) {
		this.soma = soma;
	}

	public int getCodVenda() {
		return codVenda;
	}

	public void setCodVenda(int codVenda) {
		this.codVenda = codVenda;
	}

	public CadastroCliente[] getCadastroCliente() {
		return cadastroCliente;
	}

	public void setCadastroCliente(CadastroCliente[] cadastroCliente) {
		this.cadastroCliente = cadastroCliente;
	}

	public CadastroCliente getCadastroCliente(int i){
		return this.cadastroCliente[i];
	}

	public Produto[] getProduto() {
		return produto;
	}

	public void setProduto(Produto[] produto) {
		this.produto = produto;
	}
	
	
	public String getAux() {
		return aux;
	}

	public void setAux(String aux) {
		this.aux = aux;
	}
	
	public Produto getProduto(int i) {
		return this.produto[i];
	}
	
	public AcessoFuncionario getAcessoFuncionario() {
		return acessoFuncionario;
	}

	public void setAcessoFuncionario(AcessoFuncionario acessoFuncionario) {
		this.acessoFuncionario = acessoFuncionario;
	}

	
	public double getCaixa() {
		return caixa;
	}

	public void setCaixa(double caixa) {
		this.caixa = caixa;
	}

	public boolean login () {
			String login = JOptionPane.showInputDialog("" + "Digite o acesso de administrador", "");
			String senha = JOptionPane.showInputDialog("" + "Digite a senha", "");
			if(login.equalsIgnoreCase("admin") && senha.equals("123")) {		
				JOptionPane.showMessageDialog(null,"Acesso permitido");
				return true;
			}
			else {
				JOptionPane.showMessageDialog(null, "Acesso negado!");
				return false;
				
			}
	}
	
	public void Menu() {
		aux = JOptionPane.showInputDialog("----> MENU <----" + "\n1-Mostrar Produtos \n2-Cadastrar Cliente "
				+ "\n3-Vender Produto \n4-Caixa \n5-Mostrar Clientes \n6-Sair \n\nDigite o comando");
	}
	
	public void vender() {
		if(getCadastroCliente(0).getCodCliente() == 0){
			JOptionPane.showMessageDialog(null, "Antes, cadastre um usuario !");
		}
		else{
			JOptionPane.showMessageDialog(null, "Informe o funcionario");
			getAcessoFuncionario().AcessarSistema();

			String product = JOptionPane.showInputDialog("Digite o nome do produto");
						
			for(int i=0; i<produto.length; i++) {
				if(product.equalsIgnoreCase(getProduto(i).getNomeProduto())){
								
					int quant = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));

						if(quant <= getProduto(i).getEstoque()){
							getProduto(i).setEstoque(getProduto(i).getEstoque() - quant);
							soma = getProduto(i).getPreco() * quant;
									
							int dialogButton = JOptionPane.YES_NO_OPTION;
									
								JOptionPane.showConfirmDialog(null, "Deseja confirmar a compra?","", JOptionPane.YES_NO_OPTION);
									
									if(dialogButton == JOptionPane.YES_OPTION) {

										int cod = Integer.parseInt(JOptionPane.showInputDialog("Codigo vendedor"));
										if(cod == getAcessoFuncionario().getCodVendedor()){
											int codaux = Integer.parseInt(JOptionPane.showInputDialog("Codigo Cliente"));

											for(int j=0; j<3; j++){
												if(soma <= getCadastroCliente(j).getSaldo() && codaux == getCadastroCliente(j).getCodCliente()){
												getCadastroCliente(j).setSaldo(getCadastroCliente(j).getSaldo() - soma);
												setCaixa(getCaixa() + soma);
												JOptionPane.showMessageDialog(null, "EXTRATO DA COMPRA \n\nNome do Produto : " + getProduto(i).getNomeProduto() + "\nPreço: " +getProduto(i).getPreco() + "\nPreço total: " + soma + "\nComprador :" + getCadastroCliente(j).getNome() + "\nCPF comprador :" + getCadastroCliente(j).getCpf());
												JOptionPane.showMessageDialog(null, "Compra confirmada !");
											}
											
										}

									}
										
								}
						}			
				}
			}
		}
		
	}

	public void caixa(){
		JOptionPane.showMessageDialog(null, "---> CAIXA <---\n\n O saldo do mercado é:" + getCaixa());
	}
	
}
	

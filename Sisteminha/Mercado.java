package Sisteminha;

import javax.swing.JOptionPane;

public class Mercado {

	public static void main(String[] args) {
		
		Produto produto[] = new Produto[5];
		Venda venda;
		CadastroCliente cadastroCliente[] = new CadastroCliente[3];
		AcessoFuncionario acessoFuncionario;
		int k=0;
		
		
		
		produto[0] = new Produto("Arroz", "1", 429, 6.50, 50);
		produto[1] = new Produto("Feijão", "2", 430, 8.50, 50);
		produto[2] = new Produto("Carne", "3", 431, 41.90, 50);
		produto[3] = new Produto("Macarrão", "4", 432, 4.50, 50);
		produto[4] = new Produto("Calabresa", "5", 433, 7.95, 50);
		
		cadastroCliente[0] = new CadastroCliente("", "", "", 500.00, 0, "");
		cadastroCliente[1] = new CadastroCliente("", "", "", 500.00, 0, "");
		cadastroCliente[2] = new CadastroCliente("", "", "", 500.00, 0, "");

		acessoFuncionario = new AcessoFuncionario(null, null, null, 0);
		
		venda = new Venda(0.00, 0, cadastroCliente, produto, acessoFuncionario, "0", 0.0);

		int dialogButton = JOptionPane.YES_NO_OPTION;
		
		JOptionPane.showConfirmDialog(null, "Deseja acessar o sistema?", "Sistema de vendas", dialogButton);
		if (dialogButton == JOptionPane.YES_OPTION) {
			if(venda.login() == true) {
				
				while(true){
					venda.Menu();
					if(venda.getAux().equals("1")) {
						for(int i=0; i<5; i++) {
							produto[i].MostrarProduto();
						}
					}
					else if(venda.getAux().equals("2")) {
						cadastroCliente[k].CadastrarCliente();
						k++;
					}
					else if(venda.getAux().equals("3")) {
						venda.vender();
					}
					else if(venda.getAux().equals("4")){
						venda.caixa();
					}
					else if(venda.getAux().equals("5")){
						for(int i=0; i<3; i++){
							cadastroCliente[i].MostrarCliente();
						}
					}
					else if(venda.getAux().equals("6")){
						break;
					}
				}
			}
				
		}
		else if(dialogButton == JOptionPane.NO_OPTION) {
			System.exit(0);
		}
		
		
		
		
		
		
		
		
	}
}

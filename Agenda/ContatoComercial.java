package Agenda;

import java.util.ArrayList;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.JOptionPane;

public class ContatoComercial extends Contato{
    
    private String nomeEmpresa;
    private String atividade;
    private String endereco;
    private ContatoEletronico contatoEletronico;

    public ContatoComercial(String nome, int numero, String apelido, String nomeEmpresa, String atividade, String endereco, ContatoEletronico contatoEletronico){
        super(nome, numero, apelido);
        this.nomeEmpresa = nomeEmpresa;
        this.atividade = atividade;
        this.endereco = endereco;
        this.contatoEletronico = contatoEletronico;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ContatoEletronico getContatoEletronico() {
        return contatoEletronico;
    }

    public void setContatoEletronico(ContatoEletronico contatoEletronico) {
        this.contatoEletronico = contatoEletronico;
    }

    public void CadastrarContato(ArrayList<ContatoComercial> contatoComerciais){
        setNome(JOptionPane.showInputDialog("Digite o nome do contato"));
        setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero")));
        setNomeEmpresa(JOptionPane.showInputDialog("Digite o nome da empresa"));
        setAtividade(JOptionPane.showInputDialog("Digite a atividade de negocios"));
        setEndereco(JOptionPane.showInputDialog("Digite o endereço"));
        String aux = JOptionPane.showInputDialog("Deseja adicionar um contato eletronico S/N");
        if(aux.equalsIgnoreCase("s")){
            getContatoEletronico().setEmail(JOptionPane.showInputDialog("Digite o email"));
            getContatoEletronico().setHomePage(JOptionPane.showInputDialog("Digite a HomePage"));
        }

        ContatoComercial contComercial = new ContatoComercial(getNome() ,getNumero(), getApelido(), nomeEmpresa, atividade, endereco, contatoEletronico);
        contatoComerciais.add(contComercial);

    }

    public void EditarContato(ArrayList<ContatoComercial> contatoComerciais){
        String aux = JOptionPane.showInputDialog("Digite o nome do contato");
        for(int i=0; i<contatoComerciais.size(); i++){
            if(aux.equalsIgnoreCase(contatoComerciais.get(i).getNome())){
               contatoComerciais.get(i).setNome(JOptionPane.showInputDialog("Digite o nome do contato"));
               contatoComerciais.get(i).setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero")));
               contatoComerciais.get(i).setNomeEmpresa(JOptionPane.showInputDialog("Digite o nome da Empresa"));
                if(contatoComerciais.get(i).getContatoEletronico().getEmail() != null){
                    contatoComerciais.get(i).getContatoEletronico().setHomePage(JOptionPane.showInputDialog("Digite a HomePage"));
                }
                
            }
        }
    }

    public void ApagarContato(ArrayList<ContatoComercial> contatoComerciais){
        String aux = JOptionPane.showInputDialog("Digite o nome do contato");
        for(int i=0; i<contatoComerciais.size(); i++){
            if(aux.equalsIgnoreCase(contatoComerciais.get(i).getNome())){
                contatoComerciais.remove(i);
                JOptionPane.showMessageDialog(null, "Contato apagado com sucesso");
            }
        }
    }

    public void MostrarContato(ArrayList<ContatoComercial> contatoComerciais){
        for(int i=0; i<contatoComerciais.size(); i++){
            JOptionPane.showMessageDialog(null, "Nome: " + contatoComerciais.get(i).getNome() + "\nEndereço: " + contatoComerciais.get(i).getEndereco() + "\nTelefone: " + contatoComerciais.get(i).getNumero() + "\nAtividade: " + contatoComerciais.get(i).getAtividade() + "\nEmail: " + contatoComerciais.get(i).getContatoEletronico().getEmail());
        }
    }
    
        
    

}

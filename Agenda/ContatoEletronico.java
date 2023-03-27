package Agenda;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ContatoEletronico extends Contato{
    
    private String email;
    private String homePage;

    public ContatoEletronico(String nome, int numero, String apelido, String email, String homePage){
        super(nome, numero, apelido);
        this.email = email;
        this.homePage = homePage;
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public void CriarContato(ArrayList<ContatoEletronico> contatoEletronicos){
        setNome(JOptionPane.showInputDialog("Digite o nome do contato"));
        setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero")));
        setEmail(JOptionPane.showInputDialog("Digite o email"));
        setHomePage(JOptionPane.showInputDialog("Digite a HomePage"));

        ContatoEletronico aux = new ContatoEletronico(getNome(), getNumero(), getApelido(), email, homePage);
        contatoEletronicos.add(aux);
        JOptionPane.showMessageDialog(null, "Contato cadastrado com sucesso!");

    }

    public void EditarContato(ArrayList<ContatoEletronico> contatoEletronicos){
        String aux = JOptionPane.showInputDialog("Digite o nome do contato");
        for(int i=0; i<contatoEletronicos.size(); i++){
            if(aux.equalsIgnoreCase(contatoEletronicos.get(i).getNome())){
               contatoEletronicos.get(i).setNome(JOptionPane.showInputDialog("Digite o nome do contato"));
               contatoEletronicos.get(i).setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero")));
               contatoEletronicos.get(i).setEmail(JOptionPane.showInputDialog("Digite o email"));
               contatoEletronicos.get(i).setHomePage(JOptionPane.showInputDialog("Digite a HomePage"));
                JOptionPane.showMessageDialog(null, "Contato editado com sucesso!");
            }
        }
    }

    public void ApagarContato(ArrayList<ContatoEletronico> contatoEletronicos){
        String aux = JOptionPane.showInputDialog("Digite o nome do contato");
        for(int i=0; i<contatoEletronicos.size(); i++){
            if(aux.equalsIgnoreCase(contatoEletronicos.get(i).getNome())){
                contatoEletronicos.remove(i);
                JOptionPane.showMessageDialog(null, "Contato apagado com sucesso!");
            }
        }
    }
    
    public void MostrarContato(ArrayList<ContatoEletronico> contatoEletronicos, ArrayList<Agenda> agendas){
        for(int i=0; i<contatoEletronicos.size(); i++){
            JOptionPane.showMessageDialog(null, "Nome: " + contatoEletronicos.get(i).getNome() + "\nNumero: " + contatoEletronicos.get(i).getNumero() + "\nE-mail: " + contatoEletronicos.get(i).getEmail());
        }
        
    }
}

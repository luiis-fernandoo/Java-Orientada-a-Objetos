package Agenda;

import java.util.ArrayList;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class ContatoPessoal extends Contato{
    
    private String enderecoCasa;
    private int numeroCasa;
    private ContatoEletronico contatoEletronico;

    public ContatoPessoal(String nome, int numero, String apelido, String enderecoCasa, int numeroCasa, ContatoEletronico contatoEletronico){
        super(nome, numero, apelido);
        this.enderecoCasa = enderecoCasa;
        this.numeroCasa = numeroCasa;
        this.contatoEletronico = contatoEletronico;
    }

    public String getEnderecoCasa() {
        return enderecoCasa;
    }

    public void setEnderecoCasa(String enderecoCasa) {
        this.enderecoCasa = enderecoCasa;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public ContatoEletronico getContatoEletronico() {
        return contatoEletronico;
    }

    public void setContatoEletronico(ContatoEletronico contatoEletronico) {
        this.contatoEletronico = contatoEletronico;
    }

    public void CriarContato(ArrayList<ContatoPessoal> contatoPessoais){
        setNome(JOptionPane.showInputDialog("Digite o nome do contato"));
        setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero")));
        setApelido(JOptionPane.showInputDialog("Digite Apelido"));
        setEnderecoCasa(JOptionPane.showInputDialog("Digite o endereço"));
        setNumeroCasa(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da casa")));
        String aux = JOptionPane.showInputDialog("Deseja adicionar um contato eletronico S/N");
        if(aux.equalsIgnoreCase("s")){
           getContatoEletronico().setEmail(JOptionPane.showInputDialog("Digite o email"));
           getContatoEletronico().setHomePage(JOptionPane.showInputDialog("Digite a HomePage"));
        }

        ContatoPessoal contPessoal = new ContatoPessoal(getNome(), getNumero(), getApelido(), enderecoCasa, numeroCasa, contatoEletronico);
        contatoPessoais.add(contPessoal);
        JOptionPane.showMessageDialog(null, "Contato cadastrado com sucesso!");

    }

    public void EditarContato(ArrayList<ContatoPessoal> contatoPessoais){
        String aux = JOptionPane.showInputDialog("Digite o nome do contato");
        for(int i=0; i<contatoPessoais.size(); i++){
            if(aux.equalsIgnoreCase(contatoPessoais.get(i).getNome())){
               contatoPessoais.get(i).setNome(JOptionPane.showInputDialog("Digite o nome do contato"));
               contatoPessoais.get(i).setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero")));
               contatoPessoais.get(i).setEnderecoCasa(JOptionPane.showInputDialog("Digite o nome da Empresa"));
                if(contatoPessoais.get(i).getContatoEletronico().getEmail() != null){
                    contatoPessoais.get(i).getContatoEletronico().setHomePage(JOptionPane.showInputDialog("Digite a HomePage"));
                }
                JOptionPane.showMessageDialog(null, "Contato editado com sucesso!");

                
            }
        }
    }

    public void ApagarContato(ArrayList<ContatoPessoal> contatoPessoais){
        String aux = JOptionPane.showInputDialog("Digite o nome do contato");
        for(int i=0; i<contatoPessoais.size(); i++){
            if(aux.equalsIgnoreCase(contatoPessoais.get(i).getNome())){
                contatoPessoais.remove(i);
                JOptionPane.showMessageDialog(null, "Contato apagado com sucesso!");
            }
        }
    }

    public void MostrarContato(ArrayList<ContatoPessoal> contatoPessoais, ArrayList<Agenda> agendas){
        for(int i=0; i<contatoPessoais.size(); i++){
            JOptionPane.showMessageDialog(null, "Nome: " + contatoPessoais.get(i).getNome() + "\nNumero: " + contatoPessoais.get(i).getNumero() + "\nE-mail: " + contatoPessoais.get(i).getContatoEletronico().getEmail());
        }
    }



}

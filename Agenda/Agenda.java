package Agenda;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Agenda {
    
    private String lembrete;
    private String nomeLembrete;
    private ContatoComercial contatoComercial;
    private ContatoEletronico contatoEletronico;
    private ContatoPessoal contatoPessoal;

    public Agenda (String lembrete, String nomeLembrete, ContatoComercial contatoComercial, ContatoEletronico contatoEletronico, ContatoPessoal contatoPessoal){
        this.lembrete = lembrete;
        this.nomeLembrete = nomeLembrete;
        this.contatoComercial = contatoComercial;
        this.contatoEletronico = contatoEletronico;
        this.contatoPessoal = contatoPessoal;
    }

    public String getLembrete() {
        return lembrete;
    }

    public void setLembrete(String lembrete) {
        this.lembrete = lembrete;
    }

    public ContatoComercial getContatoComercial() {
        return contatoComercial;
    }

    public void setContatoComercial(ContatoComercial contatoComercial) {
        this.contatoComercial = contatoComercial;
    }

    public ContatoEletronico getContatoEletronico() {
        return contatoEletronico;
    }

    public void setContatoEletronico(ContatoEletronico contatoEletronico) {
        this.contatoEletronico = contatoEletronico;
    }

    public ContatoPessoal getContatoPessoal() {
        return contatoPessoal;
    }

    public void setContatoPessoal(ContatoPessoal contatoPessoal) {
        this.contatoPessoal = contatoPessoal;
    }

    public String getNomeLembrete() {
        return nomeLembrete;
    }

    public void setNomeLembrete(String nomeLembrete) {
        this.nomeLembrete = nomeLembrete;
    }

    public void CriarLembrete(ArrayList<Agenda> agendas){
        setNomeLembrete(JOptionPane.showInputDialog("Digite o nome do lembrete"));
        setLembrete(JOptionPane.showInputDialog("Digite o Lembrete"));
        JOptionPane.showMessageDialog(null, "Lembrete Cadastrado com sucesso!");

        Agenda agendas2 = new Agenda(lembrete, nomeLembrete, contatoComercial, contatoEletronico, contatoPessoal);
        agendas.add(agendas2);
    }



    public void EditarLembrete(ArrayList<Agenda> agendas){
        String aux = JOptionPane.showInputDialog("Digite o nome do lembrete");
        for(int i=0; i<agendas.size(); i++){
            if(aux.equalsIgnoreCase(agendas.get(i).getNomeLembrete())){
               agendas.get(i).setNomeLembrete(JOptionPane.showInputDialog("Digite o nome do lembrete"));
               agendas.get(i).setLembrete(JOptionPane.showInputDialog("Digite o Lembrete"));
               JOptionPane.showMessageDialog(null, "Lembrete editado com sucesso!");
            }
        }
    }

    public void ApagarLembrete(ArrayList<Agenda> agendas){
        String aux = JOptionPane.showInputDialog("Digite o nome do Lembrete");
        for(int i=0; i<agendas.size(); i++){
            if(aux.equalsIgnoreCase(agendas.get(i).getLembrete())){
                agendas.remove(i);
                JOptionPane.showMessageDialog(null, "Contato apagado com sucesso!");
            }
        }
    }

    public void MostrarLembrete(ArrayList<Agenda> agendas){
        for(int i=0; i<agendas.size(); i++){
            JOptionPane.showMessageDialog(null, "Nome do lembrete: " + agendas.get(i).getNomeLembrete() + "\nAssunto: " + agendas.get(i).getLembrete());
        }
     
    }

}

package SistemaEscolar;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pessoa {
    
    private String nome;
    private String endereco;
    private int telefone;

    public Pessoa(String nome, String endereco, int telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void Cadastrar(ArrayList<Pessoa> pessoas){
        setNome(JOptionPane.showInputDialog(null, "Digite o nome"));
        setEndereco(JOptionPane.showInputDialog(null, "Digite o endereço"));
        setTelefone(Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone")));

        Pessoa aux = new Pessoa(nome, endereco, telefone);
        pessoas.add(aux);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }


    
}

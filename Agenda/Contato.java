package Agenda;

public class Contato {
    
    private String nome;
    private int numero;
    private String apelido;

    public Contato(String nome, int numero, String apelido){
        this.nome = nome;
        this.numero = numero;
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    
}



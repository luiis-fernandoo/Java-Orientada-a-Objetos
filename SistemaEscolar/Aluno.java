package SistemaEscolar;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa{
    
    private int matricula;
    private boolean situacao = false;
    Turma turma;
    Avaliacao avaliacao;

    public Aluno(String nome, String endereco, int telefone, int matricula, boolean situacao, Avaliacao avaliacao){
        super(nome, endereco, telefone);
        this.matricula = matricula;
        this.situacao = situacao;
        this.avaliacao = avaliacao;
    }

    public void cadastrar(ArrayList<Aluno> alunos){
        setNome(JOptionPane.showInputDialog(null, "--> Digite o nome <--\n\n"));
        setEndereco(JOptionPane.showInputDialog(null, "--> Digite o endereço <--\n\n"));
        setTelefone(Integer.parseInt(JOptionPane.showInputDialog("--> Digite o telefone <--\n\n")));

        Aluno aux = new Aluno(getNome(), getEndereco(), getTelefone(), getMatricula(), isSituacao(), getAvaliacao());
        alunos.add(aux);
    }

    public void MostrarAlunos(ArrayList<Aluno> alunos){
        for(int i=0; i<alunos.size(); i++){
            JOptionPane.showMessageDialog(null, "Nome Aluno: " + alunos.get(i).getNome() + "\nEndereço: " + alunos.get(i).getEndereco() + "\nTelefone: " + alunos.get(i).getTelefone() + "\nMatricula: " + alunos.get(i).getMatricula());
        }
    }

    public void Editar(ArrayList<Aluno> alunos){
        int aux = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Matricula do aluno"));
        for(int i=0; i<alunos.size(); i++){
            if(aux == alunos.get(i).getMatricula()){
                alunos.get(i).setNome(JOptionPane.showInputDialog(null, "Digite o nome do Aluno"));
                alunos.get(i).setEndereco(JOptionPane.showInputDialog(null, "Digite o endereço"));
                alunos.get(aux).setTelefone(Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone")));
            }
        }
    }
    

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    
}

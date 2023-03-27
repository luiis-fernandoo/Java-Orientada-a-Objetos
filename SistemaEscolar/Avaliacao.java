package SistemaEscolar;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Avaliacao {
    
    private double nota1;
    private double nota2;
    private double provaFinal;
    private int frequencia;
    Aluno aluno;
    Turma turma;

    public Avaliacao(double nota1, double nota2, double provaFinal, int frequencia, Aluno aluno){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.provaFinal = provaFinal;
        this.frequencia = frequencia;
        this.aluno = aluno;
    }

    public Avaliacao(double nota1, double nota2, double provaFinal, int frequencia){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.provaFinal = provaFinal;
        this.frequencia = frequencia;
    }

    public void LancarAvaliacao(ArrayList<Avaliacao> avaliacoes, ArrayList<Turma> turmas, ArrayList<Aluno> alunos){
        String aux = JOptionPane.showInputDialog("Digite o nome do aluno");
        int indice=0;
        for(int i=0; i<alunos.size(); i++){
            if(aux.equals(alunos.get(i).getNome())){
                indice = i;
                setNota1(Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 1")));
                setNota2(Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 2")));
                double media = (getNota1() + getNota2()) / 2;
                if(media >= 7){
                    JOptionPane.showMessageDialog(null, "Aluno aprovado");
                    setProvaFinal(media);
                }
                else if(media<7){
                    JOptionPane.showMessageDialog(null, "Aluno reprovado");
                    setProvaFinal(media);
                }
                
            }

            Avaliacao inter = new Avaliacao(getNota1(), getNota2(), getProvaFinal(), frequencia, alunos.get(indice));
            avaliacoes.add(inter);
        }
    }

    public void MostrarAvaliação(ArrayList<Avaliacao> avaliacoes, ArrayList<Aluno> alunos){
        int aux = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a matricula do aluno"));
        for(int i=0; i<avaliacoes.size();i++){
            if(aux == avaliacoes.get(i).getAluno().getMatricula()){
                JOptionPane.showMessageDialog(null, "Nota final:" + avaliacoes.get(i).getProvaFinal()+ "\nNome aluno: " + avaliacoes.get(i).getAluno().getNome() + "\nMatricula Aluno: " + avaliacoes.get(i).getAluno().getMatricula() );
            }
        }
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getProvaFinal() {
        return provaFinal;
    }

    public void setProvaFinal(double provaFinal) {
        this.provaFinal = provaFinal;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    } 

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
}

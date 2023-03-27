package SistemaEscolar;

import java.util.ArrayList;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class Turma {
    
    private int ano;
    private int semestre;
    private String horario;
    private int idTurma;
    Aluno aluno;
    Professor professor;


    public Turma(int ano, int semestre, String horario, int idTurma){
        this.ano = ano;
        this.semestre = semestre;
        this.horario = horario;
        this.idTurma = idTurma;
    }

    public Turma(int ano, int semestre, String horario, int idTurma, Professor professor){
        this.ano = ano;
        this.semestre = semestre;
        this.horario = horario;
        this.idTurma = idTurma;
        this.professor = professor;
    }

    
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getIdTurma() {
        return idTurma;
    }


    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }


    int cont=0;
    public void AbrirTurma(ArrayList<Turma> turmas, ArrayList<Aluno> alunos, ArrayList<Professor> professores){
        cont ++;
        setIdTurma(cont);
        setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano")));
        setSemestre(Integer.parseInt(JOptionPane.showInputDialog("Digite o semestre")));
        setHorario(JOptionPane.showInputDialog("Digite o horario"));

        Turma turm = new Turma(ano, semestre, horario, idTurma, professor);
        turmas.add(turm);
    }

    public void AlocarProfessor(ArrayList<Professor> professores, ArrayList<Turma> turmas){
        String aux = JOptionPane.showInputDialog(null, "Digite o nome do professor");
        for(int i=0; i<professores.size(); i++){
            if(aux.equals(professores.get(i).getNome())){
                int aux1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da turma"));
                for(int j=0; j<turmas.size(); j++){
                    if(aux1 == turmas.get(j).getIdTurma()){
                        turmas.get(j).getProfessor().setNome(aux);
                    }
                }
            }
        }
    }
    int mat = 1000;
    public void MatricularAluno(ArrayList<Aluno> alunos, ArrayList<Turma> turmas){
        String aux = JOptionPane.showInputDialog(null, "Digite o nome do aluno ");
            for(int i=0; i<alunos.size(); i++){
                if(aux.equals(alunos.get(i).getNome())){ 
                    mat++;
                   alunos.get(i).setMatricula(mat);
                }
            }
    }

    public void MostrarTurma(ArrayList<Turma> turmas){
        for(int i=0; i<turmas.size(); i++){
            JOptionPane.showMessageDialog(null, "ID Turma: " + turmas.get(i).getIdTurma() + "\nHorario: " + turmas.get(i).getHorario() + "\nAno: " + turmas.get(i).getAno() + "\nSemestre: " + turmas.get(i).getSemestre() + "\nProfessor alocado: " + turmas.get(i).getProfessor().getNome());
        }
    }



}

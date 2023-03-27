package SistemaEscolar;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Professor extends Pessoa{
    
    private String titulacaoMax;
    Turma turma;
    int i;

    public Professor(String nome, String endereco, int telefone, String titulacaoMax, Turma turma){
        super(nome, endereco, telefone);
        this.titulacaoMax = titulacaoMax;
        this.turma = turma;
    }

    
    public Turma getTurma() {
        return turma;
    }


    public void setTurma(Turma turma) {
        this.turma = turma;
    }


    public String getTitulacaoMax() {
        return titulacaoMax;
    }

    public void setTitulacaoMax(String titulacaoMax) {
        this.titulacaoMax = titulacaoMax;
    }

    public void CadastrarProfessor(ArrayList<Professor> professores){

        setNome(JOptionPane.showInputDialog(null, "Digite o nome do professor"));
        setEndereco(JOptionPane.showInputDialog(null, "Digite o endereço"));
        setTelefone(Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone")));
        setTitulacaoMax(JOptionPane.showInputDialog(null, "Digite a titulação do professor"));

        Professor prof = new Professor(getNome(), getEndereco(), getTelefone(), getTitulacaoMax(), getTurma());
        professores.add(prof);

    }

    public void MostrarProfessores(ArrayList<Professor> professores){
        for(int i=0; i<professores.size(); i++){
            JOptionPane.showMessageDialog(null, "Nome: " + professores.get(i).getNome() + "\nEndereço: " + professores.get(i).getEndereco() + "\nTelefone: " + professores.get(i).getTelefone() + "\nTitulação Maxima: " + professores.get(i).getTitulacaoMax() + "\nTurma: " + professores.get(i).getTurma().getIdTurma());
        }
    }

    public void Editar(ArrayList<Professor> professores){
        String aux = JOptionPane.showInputDialog(null, "Digite o Nome do Professor");
        for(int i=0; i<professores.size(); i++){
            if(aux.equals(professores.get(i).getNome())){
                professores.get(i).setNome(JOptionPane.showInputDialog(null, "Digite o nome do Professor"));
                professores.get(i).setEndereco(JOptionPane.showInputDialog(null, "Digite o endereço"));
                professores.get(i).setTelefone(Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone")));
                professores.get(i).setTitulacaoMax(JOptionPane.showInputDialog("Digite a Titulação Maxima"));
            }
        }
    }
}

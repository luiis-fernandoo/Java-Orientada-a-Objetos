package SistemaEscolar;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Disciplina {
    
    private int codDisciplina;
    private String descricao;
    private int cargaHoraria;

    public Disciplina(int codDisciplina, String descricao, int cargaHoraria){
        this.codDisciplina = codDisciplina;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void CadastrarDisciplina(ArrayList<Disciplina> disciplinas){
        int cont = 0;
        cont++;
        setDescricao(JOptionPane.showInputDialog(null, "Digite a descrição do curso"));
        setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a carga horaria")));
        setCodDisciplina(cont);

        Disciplina aux = new Disciplina(cont, descricao, cont);
        disciplinas.add(aux);
    }

    public void ApagarDisciplina(ArrayList<Disciplina> disciplinas){
        int aux = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo da disciplina"));
        for(int i=0; i<disciplinas.size(); i++){
            if(aux == disciplinas.get(i).getCodDisciplina());
            disciplinas.remove(i);
            JOptionPane.showMessageDialog(null, "Disciplina Apagada com sucesso");
        }
    }

    public void MostrarCurso(ArrayList<Disciplina> disciplinas){
        for (int i=0; i<disciplinas.size(); i++){
            JOptionPane.showMessageDialog(null, "Descrição do curso: " + disciplinas.get(i).getDescricao() + "\nCarga Horaria: " + disciplinas.get(i).getCargaHoraria() + "\nCodigo da Disciplina: " + disciplinas.get(i).getCodDisciplina());
        }
    }
    
}

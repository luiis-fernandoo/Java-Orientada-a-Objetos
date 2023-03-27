package SistemaEscolar;

import java.util.ArrayList;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class Curso {
    
    private int codInscricao;
    private String descricao;

    public Curso(int codInscricao, String descricao){
        this.codInscricao = codInscricao;
        this.descricao = descricao;
    }

    public void CadastrarCurso(ArrayList<Curso> cursos){
        int cont = 000;
        cont++;
        setCodInscricao(cont);
        setDescricao(JOptionPane.showInputDialog(null, "descrição do curso"));

        Curso aux = new Curso(cont, descricao);
        cursos.add(aux);
        

    }

    public void ApagarCurso(ArrayList<Curso> cursos){
        int aux = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo do curso"));
        for(int i=0; i<cursos.size(); i++){
            if(aux == cursos.get(i).getCodInscricao());
            cursos.remove(i);
            JOptionPane.showMessageDialog(null, "Curso apagado com sucesso!");
        }
    }

    public void MostrarCursos(ArrayList<Curso> cursos){
        for(int i=0; i<cursos.size(); i++){
            JOptionPane.showMessageDialog(null, "Codigo Curso: " + cursos.get(i).getCodInscricao() + "\nDescrição: " + cursos.get(i).getDescricao());
        }
    }

    public int getCodInscricao() {
        return codInscricao;
    }

    public void setCodInscricao(int codInscricao) {
        this.codInscricao = codInscricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    
}

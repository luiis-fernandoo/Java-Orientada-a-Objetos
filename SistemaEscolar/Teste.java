package SistemaEscolar;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Teste {
    

    public static void main(String[] args) {
        Aluno aluno;
        Professor professor;
        Pessoa pessoa;
        Curso curso;
        Disciplina disciplina;
        Turma turma;
        Avaliacao avaliacao;

        turma = new Turma(0, 0, null, 0);
        avaliacao = new Avaliacao(0, 0, 0, 0);
        aluno = new Aluno("", "", 0, 0, false, avaliacao);
        professor = new Professor(null, null, 0, null, turma);
        pessoa = new Pessoa(null, null, 0);
        curso = new Curso(0, null);
        disciplina = new Disciplina(0, null, 0);
        turma = new Turma(0, 0, null, 0, professor);
        avaliacao = new Avaliacao(0, 0, 0, 0, aluno);
        

        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Curso> cursos = new ArrayList<>();
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        ArrayList<Turma> turmas = new ArrayList<>();
        ArrayList<Avaliacao> avaliacoes = new ArrayList<>();

        while(true){
            String aux = JOptionPane.showInputDialog(null, "----> MENU <---- \n\n1-Gerenciar Aluno \n2-Gerenciar Professor \n3-Gerenciar Curso \n4-Gerenciar Disciplina \n5-Gerenciar Turma \n6-Gerar Avaliação \n7-Sair \n\nDigite o comando");
            if(aux.equals("1")){
                String aux1 = JOptionPane.showInputDialog(null, "---> MENU <--- \n\n 1-Cadastrar Aluno \n2-Editar Aluno \n3-Visualizar Aluno \n4-Obter Avaliações \n\nDigite o codigo");                
                if(aux1.equals("1")){
                    aluno.cadastrar(alunos); 
                }
                else if(aux1.equals("2")){
                    aluno.Editar(alunos);
                }
                else if(aux1.equals("3")){
                    aluno.MostrarAlunos(alunos);
                }
            }
            else if(aux.equals("2")){
                String aux1 = JOptionPane.showInputDialog(null, "---> MENU <--- \n\n 1-Cadastrar Professor \n2-Editar Professor \n3-Visualizar Professor  \n\nDigite o codigo");
                if(aux1.equals("1")){
                    professor.CadastrarProfessor(professores);
                }
                else if(aux1.equals("2")){
                    professor.Editar(professores);
                }
                else if(aux1.equals("3")){
                    professor.MostrarProfessores(professores);
                }
            }
            else if(aux.equals("3")){
                String aux1 = JOptionPane.showInputDialog(null, "---> MENU <--- \n\n 1-Cadastrar Curso \n2-Apagar Curso \n3-Visualizar Curso \n\nDigite o comando");
                if(aux1.equals("1")){
                    curso.CadastrarCurso(cursos);
                }
                else if(aux1.equals("2")){
                    curso.ApagarCurso(cursos);
                }
                else if(aux1.equals("3")){
                    curso.MostrarCursos(cursos);
                }

            }
            else if(aux.equals("4")){
                String aux1 = JOptionPane.showInputDialog(null, "---> MENU <--- \n\n 1-Cadastrar Disciplina \n2-Apagar Disciplina \n3-Mostrar Curso \n\nDigite o comando");
                if(aux1.equals("1")){
                    disciplina.CadastrarDisciplina(disciplinas);
                }
                else if(aux1.equals("2")){
                    disciplina.ApagarDisciplina(disciplinas);
                }
                else if(aux1.equals("3")){
                    disciplina.MostrarCurso(disciplinas);
                }
            }
            else if(aux.equals("5")){
                String aux1 = JOptionPane.showInputDialog(null, "---> MENU <--- \n\n 1-Abrir Turma \n2-Alocar Professor \n3-Matricular Aluno \n4-Mostrar turma \n\nDigite o comando");
                if(aux1.equals("1")){
                    turma.AbrirTurma(turmas, alunos, professores);
                }
                else if(aux1.equals("2")){
                    turma.AlocarProfessor(professores, turmas);
                }
                else if(aux1.equals("3")){
                    turma.MatricularAluno(alunos, turmas);
                }
                else if(aux1.equals("4"))
                {
                    turma.MostrarTurma(turmas);
                }
            }
            else if(aux.equals("6")){
                String aux1 = JOptionPane.showInputDialog(null, "---> MENU <--- \n\n1-Lancar Avaliação \n2-Visualizar \n\nDigite o comando");
                if(aux1.equals("1")){
                    avaliacao.LancarAvaliacao(avaliacoes, turmas, alunos);
                }
                if(aux1.equals("2")){
                    avaliacao.MostrarAvaliação(avaliacoes, alunos);
                }
            }

        }
    }
        
}

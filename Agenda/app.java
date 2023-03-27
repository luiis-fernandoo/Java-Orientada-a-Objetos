package Agenda;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class app {
    
    public static void main(String[] args) {
        
        Agenda agenda;
        Contato contato;
        ContatoComercial contatoComercial;
        ContatoEletronico contatoEletronico;
        ContatoPessoal contatoPessoal;

        
        contato = new Contato(null, 0, null);
        contatoEletronico = new ContatoEletronico(null, 0, null, null, null);
        contatoPessoal = new ContatoPessoal(null, 0, null, null, 0, contatoEletronico);
        contatoComercial = new ContatoComercial(null, 0, null, null, null, null, contatoEletronico);
        agenda = new Agenda(null, null, contatoComercial, contatoEletronico, contatoPessoal);


        ArrayList<ContatoEletronico> contatoEletronicos = new ArrayList<>();
        ArrayList<ContatoComercial> contatoComerciais = new ArrayList<>();
        ArrayList<ContatoPessoal> contatoPessoais = new ArrayList<>();
        ArrayList<Agenda> agendas = new ArrayList<>();

    while(true){
        String aux = JOptionPane.showInputDialog("---> MENU <--- \n\n1-Gerenciar Contato Eletronico \n2-Gerenciar Contato Comercial \n3-Gerenciar Contato Pessoal \n4-Gerenciar Agenda");
        if(aux.equals("1")){
            String aux1 = JOptionPane.showInputDialog("---> Gerenciar Contato Eletronico <--- \n\n1-Criar Contato \n2-Editar Contato \n3-Apagar Contato \n4-Mostrar Contatos");
            if(aux1.equals("1")){
                contatoEletronico.CriarContato(contatoEletronicos);
            }
            else if(aux1.equals("2")){
                contatoEletronico.EditarContato(contatoEletronicos);
            }
            else if(aux1.equals("3")){
                contatoEletronico.ApagarContato(contatoEletronicos);
            }
            else if(aux1.equals("4")){
                contatoEletronico.MostrarContato(contatoEletronicos, agendas);
            }
        }
        else if(aux.equals("2")){
            String aux1 = JOptionPane.showInputDialog("---> Gerenciar Contato Comercial <--- \n\n1-Criar Contato \n2-Editar Contato \n3-Apagar Contato \n4-Mostrar Contatos");
            if(aux1.equals("1")){
                contatoComercial.CadastrarContato(contatoComerciais);
            }
            else if(aux1.equals("2")){
                contatoComercial.EditarContato(contatoComerciais);
            }
            else if(aux1.equals("3")){
                contatoComercial.ApagarContato(contatoComerciais);
            }
            else if(aux1.equals("4")){
                contatoComercial.MostrarContato(contatoComerciais);
            }
        }
        else if(aux.equals("3")){
            String aux1 = JOptionPane.showInputDialog("---> Gerenciar Contato Pessoal <--- \n\n1-Criar Contato \n2-Editar Contato \n3-Apagar Contato \n4-Mostrar Contatos");
            if(aux1.equals("1")){
                contatoPessoal.CriarContato(contatoPessoais);
            }
            else if(aux1.equals("2")){
                contatoPessoal.EditarContato(contatoPessoais);
            }
            else if(aux1.equals("3")){
                contatoPessoal.ApagarContato(contatoPessoais);
            }
            else if(aux1.equals("4")){
                contatoPessoal.MostrarContato(contatoPessoais, agendas);
            }
        }
        else if((aux.equals("4"))){
            String aux1 = JOptionPane.showInputDialog("---> Gerenciar Agenda <--- \n\n1-Criar Lembrete \n2-Editar Lembrete \n3-Mostrar Lembretes");
            if(aux1.equals("1")){
                agenda.CriarLembrete(agendas);
            }
            else if(aux1.equals("2")){
                agenda.EditarLembrete(agendas);
            }
            else if(aux1.equals("3")){
                agenda.MostrarLembrete(agendas);
            }
        }
    
    }
    }
}

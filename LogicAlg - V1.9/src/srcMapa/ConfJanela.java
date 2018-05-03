//CONFIGURAÇÃO DA JANELA QUE IRA ABRIR QUANDO EXECUTAR O PROGRAMA
package srcMapa;//NOME DO PACOTE ONDE ESTA A CLASSE

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class ConfJanela extends JFrame {//CLASSE EXTENDIDA DO Jframe UM ????? PARA CRIAR CENARIOS

    private static JFrame trocatela;
    private static JFrame janelaconf;
    
public ConfJanela(){//CONSTRUTOR DA CLASSE
    janelaconf = new JFrame();
    JMenuBar barramenu = new JMenuBar();
    JMenu menu = new JMenu("Menu");
    JMenuItem sair = new  JMenuItem("Voltar ao Menu Principal");
    sair.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
      new Menu(); //instanciando a classe meu frame para poder usar os metodos dela.
      trocatela = Menu.getInstancia();
     // trocatela.setExtendedState(JFrame.MAXIMIZED_BOTH); 
      trocatela.show();
     dispose();
    }
    });    
   
    
    menu.add(sair);
    barramenu.add(menu);
    janelaconf.setJMenuBar(barramenu);   
    
    
    
   janelaconf.add(new Fase());//CRIANDO UMA NOVA FASE - A PARTIR DE "src.Fase.java"
    

    //CRIANDO UMA NOVA JANELA

    janelaconf.setTitle("LogicAlg - BETA");// TITULO DA JANELA
    Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();//pega o tamanho da resolução da tela
    int telalar = (int) tela.getWidth();//pega a largura da tela
    int telaalt = (int) tela.getHeight();//pega a altura da tela
    janelaconf.setSize(1280,1024);//coloca a altura e largura específica da resolução do monitor
    janelaconf.setUndecorated(false);
    janelaconf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//FECHAR PROGRAMA QUANDO APERTAR NO "X"
    janelaconf.setLocationRelativeTo(null);//A JANELA ABRIR NO CENTRO NA TELA
    janelaconf.setResizable(false);//ALTERAR O TAMANHO DA JANELA 
    janelaconf.setVisible(true);//APARECER A TELA    
    }  

public static JFrame getInstancia(){
    return janelaconf;
}
}

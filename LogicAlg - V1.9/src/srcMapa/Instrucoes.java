package srcMapa;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Instrucoes extends JFrame {
    //private static JFrame inimapa;
    private static JFrame trocatela;
private static JFrame instrucao;
private static JButton prox;
private static JButton btnvoltar;

public Instrucoes() {
    instrucao = new JFrame();
        JDesktopPane desktop = new JDesktopPane(){
            Image im = (new ImageIcon("src\\ImagemMapa\\MAPA_TELA_02.png")).getImage();
            @Override
            public void paintComponent(Graphics g){
                g.drawImage(im,-0,-0,this);            }
        };
  
    prox = new JButton(">>");
    prox.setBounds(1780, 505, 50, 50);//(1780, 505, 50, 50);
    btnvoltar = new JButton("<<");
    btnvoltar.setBounds(45, 505, 50, 50);//(45, 505, 50, 50)
    
    btnvoltar.setBackground(new Color(255,255,255));
    prox.setBackground(new Color(255,255,255));
    
    instrucao.setTitle("LogicAlg - BETA");
    Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();//pega o tamanho da resolução da tela
    int telalar = (int) tela.getWidth();//pega a largura da tela
    int telaalt = (int) tela.getHeight();//pega a altura da tela
    //desktop.setSize(1280,720);
    instrucao.setSize(1900,980);//coloca a altura e largura específica da resolução do monitor
    instrucao.setUndecorated(false);
    instrucao.setDefaultCloseOperation(EXIT_ON_CLOSE);
    instrucao.setLocationRelativeTo(null);
    instrucao.setVisible(true);
    instrucao.setResizable(true);
    BtnProx executar = new BtnProx();
    prox.addActionListener(executar); 

    BtnVoltarAtras retornar = new BtnVoltarAtras();
    btnvoltar.addActionListener(retornar);
    desktop.add(prox);
    desktop.add(btnvoltar);
    instrucao.add(desktop);
 
}


public class BtnProx implements ActionListener {

   @Override
   public void actionPerformed( ActionEvent e ){

   if (e.getSource()== prox){
    new Objetivos();
     trocatela = Objetivos.getInstancia();
    //trocatela.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    trocatela.show();
    instrucao.dispose();
    }          
    }
   }

public class BtnVoltarAtras implements ActionListener {

   @Override
   public void actionPerformed( ActionEvent e ){

   if (e.getSource()==btnvoltar){
      new InicioMapa(); //instanciando a classe meu frame para poder usar os metodos dela.
      trocatela = InicioMapa.getInstancia();
      //trocatela.setExtendedState(JFrame.MAXIMIZED_BOTH); 
      trocatela.show();
      instrucao.dispose();
    }          
    }
   }


public static JFrame getInstancia(){
    return instrucao;
}
}

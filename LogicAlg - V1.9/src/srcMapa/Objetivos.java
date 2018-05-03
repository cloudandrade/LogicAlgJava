
package srcMapa;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Objetivos extends JFrame {
private static JFrame trocatela;
private static JButton prox;
private static JButton btnvoltar;
private static JFrame janelaobj;

public Objetivos() {
     janelaobj = new JFrame();
        JDesktopPane desktop = new JDesktopPane(){
            Image im = (new ImageIcon("src\\ImagemMapa\\MAPA_TELA_03.png")).getImage();
            @Override
            public void paintComponent(Graphics g){
                g.drawImage(im,-0,-0,this);            }
        };
    
    // Pegar_Imagem = new ImageIcon("src\\ImagemMapa\\MAPA_TELA_03.png");
    //Objetivos = new JButton(Pegar_Imagem);
    //add(Objetivos);
    janelaobj.setTitle("LogicAlg - BETA");
    janelaobj.setDefaultCloseOperation(EXIT_ON_CLOSE);
    janelaobj.setSize(1280,1024);//
    //desktop.setSize(1280,720);//coloca a altura e largura específica da resolução do monitor
    janelaobj.setUndecorated(false);
    janelaobj.setLocationRelativeTo(null);
    janelaobj.setVisible(true);
    janelaobj.setResizable(true);
    prox = new JButton(">>");
    prox.setBounds(1150, 500, 100, 50);//
    btnvoltar = new JButton("<<");
    btnvoltar.setBounds(25, 500, 100, 50);//
     BtnProx executar = new BtnProx();
    prox.addActionListener(executar); 
    BtnVoltarAtras retornar = new BtnVoltarAtras();
    btnvoltar.addActionListener(retornar);
    desktop.add(prox);
    desktop.add(btnvoltar);
    janelaobj.add(desktop);
    
    
    
    
    
  
}

public class BtnProx implements ActionListener {

   @Override
   public void actionPerformed( ActionEvent e ){

   if (e.getSource()== prox){
    new ConfJanela();
    trocatela = ConfJanela.getInstancia();
    trocatela.show();
    janelaobj.dispose();
    }          
    }
   }

public class BtnVoltarAtras implements ActionListener {

   @Override
   public void actionPerformed( ActionEvent e ){

   if (e.getSource()==btnvoltar){
      new Instrucoes(); //instanciando a classe meu frame para poder usar os metodos dela.
      trocatela = Instrucoes.getInstancia();
     // trocatela.setExtendedState(JFrame.MAXIMIZED_BOTH); 
      trocatela.show();
      janelaobj.dispose();
    }          
    }
   }

public static JFrame getInstancia(){
    return janelaobj;
}

}

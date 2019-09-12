package srcMapa;

import java.awt.Color;
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

public class InicioMapa extends JFrame {

    private static JFrame inimapa;
    private static JFrame trocatela;
    private static JButton btninicio;  
    private static JButton btnvoltarMenu;

public InicioMapa(){
        inimapa = new JFrame();
        
        JDesktopPane desktop = new JDesktopPane(){
            Image im = (new ImageIcon("src\\ImagemMapa\\MAPA_TELA_01.png")).getImage();
            
            @Override
            public void paintComponent(Graphics g){
            g.drawImage(im,-0,-0,this);           
            }
        };
// aplica color transparent
//btninicio.setBackground(new Color(0,0,0,0));

    btninicio = new JButton(">>");//btninicio = new JButton(">>");
    btninicio.setBounds(1268,365, 60, 35);//X - Y - TAMNHO LARG - TAMNHO ALT
    btnvoltarMenu = new JButton("<<");//btnvoltarMenu = new JButton("<<");
    btnvoltarMenu.setBounds(35, 364, 60, 35);//
    
    btninicio.setBackground(new Color(255,255,255));
    btnvoltarMenu.setBackground(new Color(255,255,255));
    
    inimapa.setTitle("LogicAlg - BETA");
    inimapa.setSize(1366,768);
    inimapa.setUndecorated(true);
    inimapa.setDefaultCloseOperation(EXIT_ON_CLOSE);
    inimapa.setLocationRelativeTo(null);
    inimapa.setVisible(true);
    inimapa.setResizable(true);
    BtnProx executar = new BtnProx();
    btninicio.addActionListener(executar);
    BtnMenu retornar = new BtnMenu();
    btnvoltarMenu.addActionListener(retornar);
    desktop.add(btninicio);
    desktop.add(btnvoltarMenu);
    inimapa.add(desktop);
}

public class BtnProx implements ActionListener {

   @Override
   public void actionPerformed( ActionEvent e ){

   if (e.getSource()==btninicio){
        new Instrucoes(); //instanciando a classe meu frame para poder usar os metodos dela.
    
   trocatela = Instrucoes.getInstancia();
    //trocatela.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    trocatela.show();
    inimapa.dispose();
    }          
    }
   }

public class BtnMenu implements ActionListener {

   @Override
   public void actionPerformed( ActionEvent e ){

   if (e.getSource()==btnvoltarMenu){
      new Menu(); //instanciando a classe meu frame para poder usar os metodos dela.
      trocatela = Menu.getInstancia();
     // trocatela.setExtendedState(JFrame.MAXIMIZED_BOTH); 
      trocatela.show();
      inimapa.dispose();
    }          
    }
   }



public static JFrame getInstancia(){
    return inimapa;
}
}

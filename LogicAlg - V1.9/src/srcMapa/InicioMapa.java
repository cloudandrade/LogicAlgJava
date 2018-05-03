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

    btninicio = new JButton(">>");
    btninicio.setBounds(1150, 500, 100, 50);//
    btnvoltarMenu = new JButton("<<");
    btnvoltarMenu.setBounds(25, 500, 100, 50);//
    
    inimapa.setTitle("LogicAlg - BETA");
    inimapa.setSize(1280,1024);
    inimapa.setUndecorated(false);
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

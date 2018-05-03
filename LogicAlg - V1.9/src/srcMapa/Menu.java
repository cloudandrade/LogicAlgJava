//MENU DO JOGO
package srcMapa;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Menu extends JFrame{
    
private static JFrame inimenu;
private static JFrame trocatela;
private static JButton jogar; 
private static JButton sobre;
private static JButton sair;


public Menu(){
    
    
       inimenu = new JFrame();
       
        JDesktopPane desktop = new JDesktopPane(){
        Image im = (new ImageIcon("src\\ImagemMapa\\MENU.png")).getImage();
            
              @Override
              public void paintComponent(Graphics g){
              g.drawImage(im,0,0,this);
              }
        };

    
    jogar = new JButton("Novo Jogo");
    jogar.setBounds(450, 300, 400, 50);//posição e tamanho do botão. px=da esquerda p direita,py=cima p baixo,x=largura,y=altura.
    sobre = new JButton("Sobre");
    sobre.setBounds(450, 400, 400, 50);
    sair = new JButton("Sair");
    sair.setBounds(450, 500, 400, 50);
    


    inimenu.setUndecorated(false);//tira a barra de titulo e a possibilidade de minimizar ou fechar o programa
    inimenu.setTitle("LogicAlg - BETA");
    inimenu.setSize(1280,1024);//coloca a altura e largura específica da resolução do monitor
    inimenu.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//diz se ele pode ser fechado no [x] ou não
    inimenu.setLocationRelativeTo(null);
    inimenu.setVisible(true);
    inimenu.setResizable(true);
    
    
    BtnJogar executar = new BtnJogar();//chamando o metodo actionlistener de jogar
    jogar.addActionListener(executar);//adicionando o método ao botão
    BtnSair fechar = new BtnSair();//chamando o metodo actionlistener de sair
    sair.addActionListener(fechar);//adicionando o metodo ao botao
    BtnSobre info = new BtnSobre();//chamando o metodo actionlistener de sair
    sobre.addActionListener(info);//adicionando o metodo ao botao
    
    desktop.add(jogar);//adicionando o botão ao painel
    desktop.add(sobre);//adicionando o botão ao painel
    desktop.add(sair);//adicionando o botão ao painel
    
    inimenu.add(desktop);//adicionando o painel a JFrame
    
    Som.play("BGM_MENU");//executando o som
}

public class BtnJogar implements ActionListener {

   @Override
   public void actionPerformed( ActionEvent e ){

   if (e.getSource()==jogar){
     new InicioMapa(); //instanciando a classe meu frame para poder usar os metodos dela.
     trocatela = InicioMapa.getInstancia(); 
     trocatela.show();
     inimenu.dispose();
    }          
    }
   }

public class BtnSair implements ActionListener {

   @Override
   public void actionPerformed( ActionEvent e ){

   if (e.getSource()==sair){
    System.exit(0);
    }          
    }
   }

public class BtnSobre implements ActionListener {

   @Override
   public void actionPerformed( ActionEvent e ){

   if (e.getSource()==sobre){
       JOptionPane.showMessageDialog(null,"                                                                         LogicAlg \n "
               + "Este jogo tem como objetivo ensinar lógica de programação de forma simples e dinâmica."
               + "\n Este Jogo Encontra-se ainda em desenvolvimento."
               + "\n\n"
               + "                                    Desenvolvedores: Keven,Leonardo,Erik,Rafael,Jan Cloude",
               "Sobre", JOptionPane.INFORMATION_MESSAGE);
    }          
    }
   }


public static JFrame getInstancia(){
    return inimenu;
}

}








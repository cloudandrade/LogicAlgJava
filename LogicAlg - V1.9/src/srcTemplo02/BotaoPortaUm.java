
package srcTemplo02;

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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import srcMapa.InicioMapa;
import srcMapa.Instrucoes;
import srcMapa.Objetivos;
import srcMapa.Templo01;
import srcT1P1.JanelasT1P1;


public class BotaoPortaUm extends JFrame{
       private JButton oplogicos;
    
    
  public BotaoPortaUm() {
         JMenuBar barramenu = new JMenuBar();
    JMenu menu = new JMenu("Menu");
    JMenuItem desenvolvedores = new  JMenuItem("Desenvolvedores");
    desenvolvedores.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
    JOptionPane.showMessageDialog(null,"LogicAlg - Projeto desenvolvido por Leonardo dos Santos Esteves - Keven Pacheco Baraúna - Raphael Carvalho Monteiro - Erick Vinicius Pinto dos Santos", "Iinformações", JOptionPane.INFORMATION_MESSAGE);
    }});        
    JMenuItem sair = new  JMenuItem("Sair do Programa");
    sair.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
    System.exit(0);
    }});    
    menu.add(desenvolvedores);
    menu.add(sair);
    barramenu.add(menu);
    setJMenuBar(barramenu);         
    Icon Pegar_Imagem = new ImageIcon("src\\ImagemTemplo02\\facil.png ");

    oplogicos = new JButton(Pegar_Imagem);
    add(oplogicos);
    setTitle("TEMPLO 02");
    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    setSize(1280,1024);
    setUndecorated(true);
    setLocationRelativeTo(null);
    setVisible(true);
    setResizable(false);
    BotaoPortaUm.EscolhaBotao executar = new BotaoPortaUm.EscolhaBotao();
    oplogicos.addActionListener(executar);  
    //setExtendedState(JFrame.MAXIMIZED_BOTH); 

    }
    
    
    
    private class EscolhaBotao implements ActionListener {
    int resultado=0;
    String s="";
    @Override
    public void actionPerformed( ActionEvent e ){

    if (e.getSource()==oplogicos){
    new JanelasT1P1();
    dispose();
    }          
    }
    }
}

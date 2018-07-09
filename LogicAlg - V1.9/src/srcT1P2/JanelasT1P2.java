
package srcT1P2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import srcMapa.ConfJanela;
import srcMapa.Som;

public class JanelasT1P2 extends JFrame{

    private static JFrame jt1p2;
    
public JanelasT1P2() {
    jt1p2 = new JFrame("Casa 04 - Variáveis");
    JMenuBar barramenu = new JMenuBar();
    JMenu menu = new JMenu("Menu");
    JMenu opcoes = new JMenu("Voltar para o Mapa Principal");
    JMenuItem sobre = new  JMenuItem("Sobre");
    sobre.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {

    JOptionPane.showMessageDialog(null,"LogicAlg_______", "Informações", JOptionPane.INFORMATION_MESSAGE);
    }
    });
    JMenuItem sair = new  JMenuItem("Sair do Programa");
    sair.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
    System.exit(0);
    }
    });    
    JMenuItem voltar = new  JMenuItem("Voltar para o Mapa");
    voltar.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
    jt1p2.dispose();
    ConfJanela.getInstancia().setVisible(true);
    Som.play("BGM_MAPA");
    }
    });  

    menu.add(sobre);
    menu.add(sair);
    opcoes.add(voltar);
    barramenu.add(menu);
    barramenu.add(opcoes);
    jt1p2.setJMenuBar(barramenu);           

    jt1p2.add(new FaseT1P2());//Vai criar uma fase na janela
    
    jt1p2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);// Este método permite fechar a tela do jogo ao clicar no X na parte direita superior. 
    jt1p2.setSize(1900,980);// Este método vai criar o tamalho da janela, neste caso x=coluna e y=linha, nesta ordem
    jt1p2.setLocationRelativeTo(null);//Este método vai fazer com que a tela fique no centro da tela do pc.     
    jt1p2.setVisible(true);// Este método faz com que a tela apareça.
    jt1p2.setResizable(false);// Este método vai fazer com que o usuario não consiga alterar o tamanho da tela.
  
    }

public static JFrame getInstancia(){
    return jt1p2;
}
}
